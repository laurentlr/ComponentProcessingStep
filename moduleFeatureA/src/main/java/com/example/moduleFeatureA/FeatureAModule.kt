package com.example.moduleFeatureA

import dagger.Binds
import dagger.Module

@Module
internal abstract class FeatureAModule {
    @Binds internal abstract fun bindFeatureA(foobar: FeatureAFooImpl): FeatureAFoo
}
