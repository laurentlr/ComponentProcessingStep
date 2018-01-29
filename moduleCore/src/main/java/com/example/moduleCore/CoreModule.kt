package com.example.moduleCore

import dagger.Binds
import dagger.Module

@Module
abstract class CoreModule {
    @Binds
    abstract fun bindCoreFoo(impl: CoreFooImpl): CoreFoo
}
