package es.mipaquete.pmdm.proyectomoviepmdp.actvities

import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import es.mipaquete.pmdm.proyectomoviepmdp.R

class RegisterActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getSupportActionBar()?.hide();
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }
}