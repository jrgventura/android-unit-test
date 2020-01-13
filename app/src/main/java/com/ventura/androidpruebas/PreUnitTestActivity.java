package com.ventura.androidpruebas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.ventura.androidpruebas.calculadora.CalculadoraPreUnitTest;

public class PreUnitTestActivity extends AppCompatActivity {

    private int resultado;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_unit_test);

        resultado = CalculadoraPreUnitTest.sumar(10, 20);

        tvResultado = findViewById(R.id.tvResultado);
        tvResultado.setText(resultado+"");

    }
}
