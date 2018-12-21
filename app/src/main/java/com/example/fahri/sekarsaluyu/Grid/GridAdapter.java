package com.example.fahri.sekarsaluyu.Grid;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.fahri.sekarsaluyu.R;

import java.util.ArrayList;

public class GridAdapter extends ArrayAdapter<GridSetter> {

private static final String LOG_TAG = GridAdapter.class.getSimpleName();


public GridAdapter (Activity context, ArrayList<GridSetter> androidWords){
        super(context, 0 , androidWords);

        }

@Override
public View getView (int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if (listItemView == null){
        listItemView = LayoutInflater.from(getContext()).inflate(R.layout.gridview, parent, false);
        }

        GridSetter currentWordsAdaptor = getItem(position);

        ImageView ImageView = (ImageView) listItemView.findViewById(R.id.imageView);
        ImageView.setImageResource(currentWordsAdaptor.getmImagesResourceId());

        TextView TextView = (TextView) listItemView.findViewById(R.id.textView);
        TextView.setText(currentWordsAdaptor.getmImageTitle());

        View textContainer = listItemView.findViewById(R.id.card);

        return listItemView;
        }
        }