package com.example.nimrod.myapplication

import android.app.Activity
import android.os.Bundle
import com.example.moduleCore.DaggerCoreComponent
import com.example.moduleFeatureA.DaggerFeatureAComponent
import com.example.moduleFeatureA.FeatureAFoo
import com.example.moduleFeatureB.DaggerFeatureBComponent
import com.example.moduleFeatureB.FeatureBFoo
import javax.inject.Inject

class MainActivity : Activity() {

    @Inject
    lateinit var featureAFoo: FeatureAFoo

    @Inject
    lateinit var featureBFoo: FeatureBFoo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val coreComponent = DaggerCoreComponent
            .create()
        DaggerMainComponent
            .builder()
            .featureAComponent(
                DaggerFeatureAComponent
                    .builder()
                    .coreComponent(coreComponent)
                    .build()
            )
            .featureBComponent(
                DaggerFeatureBComponent
                    .builder()
                    .coreComponent(coreComponent)
                    .build()
            )
            .build()
            .inject(this)

        featureAFoo.bla()
    }
}
