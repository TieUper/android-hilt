package com.example.android.hilt.di

import com.example.android.hilt.data.Log


interface LoggerDataSource {

    fun addLog(msg: String)
    fun getAllLogs(callback:(List<Log>)-> Unit)
    fun removeLogs()
}