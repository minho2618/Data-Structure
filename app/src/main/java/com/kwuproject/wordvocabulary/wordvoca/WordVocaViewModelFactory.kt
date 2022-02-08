package com.kwuproject.wordvocabulary.wordvoca

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.kwuproject.wordvocabulary.database.WordDatabaseDao
import com.kwuproject.wordvocabulary.wordlist.WordListViewModel
import java.lang.IllegalArgumentException

class WordVocaViewModelFactory(
    private val dataSource: WordDatabaseDao,
    private val application: Application) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(WordListViewModel::class.java)) {
            return WordVocaViewModel(dataSource, application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }

}