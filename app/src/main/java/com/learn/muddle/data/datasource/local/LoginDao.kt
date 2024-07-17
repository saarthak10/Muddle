package com.learn.muddle.data.datasource.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.learn.muddle.data.datasource.local.entity.UserEntity

@Dao
interface LoginDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUser(user: UserEntity)

    @Query("DELETE FROM UserEntity WHERE id IS (:id) ")
    suspend fun deleteUser(id: String)

    @Query("SELECT * FROM UserEntity WHERE id IS (:id)")
    suspend fun getUser(id: String): UserEntity

}