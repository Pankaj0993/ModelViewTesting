package com.text.modelviewtesting

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Testing : AppCompatActivity() {
    var name  :String = "Testing-"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(name,"onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(name,"onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(name,"onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(name,"onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(name,"onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(name,"onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(name,"onDestroy")
    }


    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(name,"onRestoreInstanceState")
    }



    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(name,"onSaveInstanceState")
    }


   /* private fun showToast(text: String) {
        runOnUiThread {
            Toast.makeText(
                this@Testing,
                text,
                Toast.LENGTH_SHORT
            ).show()
        }
    }*/
}