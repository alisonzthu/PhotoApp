package com.example.macstudio.submissionappalison.dependecyInjection

import com.example.macstudio.submissionappalison.MyApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class, AppModule::class, BuildersModule::class])
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(myApplication: MyApplication): Builder

        fun build() : AppComponent
    }

    fun inject(myApplication: MyApplication)
}