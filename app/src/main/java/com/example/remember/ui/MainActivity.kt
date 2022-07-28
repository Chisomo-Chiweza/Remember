package com.example.remember.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.remember.adapter.TaskAdapter
import com.example.remember.data.DataSource
import com.example.remember.databinding.HomeBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: HomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = HomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val taskDataset = DataSource().loadTasks()
        val taskRecyclerView = binding.taskRecyclerview
        taskRecyclerView.adapter = TaskAdapter(taskDataset)
        taskRecyclerView.setHasFixedSize(true)


    }

}