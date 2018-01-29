package com.example.moduleFeatureB

import dagger.Binds
import dagger.Module

@Module
internal abstract class FeatureBModule {
    @Binds
    internal abstract fun bindFeatureB(foobar: FeatureBFooImpl): FeatureBFoo
}
