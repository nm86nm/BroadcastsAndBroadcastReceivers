package com.mnp.broadcastsandbroadcastreceivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class BatteryReceiver {

    val batteryReceiver : BroadcastReceiver = object : BroadcastReceiver(){
        override fun onReceive(context: Context?, intent: Intent?) {
            Log.i("TAG", "<!><!><!>Battery level changed")
            Toast.makeText(context, "Battery level changed", Toast.LENGTH_LONG).show()
        }
    }
}