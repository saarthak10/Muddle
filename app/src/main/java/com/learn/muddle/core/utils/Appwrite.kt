package com.learn.muddle.core.utils

import android.content.Context
import io.appwrite.Client
import io.appwrite.ID
import io.appwrite.models.*
import io.appwrite.services.*
class Appwrite(private val context: Context) {

    lateinit var client: Client
    lateinit var account: Account

    fun init() {
        client = Client(context = context )
            .setEndpoint("https://cloud.appwrite.io/v1")
            .setProject("668689ac003cf669193d")

        account = Account(client)
    }

    suspend fun onLogin(
        email: String,
        password: String,
    ): Session {
        return account.createEmailPasswordSession(
            email,
            password,
        )
    }

    suspend fun onRegister(
        email: String,
        password: String,
    ): User<Map<String, Any>> {
        return account.create(
            userId = ID.unique(),
            email,
            password,
        )
    }

    suspend fun onLogout() {
        account.deleteSession("current")
    }
}