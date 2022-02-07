package com.kwuproject.wordvocabulary.wordlist

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kwuproject.wordvocabulary.database.WordDatabaseDao
import com.kwuproject.wordvocabulary.database.WordVocabulary
import kotlinx.coroutines.launch

class WordListViewModel(dataSource: WordDatabaseDao, application: Application) : ViewModel() {
    private val database = dataSource

    val words= database.getWordList()


}
