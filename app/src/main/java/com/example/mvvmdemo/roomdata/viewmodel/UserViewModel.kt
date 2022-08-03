package com.example.mvvmdemo.roomdata.viewmodel

import androidx.lifecycle.ViewModel
import com.example.mvvmdemo.roomdata.User
import com.example.mvvmdemo.roomdata.repository.UserRepository

class UserViewModel(
    private val repository: UserRepository
): ViewModel() {

    suspend fun insertUser(user: User) = repository.insertUser(user)

    suspend fun updateUser(user: User) = repository.updateUser(user)

/*
    suspend fun deleteUser(user: User) = repository.deleteUser(user)

    suspend fun deleteUserById(id: Int) = repository.deleteUserById(id)

    suspend fun clearUser() = repository.clearUser()
*/

    fun getAllUsers() = repository.getAllUsers()
}