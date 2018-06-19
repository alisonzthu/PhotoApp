package com.example.macstudio.submissionappalison

import android.app.Activity
import android.app.Application
import com.example.macstudio.submissionappalison.dependecyInjection.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class MyApplication: Application(), HasActivityInjector {
    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()

//        todo: understand how application is defined
        DaggerAppComponent
                .builder()
                .application(this)
                .build()
                .inject(this);
    }

    override fun activityInjector(): AndroidInjector<Activity> = activityInjector;

}