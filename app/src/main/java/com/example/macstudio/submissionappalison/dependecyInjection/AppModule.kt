package com.example.macstudio.submissionappalison.dependecyInjection

import android.content.Context
import com.example.macstudio.submissionappalison.MyApplication
import com.example.macstudio.submissionappalison.common.CommonHelloService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule (){
    @Provides
    @Singleton
    fun provideApplication(app: MyApplication): Context = app;

    @Provides
    @Singleton
    fun provideCommonHelloService(): CommonHelloService {
        return CommonHelloService();
    }

//    @Provides
//    @Singleton
//    fun provideDatabase(app: MyApplication): AppDatabase {
////        TODO
//    }
//
//    @Provides
//    @Singleton
//    fun providePasswordDal(db: AppDatabase): PasswordDao {
//        //todo
//    }
//
//    @Provides
//    @Singleton
//    fun provideCategoryDao(db: AppDatabase): CategoryDao {
//        // todo
//    }
}