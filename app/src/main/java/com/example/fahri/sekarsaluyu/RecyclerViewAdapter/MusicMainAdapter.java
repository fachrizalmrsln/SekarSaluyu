package com.example.fahri.sekarsaluyu.RecyclerViewAdapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.fahri.sekarsaluyu.R;

import java.util.ArrayList;

public class MusicMainAdapter extends RecyclerView.Adapter<MusicMainAdapter.ViewHolder> {

    private ArrayList<String> mText = new ArrayList<>();
    private ArrayList<Integer> mImage = new ArrayList<>();
    private Context mContext;

    public MusicMainAdapter(Context context, ArrayList<String> text, ArrayList<Integer> image){
        mText = text;
        mImage = image;
        mContext = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem_music, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MusicMainAdapter.ViewHolder holder, final int position) {

        Glide.with(mContext)
                .asBitmap()
                .load(mImage.get(position))
                .into(holder.mImage);
        holder.mText.setText(mText.get(position));

        holder.mImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,mText.get(position),Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return mImage.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView  mText;
        ImageView mImage;

        public ViewHolder(View itemView) {
            super(itemView);

            mText = itemView.findViewById(R.id.pictText);
            mImage = itemView.findViewById(R.id.imageView);

        }
    }
}
