package com.kwuproject.wordvocabulary.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ColumnInfo

@Entity(tableName = "word_vocabulary_table")
data class WordVocabulary (
    @PrimaryKey(autoGenerate = true)
    var wordId: Long = 0L,

    @ColumnInfo(name = "word_name")
    var wordName: String = "",

    @ColumnInfo(name = "word_voca")
    var wordVoca: String = ""
)