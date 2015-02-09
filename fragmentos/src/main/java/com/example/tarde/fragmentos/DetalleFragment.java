package com.example.tarde.fragmentos;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * Created by tarde on 03/02/2015.
 */
public class DetalleFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_detalle, container);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        View guardar = getActivity().findViewById(R.id.btGuardar);
        View actualizar = getActivity().findViewById(R.id.btActualizar);

        View cancelar = getActivity().findViewById(R.id.btCancelar);

        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO implementar cuando se expliquen los Adapter
            }
        });

        actualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO implementar cuando se expliquen los Adapter
            }
        });

        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO implementar cuando se expliquen los Adapter
            }
        });
    }

    public void actualizarDetalle(Terremoto item) {

        EditText localizacion = (EditText) getActivity().findViewById(R.id.etLocalizacion);
        EditText magnitud = (EditText) getActivity().findViewById(R.id.etMagnitud);
        EditText fecha = (EditText) getActivity().findViewById(R.id.etFecha);

        localizacion.setText(item.getLocalizacion());
        magnitud.setText(item.getMagnitud());
       //fecha.setText(item.getFecha().);
    }
}

