package com.learn.muddle.utils

import androidx.compose.ui.res.stringResource
import com.learn.muddle.R

object Utils {

    fun isValidEmail(email:String):Boolean{
        val emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$"
        return Regex(emailPattern).matches(email)
    }


    fun isValidPassword(password:String):Boolean{
        val uppercaseRegExp = Regex("(?=.*?[A-Z])")
        val lowercaseRegExp = Regex("(?=.*?[a-z])")
        val digitsRegExp = Regex("(?=.*?[0-9])")
        val specialCharRegExp = Regex("(?=.*?[#?!@$%^&*-])")
        val minLengthRegExp = Regex(".{8,}")
        return false
    }

}