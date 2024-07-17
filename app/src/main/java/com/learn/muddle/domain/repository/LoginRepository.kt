package com.learn.muddle.domain.repository

import com.learn.muddle.domain.model.UserModel

interface LoginRepository {

    suspend fun loginUser( userModel: UserModel)
}