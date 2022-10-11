package com.hfad.mvvmgithub.repository

import com.hfad.mvvmgithub.services.Api

class UserRepository(private val api: Api) {
    suspend fun getUser(login: String) = api.getUser(login)
}