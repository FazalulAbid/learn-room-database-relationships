package com.fifty.learnroomrelationship.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.fifty.learnroomrelationship.entities.Student
import com.fifty.learnroomrelationship.entities.Subject

data class StudentWithSubjects(
    @Embedded val student: Student,
    @Relation(
        parentColumn = "studentName",
        entityColumn = "subjectName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val subjects: List<Subject>
)