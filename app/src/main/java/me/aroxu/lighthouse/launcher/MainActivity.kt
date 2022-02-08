package me.aroxu.lighthouse.launcher

import android.app.Activity
import android.content.ComponentName
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        finish()
        val intent = Intent()
        try {
            intent.component =
                ComponentName("me.aroxu.lighthouse", "me.aroxu.lighthouse.PopupActivity")
            startActivity(intent)
        } catch (e: Exception) {
            Log.e("LighthouseLauncher", e.stackTrace.toString())
            Toast.makeText(this, e.stackTraceToString(), Toast.LENGTH_SHORT).show()
        }
        super.onCreate(savedInstanceState)
    }
}
