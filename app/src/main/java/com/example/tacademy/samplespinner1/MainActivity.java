package com.example.tacademy.samplespinner1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {


    Spinner spinner;
    ArrayAdapter<String> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner)findViewById(R.id.spinner);
        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        spinner.setAdapter(mAdapter);

        initData();
    }

    private void initData(){
        String[] arrays = getResources().getStringArray(R.array.items);
        for(String a : arrays){
            mAdapter.add(a);
        }
    }
}
