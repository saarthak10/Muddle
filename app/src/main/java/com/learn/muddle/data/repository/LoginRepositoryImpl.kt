package com.learn.muddle.data.repository

import com.learn.muddle.core.utils.Appwrite
import com.learn.muddle.domain.model.UserModel
import com.learn.muddle.domain.repository.LoginRepository
import javax.inject.Inject

/**
 * Usually repository implementation has datasource as its dependency , currently giving singleton Appwrite class as its dependency
 */
class LoginRepositoryImpl(private val appWrite: Appwrite) : LoginRepository {
    override suspend fun loginUser(userModel: UserModel) {
        appWrite.onRegister(email = userModel.email, password = userModel.password)
    }


}