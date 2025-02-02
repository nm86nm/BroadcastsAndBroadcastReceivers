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
                    val myReceiver1: BroadcastReceiver = object : BroadcastReceiver() {
                        override fun onReceive(context: Context, intent: Intent) {
                            Toast.makeText(context, "Device connected to charger", Toast.LENGTH_LONG).show()
                        }
                    }

                    val myReceiver2: BroadcastReceiver = object : BroadcastReceiver() {
                        override fun onReceive(context: Context, intent: Intent) {
                            Toast.makeText(context, "Device disconnected from charger", Toast.LENGTH_LONG).show()
                        }
                    }

                    registerReceiver(myReceiver1,  IntentFilter(Intent.ACTION_POWER_CONNECTED),
                        RECEIVER_NOT_EXPORTED
                    )

                    registerReceiver(myReceiver2,  IntentFilter(Intent.ACTION_POWER_DISCONNECTED),
                        RECEIVER_NOT_EXPORTED
                    )
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
