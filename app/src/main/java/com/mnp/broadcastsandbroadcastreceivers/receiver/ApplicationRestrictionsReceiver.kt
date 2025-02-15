package com.mnp.broadcastsandbroadcastreceivers.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.RestrictionsManager
import android.os.Bundle
import android.util.Log

class ApplicationRestrictionsReceiver : BroadcastReceiver(){
    override fun onReceive(context: Context?, intent: Intent?) {
        if(intent?.action == Intent.ACTION_APPLICATION_RESTRICTIONS_CHANGED){
            Log.i("TAG", "<!><!><!>Application restrictions changed")
            val restrictionsMamager = context?.getSystemService(Context.RESTRICTIONS_SERVICE) as RestrictionsManager
            val restrictions: Bundle? = restrictionsMamager.applicationRestrictions

            if(restrictions != null){
              for (key in restrictions.keySet()){
                val value = restrictions.get(key)
                Log.i("TAG", "<!><!><!>Key: $key, Value: $value")
              }
            }
        }
    }
}