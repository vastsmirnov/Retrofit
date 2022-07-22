package com.vast.retrofit.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vast.retrofit.R
import com.vast.retrofit.presentation.animals.AnimalListViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    private val animalListViewModel by viewModel<AnimalListViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        animalListViewModel.animalListLiveData.observe(this, {
            val a  = it
        })
    }
}