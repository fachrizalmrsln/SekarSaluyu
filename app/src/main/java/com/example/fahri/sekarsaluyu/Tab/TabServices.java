package com.example.fahri.sekarsaluyu.Tab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fahri.sekarsaluyu.Grid.GridAdapter;
import com.example.fahri.sekarsaluyu.Grid.GridSetter;
import com.example.fahri.sekarsaluyu.List.ListSetter;
import com.example.fahri.sekarsaluyu.R;

import java.util.ArrayList;

public class TabServices extends Fragment {

    private GridView gridView;

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.content_tab_services,container,false);

        final ArrayList<ListSetter> words = new ArrayList<ListSetter>();
        words.clear();
        words.add(new ListSetter("Sundanese Culture Class",R.drawable.test,"Learning art is ool, let's learn our " +
                "culture and make it possible to keep."));
        words.add(new ListSetter("Event",R.drawable.test,"We provide the most professional" +
                "talent for various needs of your."));

        ListAdapter adapter = new com.example.fahri.sekarsaluyu.List.ListAdapter(getActivity(),words);

        gridView = rootView.findViewById(R.id.listview);
        gridView.setAdapter((ListAdapter) adapter);

        TextView textViewBook = rootView.findViewById(R.id.book);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position==0){
                    Toast.makeText(getActivity(),"Sundanese Culture Class",Toast.LENGTH_SHORT).show();
                }else if (position==1){
                    Toast.makeText(getActivity(),"Event",Toast.LENGTH_SHORT).show();
                }
            }
        });

        return rootView;
    }

}
