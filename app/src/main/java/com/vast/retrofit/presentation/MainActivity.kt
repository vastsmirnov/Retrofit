package com.vast.retrofit.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.vast.retrofit.R
import com.vast.retrofit.databinding.ActivityMainBinding
import com.vast.retrofit.presentation.animals.list.AnimalListFragment
import com.vast.retrofit.presentation.animals.list.AnimalListViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .replace(binding.animalListFragment.id, AnimalListFragment.newInstance())
            .commit()
    }
}