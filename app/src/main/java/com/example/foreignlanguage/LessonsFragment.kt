package com.example.foreignlanguage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class LessonsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_lessons, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//         Добавь обработчик нажатия для перехода к разделу "Упражнения"
        view.findViewById<Button>(R.id.buttonEnglishLessonsFragment).setOnClickListener {
            findNavController().navigate(R.id.action_lessonsFragment_to_englishLessonsFragment)
        }
        view.findViewById<Button>(R.id.buttonJapaneseLessonsFragment).setOnClickListener {
            findNavController().navigate(R.id.action_lessonsFragment_to_japanesLessonsFragment)
        }
    }
}