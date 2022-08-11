package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView textViewTitle; //NOME DA VARIAVEL
    private Button buttonAction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       textViewTitle = findViewById(R.id.textView_title); //parametrizando no layout
       buttonAction = findViewById(R.id.button_action);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewTitle.setText("Rôi Craudio");

            }
        };

       buttonAction.setOnClickListener(listener); //método que vai configurar - (instancia valida para configuração)

    }
}