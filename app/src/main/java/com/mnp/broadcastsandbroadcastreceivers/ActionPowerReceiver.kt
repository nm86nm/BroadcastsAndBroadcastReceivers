package com.mnp.broadcastsandbroadcastreceivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class ActionPowerReceiver : BroadcastReceiver() {
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

    override fun onReceive(context: Context?, intent: Intent?) {
        /*if (intent?.action == "android.intent.action.ACTION_POWER_CONNECTED") {
            Toast.makeText(context, "Device connected to charger", Toast.LENGTH_LONG).show()
            context?.registerReceiver(actionPowerConnected, IntentFilter("android.intent.action.ACTION_POWER_CONNECTED"))
        } else if(intent?.action == "android.intent.action.ACTION_POWER_DISCONNECTED"){
            Toast.makeText(context, "Device disconnected from charger", Toast.LENGTH_LONG).show()
            context?.registerReceiver(actionPowerDisconnected, IntentFilter("android.intent.action.ACTION_POWER_DISCONNECTED"))
        }*/
    }
}