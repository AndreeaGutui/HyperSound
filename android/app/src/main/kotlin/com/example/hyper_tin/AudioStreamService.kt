package com.example.hyper_tin

import android.app.Service
import android.content.Intent
import android.os.IBinder

class AudioStreamService : Service() {
    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        // Aici începi să capturezi sunetul dacă ai nevoie
        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        // Oprește captarea sunetului aici dacă este cazul
    }
}
