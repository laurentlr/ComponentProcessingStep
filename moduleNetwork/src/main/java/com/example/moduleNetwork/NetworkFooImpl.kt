package com.example.moduleNetwork

import javax.inject.Inject

class NetworkFooImpl @Inject constructor() : NetworkFoo {

    override fun someNetworkStuff() {
        println("NetworkFooImpl someNetworkStuff")
    }

}
