package com.example.android.project7nw;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Manik on 15-04-2017.
 */

public class BookAdapter extends ArrayAdapter<Book> {


    public BookAdapter(Context context, List<Book> books) {
        super(context, 0, books);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.book_list_item, parent, false);
        }

        Book currentBook = getItem(position);

        TextView TitleView = (TextView) listItemView.findViewById(R.id.title);
        TitleView.setText(currentBook.getTitle());

        TextView DescView = (TextView) listItemView.findViewById(R.id.desc);
        DescView.setText(currentBook.getDesc());

        TextView AuthorView = (TextView) listItemView.findViewById(R.id.author);
        AuthorView.setText(currentBook.getAuthor());
        return listItemView;
    }
}
