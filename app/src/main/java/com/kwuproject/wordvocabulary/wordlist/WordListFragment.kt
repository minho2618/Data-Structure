package com.kwuproject.wordvocabulary.wordlist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kwuproject.wordvocabulary.R
import com.kwuproject.wordvocabulary.databinding.FragmentWordListBinding
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import com.kwuproject.wordvocabulary.database.WordDatabase

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [WordListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class WordListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentWordListBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_word_list, container, false)

        val application = requireNotNull(this.activity).application


        val dataSource = WordDatabase.getInstance(application).wordDatabaseDao
        val viewModelFactory = WordListViewModelFactory(dataSource, application)

        val wordListViewModel = ViewModelProvider(this, viewModelFactory).get(WordListViewModel::class.java)

        binding.wordListViewModel = wordListViewModel

        binding.setLifecycleOwner(this)


        // Inflate the layout for this fragment
        return binding.root
    }
}