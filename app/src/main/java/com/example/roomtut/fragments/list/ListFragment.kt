package com.example.roomtut.fragments.list

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.roomtut.R
import com.example.roomtut.model.Word
import com.example.roomtut.viewmodel.WordViewModel
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.custom_row.*
import kotlinx.android.synthetic.main.fragment_list.*
import kotlinx.android.synthetic.main.fragment_list.view.*
import org.w3c.dom.Text

class ListFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private lateinit var mWordViewModel: WordViewModel
    private val adapter = ListAdapter(
            onLastItemBound = { offset ->
                Log.d("kek", "last item bound, items count: $offset")
                loadNextPage(query = view?.search?.text?.toString() ?: "", offset = offset)
            }
    )
    private var items: List<Word> = emptyList()
    private var canLoadMore = true


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_list, container, false)

        // Inflate the layout for this fragment
        val recycler = view.mylist
        recycler.adapter = adapter
        recycler.layoutManager = LinearLayoutManager(requireContext())

        mWordViewModel = ViewModelProvider(this).get(WordViewModel::class.java)

        loadNextPage(query = view.search.text?.toString() ?: "", offset = 0)

        view.search.addTextChangedListener(textWatcher)

        view.floatingActionButton.setOnClickListener {
            findNavController().navigate(R.id.action_listFragment_to_addFragment)
            }
        return view
    }

    private fun loadNextPage(query: String, offset: Int) {
        if (canLoadMore.not()) return

        val liveData = when (query.isEmpty()) {
            true -> mWordViewModel.loadAllWords(pageSize = PAGE_SIZE, offset = offset)
            false -> mWordViewModel.filterWords(word = query, pageSize = PAGE_SIZE, offset = offset)
        }
        Log.d("kek", "start load next page: $offset")
        liveData.observe(viewLifecycleOwner, { words ->
            canLoadMore = words.size == PAGE_SIZE
            val newList = if (offset == 0) words else items + words
            items = newList
            adapter.setData(items)
            Log.d("kek", "loaded items count: ${words.size}")
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





