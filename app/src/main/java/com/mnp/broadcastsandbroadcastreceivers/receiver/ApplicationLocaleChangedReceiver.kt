package com.mnp.broadcastsandbroadcastreceivers.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class ApplicationLocaleChangedReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context, "Application locale changed", Toast.LENGTH_LONG).show()
        Log.i("TAG", "<!><!><!>Application locale changed")
    }
}