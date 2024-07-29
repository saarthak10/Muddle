package com.learn.muddle.core

import android.app.Application
import android.content.Context
import android.content.res.Resources
import androidx.room.Room
import com.learn.muddle.core.utils.Appwrite
import com.learn.muddle.data.repository.LoginRepositoryImpl
import com.learn.muddle.domain.repository.LoginRepository
import com.learn.muddle.domain.usecase.LoginUsecase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import io.appwrite.Client
import javax.inject.Singleton

@InstallIn(SingletonComponent :: class)
@Module
object AppModule {





    @Provides
    @Singleton
    fun provideAppwriteInstance(@ApplicationContext context: Context):Appwrite{
        return Appwrite(context)
    }

}