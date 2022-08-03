package com.example.mvvmdemo.roomdata

import androidx.lifecycle.LiveData
import androidx.room.*
import org.jetbrains.annotations.NotNull
import java.util.*

@Dao
interface UserDao {
    @NotNull  @Insert(onConflict = OnConflictStrategy.REPLACE) //if some data is same/conflict, it'll be replace with new data.
    suspend fun insertUser(user: User)

    @Update @NotNull
    suspend fun updateUser(user: User)



    @Query("SELECT * FROM user_table ORDER BY id DESC")
    fun getAllUsers(): LiveData<List<User>>
    // why not use suspend ? because Room does not support LiveData with suspended functions.
    // LiveData already works on a background thread and should be used directly without using coroutines


    @Delete
    suspend fun deleteUser(user: User)
/*
    @Query("DELETE FROM user_table")
    suspend fun clearUser()

    @Query("DELETE FROM user_table WHERE id = :id") //you can use this too, for delete user by id.
    suspend fun deleteUserById(id: Int)
*/
}