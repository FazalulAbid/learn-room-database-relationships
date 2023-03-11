package com.fifty.learnroomrelationship

import androidx.room.*
import com.fifty.learnroomrelationship.entities.Director
import com.fifty.learnroomrelationship.entities.School
import com.fifty.learnroomrelationship.entities.Student
import com.fifty.learnroomrelationship.entities.relations.SchoolAndDirector
import com.fifty.learnroomrelationship.entities.relations.SchoolWithStudents

@Dao
interface SchoolDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSchool(school: School)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDirector(director: Director)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertStudent(student: Student)

    @Transaction
    @Query("SELECT * FROM school WHERE schoolName = :schoolName")
    suspend fun getSchoolAndDirectorWithSchoolName(schoolName: String): List<SchoolAndDirector>

    @Transaction
    @Query("SELECT * FROM school WHERE schoolName = :schoolName")
    suspend fun getSchoolWithStudents(schoolName: String): List<SchoolWithStudents>
}