package com.mnp.broadcastsandbroadcastreceivers.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class BootCompletedReceiver  : BroadcastReceiver(){
    override fun onReceive(context: Context?, intent: Intent?) {
        Log.i("TAG", "<!><!><!>Boot completed")
        Toast.makeText(context, "Boot completed", Toast.LENGTH_LONG).show()
    }
}