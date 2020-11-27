package com.example.roomtut.fragments.list

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.widget.addTextChangedListener
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.roomtut.R
import com.example.roomtut.model.RussianWord
import com.example.roomtut.model.Word
import com.example.roomtut.viewmodel.WordViewModel
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.custom_row.*
import kotlinx.android.synthetic.main.fragment_list.*
import kotlinx.android.synthetic.main.fragment_list.view.*
import org.w3c.dom.Text

class ListFragment : Fragment() {
    private lateinit var mWordViewModel: WordViewModel
    private var russianwords: List<RussianWord> = emptyList()
    private var canLoadMore = true


    val russianAdapter = RussianListAdapter(
        onLastItemBound = { offset ->
            loadNextPage(query = view?.search?.text?.toString() ?: "", offset = offset)
        }
    )


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val view = inflater.inflate(R.layout.fragment_list, container, false)


        // Inflate the layout for this fragment
        val recycler = view?.mylist
        recycler?.adapter = russianAdapter
        recycler?.layoutManager = LinearLayoutManager(requireContext())



        mWordViewModel = ViewModelProvider(this).get(WordViewModel::class.java)

        loadNextPage(query = view.search.text?.toString() ?: "", offset = 0)

        view.search.addTextChangedListener(textWatcher)

        view.switch_lang.setOnClickListener {
            findNavController().navigate(R.id.action_listFragment_to_nanayDictFragment)
        }

        view.floatingActionButton.setOnClickListener {
            findNavController().navigate(R.id.action_listFragment_to_addRussianFragment)
        }
        return view
    }

    private fun loadNextPage(query: String, offset: Int) {
        if (canLoadMore.not()) return


            val liveData = when (query.isEmpty()) {

                true ->
                    mWordViewModel.loadAllRussianWords(pageSize = PAGE_SIZE, offset = offset)
                false ->
                    mWordViewModel.filterRussianWords(
                        word = query,
                        pageSize = PAGE_SIZE,
                        offset = offset
                    )
            }
            liveData.observe(viewLifecycleOwner, { words ->
                canLoadMore = words.size == PAGE_SIZE
                val newList = if (offset == 0) words else russianwords + words
                russianwords = newList
                russianAdapter.setData(russianwords)
            })

    }

    private val textWatcher = object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) = Unit
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) = Unit
            override fun onTextChanged(s: CharSequence?, p1: Int, p2: Int, p3: Int) {
                canLoadMore = true
                loadNextPage(query = s?.toString() ?: "", offset = 0)
            }
    }

    companion object {
        private const val PAGE_SIZE = 10
    }

}





