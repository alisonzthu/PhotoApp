package com.example.macstudio.submissionappalison.viewModels

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import javax.inject.Inject
import javax.inject.Provider
import javax.inject.Singleton

@Singleton
class ViewModelFactory(): ViewModelProvider.Factory {

    @Inject
    lateinit var imagesProvider: Provider<ImageListViewModel>

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ImageListViewModel::class.java)) {
            return imagesProvider.get() as T
        }

        //todo: what about imageViewModel?

        throw IllegalArgumentException("Unknown ViewModel class")
    }
}