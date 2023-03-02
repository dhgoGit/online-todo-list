package com.app.utli

import mu.KotlinLogging

class log {
    companion object{
        val Log = KotlinLogging.logger{}
        fun info(str:String) = run{Log.info("테스크 출력 \n$str")}
    }
}