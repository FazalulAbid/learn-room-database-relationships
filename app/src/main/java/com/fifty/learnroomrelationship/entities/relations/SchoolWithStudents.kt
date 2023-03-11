package com.fifty.learnroomrelationship.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.fifty.learnroomrelationship.entities.School
import com.fifty.learnroomrelationship.entities.Student

data class SchoolWithStudents(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val students: List<Student>
)
