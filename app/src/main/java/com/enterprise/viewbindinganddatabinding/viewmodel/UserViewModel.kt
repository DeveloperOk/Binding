package com.enterprise.viewbindinganddatabinding.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.enterprise.viewbindinganddatabinding.model.UserData

class UserViewModel: ViewModel() {

    val idTestData = "123"
    val nameTestData = "Fahrettin"
    val surnameTestData = "Ok"

    var id: MutableLiveData<String?>? = MutableLiveData<String?>()
    var name: MutableLiveData<String?>? = MutableLiveData<String?>()
    var surname: MutableLiveData<String?>? = MutableLiveData<String?>()

    fun onClickShowButton(){

        id?.postValue(idTestData)
        name?.postValue(nameTestData)
        surname?.postValue(surnameTestData)

    }

}