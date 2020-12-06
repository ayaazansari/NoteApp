package com.example.noteapp

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface NoteDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(note:Note)

    @Delete
    suspend fun delete(note:Note)

    @Query("Select * from NoteApp order by id ASC")
    fun getAllNotes() :LiveData<List<Note>>
}