package com.example.multiplicacion

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/*import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
 class MainActivity : AppCompatActivity() {
    private EditText n1;
    private EditText n2;
    private TextView res;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        n1 = (EditText) findViewById (R.id.jnNumero1);
        n2 = (EditText) findViewById (R.id.jnNumero2);
        res=(TextView)findViewById(R.id.jnRespuesta);
    }

}*/


class MainActivity : AppCompatActivity(), View.OnClickListener {
    var num1: EditText? = null
    var num2: EditText? = null
    var resultado: TextView? = null
    var btnCalcular: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        num1 = findViewById<View>(R.id.numero1txt) as EditText
        num2 = findViewById<View>(R.id.numero2txt) as EditText
        resultado = findViewById<View>(R.id.resultadoTxt) as TextView
        btnCalcular = findViewById<View>(R.id.calcularBtn) as Button
        btnCalcular!!.setOnClickListener(this as View.OnClickListener)
    }

    @SuppressLint("SetTextI18n")
    override fun onClick(v: View) {
        val valor1 = num1!!.text.toString().toDouble()
        val valor2 = num2!!.text.toString().toDouble()
        val res = (valor1 + valor2)
        resultado!!.text = "el IMC es: $res"
    }
}