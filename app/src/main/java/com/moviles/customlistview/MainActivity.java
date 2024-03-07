package com.moviles.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {

    ListView listaPersonas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        int [] fotoPerfil ={
                R.drawable.persona,
                R.drawable.persona2,
                R.drawable.persona3,
                R.drawable.persona4,
        };

        String nombres []={
                "PEDRO",
                "SERGIO",
                "Tom",
                "Jerry"

        };

        String telefono []={
                "123456789",
                "123456789",
                "456789123",
                "891234567"
        };

        ListAdapter personas = new ListAdapter(MainActivity.this,nombres,telefono,fotoPerfil);

        listaPersonas =(ListView) findViewById(R.id.listaUsuarios);
        listaPersonas.setAdapter(personas);



    }
}