package com.fifty.learnroomrelationship.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.fifty.learnroomrelationship.entities.Student
import com.fifty.learnroomrelationship.entities.Subject

data class SubjectWithStudents(
    @Embedded val subject: Subject,
    @Relation(
        parentColumn = "subjectName",
        entityColumn = "studentName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val students: List<Student>
)