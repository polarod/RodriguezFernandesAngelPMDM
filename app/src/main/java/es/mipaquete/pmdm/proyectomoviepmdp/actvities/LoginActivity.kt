package es.mipaquete.pmdm.proyectomoviepmdp.actvities

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import es.mipaquete.pmdm.proyectomoviepmdp.R

class LoginActivity: AppCompatActivity() {
    lateinit var btlogin: Button
    lateinit var btregist: Button

    override fun onCreate(savedInstanceState: Bundle?){
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btlogin = findViewById(R.id.btlogin)
        btregist = findViewById(R.id.btregist)

        btlogin.setOnClickListener(){
            val intento = Intent(this,PeliculasActivity::class.java)
            startActivity(intento)

        }

        btregist.setOnClickListener(){
            val intento2= Intent(this, RegisterActivity::class.java)
            startActivity(intento2)


        }
    }
}