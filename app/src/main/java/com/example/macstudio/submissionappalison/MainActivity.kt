package com.example.macstudio.submissionappalison

import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.macstudio.submissionappalison.common.CommonHelloService
import com.example.macstudio.submissionappalison.viewModels.ImageListViewModel
import com.example.macstudio.submissionappalison.viewModels.ViewModelFactory
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var commonHelloService: CommonHelloService

//    @Inject
//    lateinit var viewModelFactory: ViewModelFactory
//
//    lateinit var viewModel: ImageListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        viewModel = ViewModelProviders.of(this, viewModelFactory).get(ImageListViewModel::class.java)
    }
}
