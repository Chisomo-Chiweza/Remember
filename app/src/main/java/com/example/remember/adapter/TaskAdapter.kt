package com.example.remember.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.remember.R
import com.example.remember.model.Task


class TaskAdapter(private val dataset: List<Task>) :
    RecyclerView.Adapter<TaskAdapter.TaskViewHolder>(){

    class TaskViewHolder(taskView: View) : RecyclerView.ViewHolder(taskView) {

        private var view = taskView
        val taskName: TextView = view.findViewById(R.id.task_name)
        val dueDate: TextView = view.findViewById(R.id.due_date)
        val status: TextView = view.findViewById(R.id.status)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {

        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.single_task, parent, false)

        return TaskViewHolder(adapterLayout)

    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {

        val item = dataset[position]
        holder.taskName.text = item.taskName
        holder.dueDate.text = item.dueDate
        holder.status.text = item.status.name

    }

    override fun getItemCount(): Int = dataset.size

}