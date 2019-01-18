package com.example.fahri.sekarsaluyu.Tab;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fahri.sekarsaluyu.ActivitySSArtStudio;
import com.example.fahri.sekarsaluyu.R;
import com.example.fahri.sekarsaluyu.RecyclerViewAdapter.DanceMainAdapter;
import com.example.fahri.sekarsaluyu.RecyclerViewAdapter.InstrumentMainAdapter;
import com.example.fahri.sekarsaluyu.RecyclerViewAdapter.MusicMainAdapter;

import java.util.ArrayList;

public class TabCultures extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;

    private ArrayList<String> mText1 = new ArrayList<>();
    private ArrayList<Integer> mImage1 = new ArrayList<>();

    private ArrayList<String> mText2 = new ArrayList<>();
    private ArrayList<Integer> mImage2 = new ArrayList<>();

    private ArrayList<String> mText3 = new ArrayList<>();
    private ArrayList<Integer> mImage3 = new ArrayList<>();

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState){
        final View rootView = inflater.inflate(R.layout.content_tab_cultures,container,false);
        TextView textView = rootView.findViewById(R.id.more);

        mText1.clear();
        mImage1.clear();

        mText2.clear();
        mImage2.clear();

        mText3.clear();
        mImage3.clear();

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ActivitySSArtStudio.class);
                startActivity(intent);

            }
        });

        //Music
        mText1.add("Satu");
        mImage1.add(R.drawable.test);

        mText1.add("Dua");
        mImage1.add(R.drawable.test);

        mText1.add("Tiga");
        mImage1.add(R.drawable.test);

        mText1.add("Empat");
        mImage1.add(R.drawable.test);

        mText1.add("Lima");
        mImage1.add(R.drawable.test);

        mText1.add("Enam");
        mImage1.add(R.drawable.test);

        layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL,false);
        recyclerView =rootView.findViewById(R.id.recyclerView1);
        recyclerView.setLayoutManager(layoutManager);
        MusicMainAdapter adapterMusic = new MusicMainAdapter(getActivity(),mText1,mImage1);
        recyclerView.setAdapter(adapterMusic);

        //Dance
        mText2.add("Satu");
        mImage2.add(R.drawable.test);

        mText2.add("Dua");
        mImage2.add(R.drawable.test);

        mText2.add("Tiga");
        mImage2.add(R.drawable.test);

        mText2.add("Empat");
        mImage2.add(R.drawable.test);

        mText2.add("Lima");
        mImage2.add(R.drawable.test);

        mText2.add("Enam");
        mImage2.add(R.drawable.test);

        layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL,false);
        recyclerView = rootView.findViewById(R.id.recyclerView2);
        recyclerView.setLayoutManager(layoutManager);
        DanceMainAdapter adapterDance = new DanceMainAdapter(getActivity(),mText2,mImage2);
        recyclerView.setAdapter(adapterDance);

        //Instrument
        mText3.add("Satu");
        mImage3.add(R.drawable.test);

        mText3.add("Dua");
        mImage3.add(R.drawable.test);

        mText3.add("Tiga");
        mImage3.add(R.drawable.test);

        mText3.add("Empat");
        mImage3.add(R.drawable.test);

        mText3.add("Lima");
        mImage3.add(R.drawable.test);

        mText3.add("Enam");
        mImage3.add(R.drawable.test);

        layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL,false);
        recyclerView = rootView.findViewById(R.id.recyclerView3);
        recyclerView.setLayoutManager(layoutManager);
        InstrumentMainAdapter adapterInstrument = new InstrumentMainAdapter(getActivity(),mText3,mImage3);
        recyclerView.setAdapter(adapterInstrument);

        return rootView;
    }
}
