package com.example.marsphotos

import android.app.Application
import com.example.marsphotos.data.AppContainer
import com.example.marsphotos.data.DefaultAppContainer

class MarsPhotosApplication : Application() {
    lateinit var container: AppContainer
        fun  OnCreate(){
        super.onCreate()
        container=DefaultAppContainer()
    }
}