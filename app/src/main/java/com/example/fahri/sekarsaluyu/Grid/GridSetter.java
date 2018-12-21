package com.example.fahri.sekarsaluyu.Grid;

public class GridSetter {

    private int mImagesResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    private String mImageTitle;

    public GridSetter (String imageTitle, int imagesResourceId){

        mImagesResourceId = imagesResourceId;
        mImageTitle = imageTitle;
    }

    public int getmImagesResourceId(){
        return mImagesResourceId;
    }

    public String getmImageTitle(){
        return mImageTitle;
    }
}