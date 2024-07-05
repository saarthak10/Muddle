package com.learn.muddle.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.learn.muddle.core.UserModel

@Entity
data class UserEntity(
    @PrimaryKey val id: String = "",
    val email:String,
    val name: String,
    val authToken: String,
) {
    fun toUserModel(): UserModel {
        return UserModel(
            id = id,
            email = email,
            password = "",
            authToken = authToken
        )
    }
}