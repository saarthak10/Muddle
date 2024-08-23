package com.learn.muddle.core

import android.content.Context
import com.learn.muddle.data.repository.LoginRepositoryImpl
import com.learn.muddle.domain.repository.LoginRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent :: class)
@Module
object AppModule {


}