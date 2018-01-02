package com.pesanmerpati.autocompletetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView mAutoCompleteTextViewSearch;
    String[] mListData = {"Jakarta", "Bandung", "D.I. Yogyakarta", "Surabaya", "Bali", "Sumatera Utara",
        "Sumatera Barat", "Sumatera Selatan", "Jawa Barat", "Jawa Tengah", "Jawa Timur", "Nusa Tenggara Barat",
        "Nusa Tenggara Timur"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAutoCompleteTextViewSearch = findViewById(R.id.autocompletetextview);
        mAutoCompleteTextViewSearch.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, mListData));


    }

}
