package com.example.macstudio.submissionappalison.dependecyInjection

import com.example.macstudio.submissionappalison.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * All activities intended to use Dagger2 @Inject should be listed here
 */
@Module
abstract class ActivityModule {
    @ContributesAndroidInjector
    internal abstract fun contributeMainActivity(): MainActivity

//    @ContributesAndroidInjector
//    internal abstract fun contributePasswordActivity(): PasswordActivity
}