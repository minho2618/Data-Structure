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
        val binding: ViewDataBinding? = DataBindingUtil.inflate(
            inflater, R.layout.fragment_word_list, container, false
        )

        val application = requireNotNull(this.activity).application


        val dataSource = WordDatabase.getInstance(application).wordDatabaseDao
        val viewModelfactory = WordListViewModelFactory(dataSource, application)

        val wordListViewmodel = ViewModelProvider(this, viewModelfactory).get(WordListViewModel::class.java)

        binding.wordListViewModel = wordListViewModel


        // Inflate the layout for this fragment
        return binding.root
    }\

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment WordListFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            WordListFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}