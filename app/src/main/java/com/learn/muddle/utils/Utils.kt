package com.learn.muddle.utils

object Utils {

    fun isValidEmail(email:String):Boolean{
        val emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$"
        return Regex(emailPattern).matches(email)
    }


    fun isValidPassword(password:String):Boolean{
        var error = ""
        return true
    }

}