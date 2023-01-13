package com.example.moduleCore

import dagger.Binds
import dagger.Module

@Module
abstract class CoreModule {
    @Binds
    internal abstract fun bindCoreFoo(impl: CoreFooImpl): CoreFoo
}
