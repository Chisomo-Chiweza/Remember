package com.example.remember.model

data class Task(val taskName: String, val dueDate: String, val status: Status)

enum class Status {
    PENDING, STARTED, COMPLETED, OVERDUE
}
