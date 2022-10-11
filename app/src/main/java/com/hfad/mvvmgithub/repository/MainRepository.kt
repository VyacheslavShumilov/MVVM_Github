package com.hfad.mvvmgithub.repository

import com.hfad.mvvmgithub.services.Api

class MainRepository constructor(private val api: Api) {

    suspend fun getUserAll() = api.getUsers()
}