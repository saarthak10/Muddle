package com.learn.muddle.ui.presentation.authentication.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.learn.muddle.domain.model.UserModel
import com.learn.muddle.domain.usecase.LoginUsecase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val loginUsecase: LoginUsecase
):ViewModel() {

    suspend fun login(userModel: UserModel){

        viewModelScope.launch {
            loginUsecase.invoke(userModel)
        }
    }
}