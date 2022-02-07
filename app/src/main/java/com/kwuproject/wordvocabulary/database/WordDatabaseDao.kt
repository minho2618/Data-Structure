package com.kwuproject.wordvocabulary.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface WordDatabaseDao {
    @Insert
    fun insert(vararg words: WordVocabulary)

    @Delete
    fun delete(word: WordVocabulary)

    @Query("SELECT * FROM word_vocabulary_table")
    fun getAll(): List<WordVocabulary>

    @Query("SELECT * FROM word_vocabulary_table WHERE word_name")
    fun getWordList(): List<String>
}