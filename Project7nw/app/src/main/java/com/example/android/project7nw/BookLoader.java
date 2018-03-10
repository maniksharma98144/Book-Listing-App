package com.example.android.project7nw;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Created by Manik on 15-04-2017.
 */

public class BookLoader extends AsyncTaskLoader<List<Book>> {

    private static final String LOG_TAG = BookLoader.class.getName();

    private String mUrl;

    public BookLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }


    @Override
    public List<Book> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        List<Book> books = Query.fetchBookData(mUrl);
        return books;
    }
}

