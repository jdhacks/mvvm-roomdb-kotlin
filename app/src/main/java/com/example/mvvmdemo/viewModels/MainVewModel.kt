package com.example.mvvmdemo.viewModels

import android.util.Log
import androidx.lifecycle.*
import com.example.mvvmdemo.MainActivity
import com.example.mvvmdemo.roomdata.User
import com.example.mvvmdemo.roomdata.repository.UserRepository
import com.example.mvvmdemo.utils.Event
import com.google.gson.Gson
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainVewModel (public val repository: UserRepository) : ViewModel() {

    val inputName = MutableLiveData<String>()
    val inputDob = MutableLiveData<String>()
    val inputGender = MutableLiveData<String>()
    var saveOrUpdateButtonText = MutableLiveData<String>()
    val clearAllOrDeleteButtonText = MutableLiveData<String>()
    private val statusMessage = MutableLiveData<Event<String>>()
    init {
        saveOrUpdateButtonText.value = "Save"
        clearAllOrDeleteButtonText.value = "Clear All"
    }

    fun saveOrUpdate() {

        if (inputName.value == null) {
            statusMessage.value = Event("Please enter subscriber's name")
        } else if (inputDob.value == null) {
            statusMessage.value = Event("Please enter subscriber's email")
        }else if (inputGender.value == null) {
            statusMessage.value = Event("Please enter subscriber's email")
        } else {
            val name = inputName.value!!
            val dob = inputDob.value!!
            val gender = inputGender.value!!
            if(saveOrUpdateButtonText.value.equals("Save")) {
                insertUser(User(name, dob, gender))
                saveOrUpdateButtonText.value ="Save"
            }else{
                updateUser(User(name, dob, gender))
                saveOrUpdateButtonText.value ="Save"

           }
            Log.e("TAG","user"+Gson().toJson(User(name, dob,gender)))
            inputName.value = ""
            inputDob.value = ""
            inputGender.value = ""
        }
    }

     fun deleteUser(user: User) =  CoroutineScope(Dispatchers.Main).launch {

        repository.deleteUser(user)
         statusMessage.value = Event(user.name+" Deleted Successfully ")

     }

    fun getAllUser() : LiveData<List<User>> {

     return repository.getAllUsers()

    }
    fun updateUser(user: User) =  CoroutineScope(Dispatchers.Main).launch {

        repository.updateUser(user)
        statusMessage.value = Event(user.name+" Deleted Successfully ")

    }

        private fun insertUser(user: User) =  CoroutineScope(Dispatchers.Main).launch {

        repository.insertUser(user)
      /* val newRowId =
        repository.insertUser(user).also {
            if(it > -1)
            statusMessage.value = Event("User Inserted Successfully")
            statusMessage.value = Event("Error Occurred")
    }
       if (newRowId > -1) {
            statusMessage.value = Event("User Inserted Successfully $newRowId")
        } else {
            statusMessage.value = Event("Error Occurred")
        }*/
    }


}