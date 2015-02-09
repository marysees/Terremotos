package com.example.tarde.fragmentos;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

/**
 * Created by tarde on 03/02/2015.
 */
public class DetalleActivity extends ActionBarActivity {

    public static final String KEY_CORREO_ITEM = "terremoto";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        Terremoto item = (Terremoto) getIntent()
                .getSerializableExtra(KEY_CORREO_ITEM);

        FragmentManager fragmentManager = getFragmentManager();

        DetalleFragment fragmentoDetalle = (DetalleFragment) fragmentManager
                .findFragmentById(R.id.fragmentoDetalle);

        fragmentoDetalle.actualizarDetalle(item);

    }
}

