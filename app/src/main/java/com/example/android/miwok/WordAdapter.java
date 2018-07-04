package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceid=-1;
    private Context c;
    public WordAdapter(Context c, ArrayList<Word> words,int mColorResourceid){
        super(c,0,words);
        this.c=c;
        this.mColorResourceid=mColorResourceid;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView=convertView;
        if(listItemView==null)
        {
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        // setting the background color of the listView
        View container=listItemView.findViewById(R.id.text_container);

        // fetching the color from the color resource id styled according to the context theme
        int color=ContextCompat.getColor(c, mColorResourceid);
        container.setBackgroundColor(color);

        Word currentWord=getItem(position);

        TextView defaultTranslation= (TextView) listItemView.findViewById(R.id.default_text_view);
        TextView miwokTranslation= (TextView) listItemView.findViewById(R.id.miwok_text_view);

        defaultTranslation.setText(currentWord.getmDefaultTranslation());
        miwokTranslation.setText(currentWord.getmMiwokTranslation());
        return listItemView;
    }
}
