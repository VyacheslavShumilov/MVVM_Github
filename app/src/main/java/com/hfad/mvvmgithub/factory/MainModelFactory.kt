package com.hfad.mvvmgithub.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.hfad.mvvmgithub.main_viewmodel.MainViewModel
import com.hfad.mvvmgithub.repository.MainRepository

class MainModelFactory constructor(private val repository: MainRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(MainViewModel::class.java)){
            MainViewModel(this.repository) as T
        }else{
            throw IllegalArgumentException("ViewModel not found")
        }
    }
}