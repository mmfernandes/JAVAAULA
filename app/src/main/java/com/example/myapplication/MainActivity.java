package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textViewTitle; //NOME DA VARIAVEL (ELEMENTOS DECLARADOS)
    private Button buttonAction; //é recomendado usar o mesmo que usa p linkar?
    private ArrayList<String> phrases = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       textViewTitle = findViewById(R.id.textView_title); //parametrizando no layout
       buttonAction = findViewById(R.id.button_action);

        phrases.add("LALALALA Q");
        phrases.add("LLILILI Q");
        phrases.add("LLELELEL Q");
        phrases.add("LALALALA Q");
        phrases.add("CRAUDIO1 Q");
        phrases.add("CRAUDIO Q");
        phrases.add("GABRIEL EMOCIONADO Q");
        phrases.add("GABRIEL EMOCIONOU CM A FICANTE Q");
        phrases.add("GABRIEL VAI REVE A FICANTE E VAI CHORA");
        phrases.add("bruno sonhou com elx");
        phrases.add("Gabriel amarra galinha");
        phrases.add("Bruno bombaa");
        phrases.add("Bruno bomsba");
        phrases.add("Bruno bombda");


        View.OnClickListener listener =
                new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Random random = new Random();
                int position = random.nextInt(phrases.size());
                String phrase = phrases.get(position);
                textViewTitle.setText(phrase);

              //  textViewTitle.setText("Rôi Craudiooo");

            }
        };

       buttonAction.setOnClickListener(listener); //método que vai configurar - (instancia valida para configuração)

    }
}