package com.fifty.learnroomrelationship.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Student(
    @PrimaryKey(autoGenerate = false)
    val student: String,
    val semester: Int,
    val schoolName: String
)
