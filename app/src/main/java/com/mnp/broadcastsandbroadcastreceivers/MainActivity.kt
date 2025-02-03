package com.mnp.broadcastsandbroadcastreceivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Build
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.mnp.broadcastsandbroadcastreceivers.ui.theme.BroadcastsAndBroadcastReceiversTheme


class MainActivity : ComponentActivity() {

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            BroadcastsAndBroadcastReceiversTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ActionPowerReceiver()

                    registerReceiver(ActionPowerReceiver().actionPowerConnected, IntentFilter("android.intent.action.ACTION_POWER_CONNECTED"))
                    registerReceiver(ActionPowerReceiver().actionPowerDisconnected, IntentFilter("android.intent.action.ACTION_POWER_DISCONNECTED"))
                }
            }
        }
    }
}

@Composable
fun connected(){
    Text("Connected")
}

@Composable
fun disconnected(){
    Text("Disconnected")
}
