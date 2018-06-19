package com.example.macstudio.submissionappalison.dependecyInjection

import com.example.macstudio.submissionappalison.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class BuildersModule {
    @ContributesAndroidInjector
    abstract fun bindMainActivity() : MainActivity
}