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
abstract class CoreComponent {

    internal abstract val coreFoo: CoreFoo

    internal abstract val networkFoo: NetworkFoo

}
