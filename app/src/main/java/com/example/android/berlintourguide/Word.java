package com.example.android.berlintourguide;

/**
 * Created by Pooya noD on 6/9/2017.
 */

public class Word {
    /** Default translation for the Word */
    private String mNameOfPlace;

    /** Miwok translation for the Word */
    private String mAdressOfPlace;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;


    public Word(String nameOfPlace, String adressOfPlace,int imageResourceId) {
        mNameOfPlace = nameOfPlace;
        mAdressOfPlace = adressOfPlace;
        mImageResourceId = imageResourceId;
    }
    /**
     * Get the name of place.
     */
    public String getNameOfPlace() {
        return mNameOfPlace;
    }

    /**
     * Get the adress of place.
     */
    public String getAdressOfPlace() {
        return mAdressOfPlace;
    }

    public int getImageResourceId(){return mImageResourceId;}


    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }}