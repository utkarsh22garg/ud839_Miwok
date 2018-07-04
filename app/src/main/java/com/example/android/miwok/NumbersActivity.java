/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // create a list of words here
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "ek"));
        words.add(new Word("two", "do"));
        words.add(new Word("three", "teen"));
        words.add(new Word("four", "char"));
        words.add(new Word("five", "panch"));
        words.add(new Word("six", "chah"));
        words.add(new Word("seven", "saat"));
        words.add(new Word("eight", "aath"));
        words.add(new Word("nine", "no"));
        words.add(new Word("ten", "dus"));

        ListView listView = (ListView) findViewById(R.id.listView);
        WordAdapter wordAdapter = new WordAdapter(this, words, R.color.category_numbers);
        listView.setAdapter(wordAdapter);
    }
}
