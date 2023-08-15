package com.example.to_docompose.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.to_docompose.util.Constants.DATABASE_TABLE

// This data class is used to create table in out database
// each variable will represent a column in the table
@Entity(DATABASE_TABLE)
data class ToDoTask(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String,
    val priority: Priority
)