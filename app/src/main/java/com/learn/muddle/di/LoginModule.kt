package com.learn.muddle.di

import android.app.Application
import android.content.Context
import android.content.res.Resources
import androidx.room.Room
import com.learn.muddle.core.utils.Appwrite
import com.learn.muddle.data.repository.LoginRepositoryImpl
import com.learn.muddle.domain.repository.LoginRepository
import com.learn.muddle.domain.usecase.LoginUsecase
import com.learn.muddle.ui.presentation.authentication.login.LoginViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import io.appwrite.Client
import javax.inject.Singleton

@InstallIn(SingletonComponent :: class)
@Module
object LoginModule {

    @Provides
    @Singleton
    fun provideLoginViewModel(loginUsecase: LoginUsecase):LoginViewModel{
        return LoginViewModel(loginUsecase)
    }

    @Provides
    @Singleton
    fun provideLoginUsecase(repository: LoginRepository):LoginUsecase{
        return LoginUsecase( repository)
    }


    @Provides
    @Singleton
    fun provideLoginRepository( appwrite: Appwrite):LoginRepository{
        return LoginRepositoryImpl(appwrite)

    }

}