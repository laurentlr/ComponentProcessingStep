package com.example.moduleNetwork

import dagger.Binds
import dagger.Module

@Module
interface NetworkModule {
    @Binds
    fun bindNetwork(impl: NetworkFooImpl): NetworkFoo
}
