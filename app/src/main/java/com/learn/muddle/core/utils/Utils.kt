package com.learn.muddle.core.utils

import com.learn.muddle.R

object Utils {

    fun isValidEmail(email: String): Boolean {
        val emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$"
        return Regex(emailPattern).matches(email)
    }


    fun isValidPassword(password: String): Int {
        val uppercaseRegExp = Regex("(?=.*?[A-Z])")
        val lowercaseRegExp = Regex("(?=.*?[a-z])")
        val digitsRegExp = Regex("(?=.*?[0-9])")
        val specialCharRegExp = Regex("(?=.*?[#?!@$%^&*-])")
        val minLengthRegExp = Regex(".{8,}")
        return when {
//            !minLengthRegExp.containsMatchIn(password) -> R.string.str_err_password_length
            !lowercaseRegExp.containsMatchIn(password) -> R.string.str_err_password_lowercase
            !uppercaseRegExp.containsMatchIn(password) -> R.string.str_err_password_uppercase
            !digitsRegExp.containsMatchIn(password) -> R.string.str_err_password_digit
            !specialCharRegExp.containsMatchIn(password) -> R.string.str_err_password_special
            else -> {
                return R.string.str_no_error
            }
        }
    }
}

