package com.moviles.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListAdapter extends BaseAdapter {
    Context Contexto;
    String[] Nombres;
    String[] NumeroTelefono;
    int[] IdImagen;

    //sirve para obtener datos(inflar) en un ainterfaz grafica
    LayoutInflater inflater;
    public ListAdapter(Context contexto,String[] nombres,String[] numeroTelefono,int[] Idimagen){
        this.Contexto= contexto;
        this.Nombres=nombres;
        this.NumeroTelefono= numeroTelefono;
        this.IdImagen= Idimagen;
        inflater = LayoutInflater.from(Contexto);
    }


    @Override
    public int getCount() {
        return Nombres.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.list_item,null);

        //buscar que esos datos que llegan existan
        ImageView fotoPerfil = view.findViewById(R.id.fotoPerfil);
        TextView nombreUsuario = view.findViewById(R.id.nombre);
        TextView telefonoUsuario = view.findViewById(R.id.telefono);

        //asignar para que se muetren los datos que se buscan
        fotoPerfil.setImageResource(IdImagen[i]);//poner la imagen cpmo tal
        nombreUsuario.setText(Nombres[i]);
        telefonoUsuario.setText(NumeroTelefono[i]);
        return view;
    }
}
