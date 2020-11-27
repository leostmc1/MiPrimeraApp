package com.leo.miprimeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista = findViewById(R.id.lista);
        List<Ciudades> model = new ArrayList<>();
        model.add(new Ciudades("Cusco","Machupicchu","1250"));
        model.add(new Ciudades("Cusco","Machupicchu","1250"));
        model.add(new Ciudades("Cusco","Machupicchu","1250"));
        Adaptador adaptador = new Adaptador(this,model);
        lista.setAdapter(adaptador);
        

}
}