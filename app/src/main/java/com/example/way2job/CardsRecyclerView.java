package com.example.way2job;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.way2job.adapter.CardAdapter;
import com.example.way2job.models.Information;

import java.util.ArrayList;

public class CardsRecyclerView extends AppCompatActivity {

    CardAdapter cardAdapter;
    Information information;
    RecyclerView recyclerView;

    private static ArrayList<Information> informationList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cards_recycler_view);
        recyclerView = findViewById(R.id.reccycler);

        informationList.add(new Information("ASE", 1, "Axis Colleges", "Nucleus Software Exports Ltd."
                , "Product Based", 4.33, 2022, "" , 4, "JAVA", "NOIDA"));

        informationList.add(new Information("ASE", 2, "PSIT", "Sopra Banking Software"
                , "Product Based", 8.5, 2022, "" , 4, "JAVA", "NOIDA"));

        informationList.add(new Information("ASE", 3, "Axis Colleges", "Vinove Softwares"
                , "Service Based", 4.5, 2022, "" , 4, "JAVA", "LUCKNOW"));

        informationList.add(new Information("ASE", 4, "AKTU", "Zenarate"
                , "Product Based", 7.5, 2022, "" , 4, "JAVA", "GURUGRAM"));

        informationList.add(new Information("ASE", 5, "Axis Colleges", "Unify Cloud Solutions"
                , "Service Based", 4.5, 2022, "" , 4, "JAVA", "NOIDA"));

        informationList.add(new Information("ASE", 6, "Axis Colleges", "Nucleus Software Exports Ltd."
                , "Product Based", 4.33, 2022, "" , 4, "JAVA", "NOIDA"));



        cardAdapter = new CardAdapter(this, informationList);
        recyclerView.setAdapter(cardAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}