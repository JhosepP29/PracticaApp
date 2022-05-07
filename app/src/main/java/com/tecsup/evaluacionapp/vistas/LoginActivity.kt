package com.tecsup.evaluacionapp.vistas

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.tecsup.evaluacionapp.MainActivity
import com.tecsup.evaluacionapp.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity: AppCompatActivity (){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        Log.v("CICLO_VIDA", "onCreate")

        val actionBar = supportActionBar
        actionBar?.hide()

        btnIngresar.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }
        

    }

    override fun onStart() {
        super.onStart()
        Log.v("CICLO_VIDA", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.v("CICLO_VIDA", "onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.v("CICLO_VIDA", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.v("CICLO_VIDA", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v("CICLO_VIDA", "onDestroy")
    }
    
}