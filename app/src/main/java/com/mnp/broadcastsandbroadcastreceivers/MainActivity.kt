package com.mnp.broadcastsandbroadcastreceivers

import android.content.IntentFilter
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.mnp.broadcastsandbroadcastreceivers.receiver.ActionPowerReceiver
import com.mnp.broadcastsandbroadcastreceivers.receiver.AirplaneModeReceiver
import com.mnp.broadcastsandbroadcastreceivers.receiver.ApplicationLocaleChangedReceiver
import com.mnp.broadcastsandbroadcastreceivers.receiver.ApplicationRestrictionsReceiver
import com.mnp.broadcastsandbroadcastreceivers.receiver.BatteryReceiver
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
                    registerReceiver(
                        ActionPowerReceiver().actionPowerConnected,
                        IntentFilter("android.intent.action.ACTION_POWER_CONNECTED")
                    )
                    registerReceiver(
                        ActionPowerReceiver().actionPowerDisconnected,
                        IntentFilter("android.intent.action.ACTION_POWER_DISCONNECTED")
                    )
                    registerReceiver(
                        AirplaneModeReceiver(),
                        IntentFilter("android.intent.action.AIRPLANE_MODE")
                    )
                    registerReceiver(
                        BatteryReceiver().batteryChanged,
                        IntentFilter("android.intent.action.BATTERY_CHANGED")
                    )
                    registerReceiver(
                        BatteryReceiver().batteryLow,
                        IntentFilter("android.intent.action.BATTERY_LOW")
                    )
                    registerReceiver(
                        BatteryReceiver().batteryOkay,
                        IntentFilter("android.intent.action.BATTERY_OKAY")
                    )
                    registerReceiver(
                        ApplicationLocaleChangedReceiver(),
                        IntentFilter("android.intent.action.APPLICATION_LOCALE_CHANGED")
                    )
                    registerReceiver(
                        ApplicationRestrictionsReceiver(),
                        IntentFilter("android.intent.action.APPLICATION_RESTRICTIONS_CHANGED")
                    )
                }
            }
        }
    }
}