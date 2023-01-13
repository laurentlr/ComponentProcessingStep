package com.example.moduleFeatureB

import com.example.moduleCore.CoreComponent
import dagger.Component

@Component(
    dependencies = [CoreComponent::class],
    modules = [FeatureBModule::class]
)
abstract class FeatureBComponent {

    internal abstract val featureBFoo: FeatureBFoo
}
