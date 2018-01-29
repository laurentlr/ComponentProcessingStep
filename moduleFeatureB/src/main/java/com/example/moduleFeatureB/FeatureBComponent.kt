package com.example.moduleFeatureB

import com.example.moduleCore.CoreComponent
import dagger.Component

@Component(
    dependencies = [CoreComponent::class],
    modules = [FeatureBModule::class]
)
interface FeatureBComponent {

    val featureBFoo: FeatureBFoo
}
