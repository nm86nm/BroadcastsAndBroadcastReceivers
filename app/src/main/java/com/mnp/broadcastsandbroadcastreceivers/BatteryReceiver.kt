package com.mnp.broadcastsandbroadcastreceivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class BatteryReceiver {

    val batteryChanged : BroadcastReceiver = object : BroadcastReceiver(){
        override fun onReceive(context: Context?, intent: Intent?) {
            Log.i("TAG", "<!><!><!>Battery level changed")
            Toast.makeText(context, "Battery level changed", Toast.LENGTH_LONG).show()
        }
    }

    val batteryLow : BroadcastReceiver = object : BroadcastReceiver(){
        override fun onReceive(context: Context?, intent: Intent?) {
            Log.i("TAG", "<!><!><!>Battery low")
            Toast.makeText(context, "Battery low", Toast.LENGTH_LONG).show()
        }
    }

    val batteryOkay : BroadcastReceiver = object : BroadcastReceiver(){
        override fun onReceive(context: Context?, intent: Intent?) {
            Log.i("TAG", "<!><!><!>Battery okay")
            Toast.makeText(context, "Battery okay", Toast.LENGTH_LONG).show()
        }
    }
}