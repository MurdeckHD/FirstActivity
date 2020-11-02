package com.example.firstactivity

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "OnStart", Toast.LENGTH_LONG).show()
        // La actividad está a punto de hacerse visible.
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "OnResume", Toast.LENGTH_LONG).show()
        // La actividad se ha vuelto visible (ahora se "reanuda").
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "OnPause", Toast.LENGTH_LONG).show()
        // Enfocarse en otra actividad  (esta actividad está a punto de ser "detenida").
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "OnStop", Toast.LENGTH_LONG).show()
        // La actividad ya no es visible (ahora está "detenida")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_LONG).show()
        // La actividad está a punto de ser destruida.
    }


}