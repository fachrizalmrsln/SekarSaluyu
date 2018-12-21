package com.example.fahri.sekarsaluyu.Tab;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Toast;

import com.example.fahri.sekarsaluyu.Grid.GridAdapter;
import com.example.fahri.sekarsaluyu.Grid.GridSetter;
import com.example.fahri.sekarsaluyu.R;

import java.util.ArrayList;

public class TabArt extends Fragment {

    private GridView recyclerView;

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.content_tab_art, container, false);

        final ArrayList<GridSetter> words = new ArrayList<GridSetter>();
        words.clear();
        words.add(new GridSetter("Satu",R.drawable.test));
        words.add(new GridSetter("Dua",R.drawable.test));
        words.add(new GridSetter("Tiga",R.drawable.test));
        words.add(new GridSetter("Empat",R.drawable.test));
        words.add(new GridSetter("Lima",R.drawable.test));
        words.add(new GridSetter("Enam",R.drawable.test));
        words.add(new GridSetter("Tujuh",R.drawable.test));
        words.add(new GridSetter("Delapan",R.drawable.test));
        words.add(new GridSetter("Sembilan",R.drawable.test));
        words.add(new GridSetter("Sepuluh",R.drawable.test));

        GridAdapter adapter = new GridAdapter(getActivity(),words);

        recyclerView= rootView.findViewById(R.id.gridview);
        recyclerView.setAdapter((ListAdapter) adapter);

        recyclerView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position==0){
                    Toast.makeText(getActivity(),"Satu",Toast.LENGTH_SHORT).show();
                }else if (position==1){
                    Toast.makeText(getActivity(),"Dua",Toast.LENGTH_SHORT).show();
                }else if(position==2){
                    Toast.makeText(getActivity(),"Tiga",Toast.LENGTH_SHORT).show();
                }else if (position==3){
                    Toast.makeText(getActivity(),"Empat",Toast.LENGTH_SHORT).show();
                }else if (position==4){
                    Toast.makeText(getActivity(),"Lima",Toast.LENGTH_SHORT).show();
                }else if (position==5){
                    Toast.makeText(getActivity(),"Enam",Toast.LENGTH_SHORT).show();
                }else if(position==6){
                    Toast.makeText(getActivity(),"Tujuh",Toast.LENGTH_SHORT).show();
                }else if (position==7){
                    Toast.makeText(getActivity(),"Delapan",Toast.LENGTH_SHORT).show();
                }else if (position==8) {
                    Toast.makeText(getActivity(),"Sembilan",Toast.LENGTH_SHORT).show();
                }else if (position==9) {
                    Toast.makeText(getActivity(),"Sepuluh",Toast.LENGTH_SHORT).show();
                }
            }
        });

        return rootView;

    }
}