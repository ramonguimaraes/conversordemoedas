package com.example.conversordemoedas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.math.BigDecimal
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(View.OnClickListener {

            var valor = editText.text.toString();
            var cotacao = editText2.text.toString();

            if ( !valor.isEmpty() ) {
                txtResult.text = converte(valor.toBigDecimal(), cotacao.toBigDecimal()).toString();
            }


        });

    }


    fun converte(valor: BigDecimal, cotacao :BigDecimal) :BigDecimal{
        return valor.multiply(cotacao);
    }
}
