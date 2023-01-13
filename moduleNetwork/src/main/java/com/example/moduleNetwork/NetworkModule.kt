package com.example.moduleNetwork

import dagger.Binds
import dagger.Module

@Module
abstract class NetworkModule {
    @Binds
    internal abstract fun bindNetwork(impl: NetworkFooImpl): NetworkFoo
}
