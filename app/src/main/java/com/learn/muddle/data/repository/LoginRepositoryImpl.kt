package com.learn.muddle.data.repository

import com.learn.muddle.domain.model.UserModel
import com.learn.muddle.domain.repository.LoginRepository

/**
 * Usually repository implementation has datasource as its dependency , currently giving singleton Appwrite class as its dependency
 */
class LoginRepositoryImpl() : LoginRepository {
    override suspend fun loginUser(userModel: UserModel) {
      //  appWrite.onRegister(email = userModel.email, password = userModel.password)
    }


}