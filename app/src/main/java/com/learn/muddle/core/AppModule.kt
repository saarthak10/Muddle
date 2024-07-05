package com.learn.muddle.core

import android.app.Application
import android.content.Context
import android.content.res.Resources
import androidx.room.Room
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent :: class)
@Module
object AppModule {

    fun provideAppDatabase(app:Application):UserDatabase{
        return Room.databaseBuilder(
            app,
            UserDatabase::class.java,
            "User Database"
        ).build()
    }

    fun provideResources(context: Context):Resources{
        return context.resources
    }


}