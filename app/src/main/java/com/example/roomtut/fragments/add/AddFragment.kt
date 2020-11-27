package com.example.roomtut.fragments.add

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.roomtut.R
import com.example.roomtut.model.Word
import com.example.roomtut.viewmodel.WordViewModel
import kotlinx.android.synthetic.main.fragment_add.*
import kotlinx.android.synthetic.main.fragment_add.view.*


class AddFragment : Fragment() {
    private lateinit var mWordViewModel: WordViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_add, container, false)
        mWordViewModel = ViewModelProvider(this).get(WordViewModel::class.java)
        view.addbutton.setOnClickListener {
            insertDataToDataBase()
        }
        return view
    }

    private fun insertDataToDataBase(){
        val talysh = talysh_word.text.toString()
        val russian = russian.text.toString()


        if (inputCheck(talysh, russian)){
            val newWord = Word(0, talysh, russian)
            mWordViewModel.addWord(newWord)
            Toast.makeText(requireContext(), "Слово добавлено!", Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.action_addFragment_to_nanayDictFragment)
        } else {
            Toast.makeText(requireContext(), "Напишите слово!", Toast.LENGTH_SHORT).show()
        }

    }

    private fun inputCheck(talysh: String, russian: String): Boolean{
        return !(TextUtils.isEmpty(talysh) && TextUtils.isEmpty(russian))

    }
}