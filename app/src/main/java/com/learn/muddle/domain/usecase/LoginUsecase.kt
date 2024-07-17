package com.learn.muddle.domain.usecase

import com.learn.muddle.domain.model.UserModel
import com.learn.muddle.domain.repository.LoginRepository

class LoginUsecase(private val repository: LoginRepository) {

    suspend operator fun  invoke(userModel: UserModel):Unit{
        return repository.loginUser(userModel)
    }

}