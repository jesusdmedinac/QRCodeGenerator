package com.jesusdmedinac.qrcodegenerator

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform