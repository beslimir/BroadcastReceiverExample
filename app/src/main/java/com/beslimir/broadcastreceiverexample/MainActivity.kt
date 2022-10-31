package com.beslimir.broadcastreceiverexample

import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.beslimir.broadcastreceiverexample.ui.theme.BroadcastReceiverExampleTheme

class MainActivity : ComponentActivity() {

    private lateinit var myBroadcastReceiver: MyBroadcastReceiver
    private lateinit var intentFilter: IntentFilter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BroadcastReceiverExampleTheme {

            }
        }
    }

    override fun onStart() {
        super.onStart()
        //initialization
        myBroadcastReceiver = MyBroadcastReceiver()
        intentFilter = IntentFilter()
        intentFilter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED)

        this.registerReceiver(
            myBroadcastReceiver,
            intentFilter
        )
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(myBroadcastReceiver)
    }
}