package com.app.task

import com.app.utli.dateFactory
import com.app.utli.log
import io.kotest.core.spec.style.FeatureSpec

class PeriodTaskTest : FeatureSpec(){
    init {
        feature("기간이 있는 업무를 기록하는 클래스"){
            scenario("테스크 생성"){
                val task = PeriodTask(
                    taskName = "todoFor3Days",
                    memo = "오늘부터 내일 모레까지 할 일",
                    startDate = dateFactory.gen(2023,2,12),
                    endDate = dateFactory.gen(2023,3,1)
                )

                log.info(task.print())
            }
        }
    }
}