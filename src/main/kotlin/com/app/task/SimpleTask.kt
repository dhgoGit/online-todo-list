package com.app.task

class SimpleTask(
    override val taskName: String,
    override val memo: String) :Task {
    override fun print(): String =run{
        """
            |taskName : $taskName,
            |memo : $taskName
        """.trimMargin()
    }
}