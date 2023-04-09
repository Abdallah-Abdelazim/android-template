package com.example.template.di

import com.example.template.ui.feature1.FirstViewModel
import com.example.template.ui.feature2.SecondViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val uiModule = module {

    viewModelOf(::FirstViewModel)

    viewModelOf(::SecondViewModel)

}