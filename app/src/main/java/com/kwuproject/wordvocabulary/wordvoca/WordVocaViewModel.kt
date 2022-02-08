package com.kwuproject.wordvocabulary.wordvoca

import android.app.Application
import androidx.lifecycle.ViewModel
import com.kwuproject.wordvocabulary.database.WordDatabaseDao

class WordVocaViewModel(
    dataSource: WordDatabaseDao,
    application: Application) : ViewModel() {

    val database = dataSource


}