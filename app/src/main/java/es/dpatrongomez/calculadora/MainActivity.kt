package es.dpatrongomez.calculadora

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.Float


class MainActivity : AppCompatActivity() {


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numero1 = findViewById<EditText>(R.id.num1)
        val numero2 = findViewById<EditText>(R.id.num2)
        val Sumar = findViewById<Button>(R.id.sumar)
        val Resta = findViewById<Button>(R.id.restar)
        val Multiplicar = findViewById<Button>(R.id.multiplicar)
        val Dividir = findViewById<Button>(R.id.dividir)
        val Resultado = findViewById<TextView>(R.id.resultado)
        val teclado = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager


        Sumar.setOnClickListener {
            teclado.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0)
            if (!numero1.text.toString().isEmpty() && !numero2.text.toString().isEmpty()) {
                val aux1 = Float.parseFloat(numero1.text.toString())
                val aux2 = Float.parseFloat(numero2.text.toString())

                Resultado.text = aux1.plus(aux2).toString()
            }
        }
        Resta.setOnClickListener {
            teclado.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0)
            if (!numero1.text.toString().isEmpty() && !numero2.text.toString().isEmpty()) {
                val aux1 = Float.parseFloat(numero1.text.toString())
                val aux2 = Float.parseFloat(numero2.text.toString())

                Resultado.text = aux1.minus(aux2).toString()
            }
        }
        Multiplicar.setOnClickListener {
            teclado.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0)
            if (!numero1.text.toString().isEmpty() && !numero2.text.toString().isEmpty()) {
                val aux1 = Float.parseFloat(numero1.text.toString())
                val aux2 = Float.parseFloat(numero2.text.toString())

                Resultado.text = aux1.times(aux2).toString()
            }
        }
        Dividir.setOnClickListener {
            teclado.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0)
            if (!numero1.text.toString().isEmpty() && !numero2.text.toString().isEmpty()) {
                val aux1 = Float.parseFloat(numero1.text.toString())
                val aux2 = Float.parseFloat(numero2.text.toString())

                if (aux2 == 0f) {
                    Resultado.text = "ERROR"
                } else {
                    //val resultado = aux1.div(aux2)
                    Resultado.text = aux1.div(aux2).toString()
                }
            }
        }

    }
}



