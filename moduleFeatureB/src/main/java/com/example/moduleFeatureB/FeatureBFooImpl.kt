package com.example.moduleFeatureB

import javax.inject.Inject

internal class FeatureBFooImpl @Inject constructor(
) : FeatureBFoo {

    override fun bla() {
        println("FeatureBFooImpl bla")
    }
}
