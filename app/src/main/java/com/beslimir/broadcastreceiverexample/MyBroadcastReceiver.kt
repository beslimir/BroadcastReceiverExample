package com.beslimir.broadcastreceiverexample

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyBroadcastReceiver: BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        val action = intent?.action
        if (action == Intent.ACTION_AIRPLANE_MODE_CHANGED) {
            Toast.makeText(context, "Airplane mode changed", Toast.LENGTH_SHORT).show()
        }
    }
}