package com.example.moduleCore

import com.example.moduleNetwork.NetworkFoo
import com.example.moduleNetwork.NetworkModule
import dagger.Component

@Component(
    modules = [
        CoreModule::class,
        NetworkModule::class
    ]
)
interface CoreComponent {

    val coreFoo: CoreFoo

    val networkFoo: NetworkFoo

}
