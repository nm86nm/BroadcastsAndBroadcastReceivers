package com.mnp.broadcastsandbroadcastreceivers.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class ActionShutdownReceiver : BroadcastReceiver() {
    override fun onReceive(p0: Context?, p1: Intent?) {
        Log.d("TAG", "<!><!><!>Shutting down (message id: 123761)")
    }
}