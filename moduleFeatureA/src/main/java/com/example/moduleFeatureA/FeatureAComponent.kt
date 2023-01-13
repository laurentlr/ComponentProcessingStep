package com.example.moduleFeatureA

import com.example.moduleCore.CoreComponent
import dagger.Component

@Component(
    dependencies = [CoreComponent::class],
    modules = [FeatureAModule::class]
)
abstract class FeatureAComponent {

    internal abstract val featureAFoo: FeatureAFoo
}
