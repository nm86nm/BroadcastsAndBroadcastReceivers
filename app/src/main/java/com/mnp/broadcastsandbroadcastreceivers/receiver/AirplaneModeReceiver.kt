package com.mnp.broadcastsandbroadcastreceivers.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class AirplaneModeReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context, "Airplane mode changed", Toast.LENGTH_LONG).show()
        Log.i("TAG", "<!><!><!>Airplane mode changed")
    }
}