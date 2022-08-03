package com.example.mvvmdemo.roomdata.repository

import androidx.lifecycle.LiveData
import androidx.room.Entity
import com.example.mvvmdemo.roomdata.User
import com.example.mvvmdemo.roomdata.UserDatabase

class UserRepository(
    private val userDatabase: UserDatabase
) {

    suspend fun insertUser(user: User) = userDatabase.getUserDao().insertUser(user)

    suspend fun updateUser(user: User) = userDatabase.getUserDao().updateUser(user)

    suspend fun deleteUser(user: User) = userDatabase.getUserDao().deleteUser(user)
    /*   suspend fun deleteUserById(id: Int) = userDatabase.getUserDao().deleteUserById(id)

     suspend fun clearUser() = userDatabase.getUserDao().clearUser()*/

    fun getAllUsers(): LiveData<List<User>> = userDatabase.getUserDao().getAllUsers()
}