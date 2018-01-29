package com.example.nimrod.myapplication

import com.example.moduleFeatureA.FeatureAComponent
import com.example.moduleFeatureB.FeatureBComponent
import dagger.Component

@Component(
    dependencies = [
        FeatureAComponent::class,
        FeatureBComponent::class,
    ]
)
interface MainComponent {
    fun inject(mainActivity: MainActivity)
}
