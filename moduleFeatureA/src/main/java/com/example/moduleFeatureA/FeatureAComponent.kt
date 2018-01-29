package com.example.moduleFeatureA

import com.example.moduleCore.CoreComponent
import dagger.Component

@Component(
    dependencies = [CoreComponent::class],
    modules = [FeatureAModule::class]
)
interface FeatureAComponent {

    val featureAFoo: FeatureAFoo
}
