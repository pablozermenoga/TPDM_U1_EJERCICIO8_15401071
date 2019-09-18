package mx.edu.ittepic.tpdm_u1_ejercicio8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Main2Activity : AppCompatActivity() {

    var textedit2 : EditText ?=null
    var btn : Button ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        textedit2 = findViewById(R.id.campo2)
        btn = findViewById(R.id.btn)
        var entero=intent.extras?.getString("val")

        btn?.setOnClickListener {
            textedit2?.setText(entero.toString())
        }


    }
}
