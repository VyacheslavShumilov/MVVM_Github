package com.hfad.mvvmgithub.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.hfad.mvvmgithub.repository.UserRepository
import com.hfad.mvvmgithub.user_viewmodel.UserViewModel

class UserModelFactory(private val repository: UserRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(UserViewModel::class.java)) {
            UserViewModel(this.repository) as T
        } else {
            throw IllegalArgumentException("UserModel not found")
        }
    }
}