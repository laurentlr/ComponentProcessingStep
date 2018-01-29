package com.example.moduleCore

import com.example.moduleNetwork.NetworkFoo
import javax.inject.Inject

class CoreFooImpl @Inject constructor(
    private val networkFoo: NetworkFoo,
) : CoreFoo {

    override fun bla() {
        println("CoreFooImpl bla")
        networkFoo.someNetworkStuff()
    }
}
