package com.example.remember.data

import com.example.remember.model.Status
import com.example.remember.model.Task

class DataSource {

    fun loadTasks(): List<Task> {
        return listOf<Task>(
            Task(
                taskName = "Implement RecyclerView",
                dueDate = "28/07/2022",
                status = Status.COMPLETED),
            Task(
                taskName = "Clean up code",
                dueDate = "28/07/2022",
                status = Status.STARTED),
            Task(
                taskName = "Push changes to git repo",
                dueDate = "29/07/2022",
                status = Status.PENDING)
        )
    }


}