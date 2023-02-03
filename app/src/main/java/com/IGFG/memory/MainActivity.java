package com.IGFG.memory;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends Activity {

    List<Integer> numeros;
    Integer indice = 0;
    Button reiniciar;
    Button botao1;
    Button botao2;
    Button botao3;
    Button botao4;
    Button botao5;
    Button botao6;
    TextView parabens;
    TextView parabens_2;
    ProgressBar progresso;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        reiniciar = findViewById(R.id.reiniciar);
        botao1 = findViewById(R.id.um);
        botao2 = findViewById(R.id.dois);
        botao3 = findViewById(R.id.tres);
        botao4 = findViewById(R.id.quatro);
        botao5 = findViewById(R.id.cinco);
        botao6 = findViewById(R.id.seis);
        parabens = findViewById(R.id.prb);
        parabens.setVisibility(View.GONE);
        parabens_2 = findViewById(R.id.prb_2);
        parabens_2.setVisibility(View.GONE);
        progresso = findViewById(R.id.progressBar);
        generateNumbers();
    }
    public void trataBotao(View click) {
        Button botao = (Button) click;
        int numero_clicado = Integer.parseInt( botao.getText().toString());
        if (numeros.get(indice).equals(numero_clicado)) {
            indice++;
            botao.setVisibility(View.GONE);
        }
        else{
            visible();
            indice=0;
        }

        if(indice == numeros.size()){
            parabens.setVisibility(View.VISIBLE);
        }

    }
    public void visible(){
        botao1.setVisibility(View.VISIBLE);
        botao2.setVisibility(View.VISIBLE);
        botao3.setVisibility(View.VISIBLE);
        botao4.setVisibility(View.VISIBLE);
        botao5.setVisibility(View.VISIBLE);
        botao6.setVisibility(View.VISIBLE);
        parabens.setVisibility(View.GONE);
        parabens_2.setVisibility(View.GONE);

    }

    public void generateNumbers() {
        this.numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4,5,6));
        Collections.shuffle(numeros);
    }
}
