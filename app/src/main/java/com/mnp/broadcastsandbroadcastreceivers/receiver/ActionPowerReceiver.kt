package com.mnp.broadcastsandbroadcastreceivers.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class ActionPowerReceiver{
    val actionPowerConnected: BroadcastReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            Toast.makeText(context, "Device connected to charger", Toast.LENGTH_LONG).show()
        }
    }

    val actionPowerDisconnected: BroadcastReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            Toast.makeText(context, "Device disconnected from charger", Toast.LENGTH_LONG).show()
        }
    }
}