package mx.edu.ittepic.tpdm_u1_ejercicio8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import java.util.*

class MainActivity : AppCompatActivity() {

    var campoEdit : EditText ?= null
    var btnabrir : Button ?= null
    var valores=""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        campoEdit=findViewById(R.id.campo)
        btnabrir=findViewById(R.id.btn)


        btnabrir?.setOnClickListener {
            var abrir =Intent(this,Main2Activity::class.java)
            valores=campoEdit?.text.toString()
            abrir.putExtra("val",valores)
            startActivity(abrir)

        }


    }
}
