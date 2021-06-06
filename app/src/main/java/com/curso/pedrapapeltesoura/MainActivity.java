package com.curso.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void pedraSelecionada(View view){
        this.opcaSelecionada("0");
    }
    public void papelSelecionado(View view){
        this.opcaSelecionada("1");
    }
    public void tesouraSeleionada(View view){
        this.opcaSelecionada("2");
    }

    public void opcaSelecionada(String opcaoSelecionada ){
        int i = new Random().nextInt(3);
       // int i =3;

        ImageView imagem = findViewById(R.id.imagemjogo);
        if (i == 0) {
            imagem.setImageResource(R.drawable.pedra);
        }
        if (i==1){
            imagem.setImageResource(R.drawable.papel);
        }
        if (i==2) {
            imagem.setImageResource(R.drawable.tesoura);
        }
        if(opcaoSelecionada =="0" && i==0 ){
            TextView placar = findViewById(R.id.textView2);
            placar.setText("Empate!!!");
        }
        if(opcaoSelecionada =="0" && i==1 ){
            TextView placar = findViewById(R.id.textView2);
            placar.setText("Você perdeu!!!");
        }
        if(opcaoSelecionada =="0" && i==2 ){
            TextView placar = findViewById(R.id.textView2);
            placar.setText("Parabéns Você ganhou!!!");
        }
        if(opcaoSelecionada =="1" && i==1 ){
            TextView placar = findViewById(R.id.textView2);
            placar.setText("Empate!!!");
        }
        if(opcaoSelecionada =="1" && i==0 ){
            TextView placar = findViewById(R.id.textView2);
            placar.setText("Parabéns Você ganhou!!!");
        }
        if(opcaoSelecionada =="1" && i==2 ){
            TextView placar = findViewById(R.id.textView2);
            placar.setText("Você perdeu!!!");
        }
        if(opcaoSelecionada =="2" && i==2 ){
            TextView placar = findViewById(R.id.textView2);
            placar.setText("Empate!!!");
        }
        if(opcaoSelecionada =="2" && i==0 ){
            TextView placar = findViewById(R.id.textView2);
            placar.setText("Você perdeu!!!");
        }
        if(opcaoSelecionada =="2" && i==1 ) {
            TextView placar = findViewById(R.id.textView2);
            placar.setText("Parabéns você ganhou!!!");
        }

        System.out.println("Foi " +i);

    }

}

