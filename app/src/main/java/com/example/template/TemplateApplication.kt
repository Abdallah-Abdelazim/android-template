package com.example.template

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext

// TODO rename this class to your app name
class TemplateApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        setupKoinDi()
    }

    private fun setupKoinDi() {
        GlobalContext.startKoin {
            androidLogger()
            androidContext(this@TemplateApplication)
            modules(
                // TODO add your modules here
            )
        }
    }

}