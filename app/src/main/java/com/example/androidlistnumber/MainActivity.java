package com.example.androidlistnumber;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerViewNumbers;
    List<Integer> arrayNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewNumbers = findViewById(R.id.Recycler_Number);
        recyclerViewNumbers.setLayoutManager(new LinearLayoutManager(this));

        final List<Integer> arrayNumbers = new ArrayList<Integer>();

        for (int i = 2; i <= 200; i++){
            if (i %  2 == 0){
                arrayNumbers.add(i);
            }
        }
        NumberAdapter numberAdapter = new NumberAdapter();
        recyclerViewNumbers.setAdapter(numberAdapter);
        numberAdapter.arrayNumber = arrayNumbers;
        numberAdapter.notifyDataSetChanged();

    }
}
