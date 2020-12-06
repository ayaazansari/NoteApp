package com.example.noteapp

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "NoteApp")
class Note(@ColumnInfo(name = "Note_text")val text:String) {

    @PrimaryKey(autoGenerate = true)val id=0

}