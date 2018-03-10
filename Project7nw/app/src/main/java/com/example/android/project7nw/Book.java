package com.example.android.project7nw;

/**
 * Created by Manik on 15-04-2017.
 */

public class Book {
    private String mTitle;
    private String mDesc;
    private String mAuthor;

    public Book(String Title, String Desc, String Author) {
        mTitle = Title;
        mDesc = Desc;
        mAuthor = Author;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getDesc() {
        return mDesc;
    }

    public String getAuthor() {
        return mAuthor;
    }

}
