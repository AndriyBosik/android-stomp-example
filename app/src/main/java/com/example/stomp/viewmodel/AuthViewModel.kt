package com.example.stomp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AuthViewModel: ViewModel() {

    val name: MutableLiveData<String> = MutableLiveData("")
    //val name: LiveData<String> = _name

    fun showName() {
        println(name.value)
    }
}