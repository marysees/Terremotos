package com.example.tarde.fragmentos;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

/**
 * Created by tarde on 03/02/2015.
 */
public class ListadoFragment extends Fragment {

    private ListView listado;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_listado, container);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        List<Terremoto> list;
        list = Arrays.asList(
                new Terremoto("1", "España", null ),
                new Terremoto("2", "Chile", null )
        );

        listado = (ListView) getActivity().findViewById(R.id.lvTerremoto);

        ListAdapter adaptadorTerremotos = new ArrayAdapter<Terremoto>(
                getActivity(),android.R.layout.simple_list_item_1,list);

        listado.setAdapter(adaptadorTerremotos);

    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener listener){
        listado.setOnItemClickListener(listener);
    }
}
