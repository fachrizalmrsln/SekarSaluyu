package com.example.fahri.sekarsaluyu.List;

public class ListSetter {

    private int mImagesResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    private String mImageTitle;

    private String mImageDesc;

    public ListSetter (String imageTitle, int imagesResourceId, String imageDesc){

        mImageTitle = imageTitle;
        mImagesResourceId = imagesResourceId;
        mImageDesc = imageDesc;
    }

    public String getmImageTitle(){
        return mImageTitle;
    }

    public int getmImagesResourceId(){
        return mImagesResourceId;
    }

    public String getmImageDesc() {
        return mImageDesc;
    }
}
