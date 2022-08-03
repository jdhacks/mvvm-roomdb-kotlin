package com.example.mvvmdemo.roomdata

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class User(
    val name: String?,
    val dob: String?,
    val gender: String?
){
    @PrimaryKey(autoGenerate = true)
    var id  = 0
}
