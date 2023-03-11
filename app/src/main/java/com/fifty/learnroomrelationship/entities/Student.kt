package com.fifty.learnroomrelationship.entities

import androidx.room.PrimaryKey

data class Student(
    @PrimaryKey(autoGenerate = false)
    val student: String,
    val semester: Int,
    val schoolName: String
)
