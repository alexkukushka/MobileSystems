package com.example.android.dessertpusher

import android.app.Application
import android.content.Context
import timber.log.Timber

class PusherApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }


}