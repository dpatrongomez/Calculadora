package es.dpatrongomez.calculadora;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText numero1, numero2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1 = findViewById(R.id.num1);
        numero2 = findViewById(R.id.num2);


        Button Sumar = findViewById(R.id.sumar);
        Button Resta = findViewById(R.id.restar);
        Button Multiplicar = findViewById(R.id.multiplicar);
        Button Dividir = findViewById(R.id.dividir);
        final TextView Resultado = findViewById(R.id.resultado);

        Sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InputMethodManager teclado = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                teclado.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);

                if (numero1.getText().toString().isEmpty()) {
                } else {
                    if (numero2.getText().toString().isEmpty()) {
                    } else {
                        float aux1 = Float.parseFloat(numero1.getText().toString());
                        float aux2 = Float.parseFloat(numero2.getText().toString());
                        float resultado = aux1 + aux2;

                        Resultado.setText("" + resultado);
                    }
                }
            }
        });
        Resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InputMethodManager teclado = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                teclado.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);

                if (numero1.getText().toString().isEmpty()) {
                } else
                    if (numero2.getText().toString().isEmpty()) {
                    } else {
                        float aux1 = Float.parseFloat(numero1.getText().toString());
                        float aux2 = Float.parseFloat(numero2.getText().toString());
                        float resultado = aux1 - aux2;

                        Resultado.setText("" + resultado);
                    }

            }
        });
        Multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InputMethodManager teclado = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                teclado.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);

                if (numero1.getText().toString().isEmpty()) {
                } else
                    if (numero2.getText().toString().isEmpty()) {
                    } else {
                        float aux1 = Float.parseFloat(numero1.getText().toString());
                        float aux2 = Float.parseFloat(numero2.getText().toString());
                        float resultado = aux1 * aux2;

                        Resultado.setText("" + resultado);
                    }


            }
        });
        Dividir.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.GINGERBREAD)
            @Override
            public void onClick(View v) {
                InputMethodManager teclado = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                teclado.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);

                if (numero1.getText().toString().isEmpty()) {
                } else
                    if (numero2.getText().toString().isEmpty()) {
                    } else {
                        float aux1 = Float.parseFloat(numero1.getText().toString());
                        float aux2 = Float.parseFloat(numero2.getText().toString());

                        if (aux2 == 0) {
                            Resultado.setText("ERROR");
                        } else {
                            float resultado = aux1 / aux2;
                            Resultado.setText("" + resultado);
                        }
                    }

            }

        });

    }
}

