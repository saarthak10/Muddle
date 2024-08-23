package com.learn.muddle.di

import com.learn.muddle.data.repository.LoginRepositoryImpl
import com.learn.muddle.domain.repository.LoginRepository
import com.learn.muddle.domain.usecase.LoginUsecase
import com.learn.muddle.ui.presentation.authentication.login.LoginViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
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
    fun provideLoginRepository( ):LoginRepository{
        return LoginRepositoryImpl()

    }

}