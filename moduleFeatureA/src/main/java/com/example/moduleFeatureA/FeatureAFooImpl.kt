package com.example.moduleFeatureA

import com.example.moduleNetwork.NetworkFoo
import javax.inject.Inject

internal class FeatureAFooImpl @Inject constructor(
    private val networkFoo: NetworkFoo,

    ) : FeatureAFoo {

    override fun bla() {
        println("FeatureAFooImpl bla")
        networkFoo.someNetworkStuff()
    }
}
