package com.example.fahri.sekarsaluyu.List;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fahri.sekarsaluyu.Grid.GridAdapter;
import com.example.fahri.sekarsaluyu.Grid.GridSetter;
import com.example.fahri.sekarsaluyu.R;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<ListSetter> {

    private static final String LOG_TAG = ListAdapter.class.getSimpleName();


    public ListAdapter (Activity context, ArrayList<ListSetter> androidWords){
        super(context, 0 , androidWords);

    }

    @Override
    public View getView (int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.listview, parent, false);
        }

        ListSetter currentWordsAdaptor = getItem(position);

        TextView TextViewTitle = (TextView) listItemView.findViewById(R.id.textViewTitle);
        TextViewTitle.setText(currentWordsAdaptor.getmImageTitle());

        ImageView ImageView = (ImageView) listItemView.findViewById(R.id.imageView);
        ImageView.setImageResource(currentWordsAdaptor.getmImagesResourceId());

        TextView TextViewDesc = (TextView) listItemView.findViewById(R.id.textViewDesc);
        TextViewDesc.setText(currentWordsAdaptor.getmImageDesc());

        View textContainer = listItemView.findViewById(R.id.card);

        return listItemView;
    }
}