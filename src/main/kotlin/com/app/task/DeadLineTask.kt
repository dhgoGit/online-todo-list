package com.app.task

import java.util.Date

class DeadLineTask(
    override val taskName: String,
    override val memo: String,
    var deadLine:Date
) :Task {
    override fun print(): String =run{
        """
            |taskName : $taskName,
            |memo : $memo,
            |deadLine : $deadLine
            |end!
        """.trimMargin()
    }
}