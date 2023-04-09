package com.example.template

import android.app.Application
import com.example.template.di.uiModule
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
                uiModule,
                // TODO add your modules here
            )
        }
    }

}