package com.learn.muddle.core

import androidx.room.Database
import androidx.room.RoomDatabase
import com.learn.muddle.data.local.LoginDao
import com.learn.muddle.data.local.entity.UserEntity

@Database(
 entities = [UserEntity::class],
    version = 1,
    exportSchema = false
)
abstract class UserDatabase: RoomDatabase() {
    abstract val loginDao: LoginDao


}