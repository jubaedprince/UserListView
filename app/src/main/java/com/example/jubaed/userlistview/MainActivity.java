package com.example.jubaed.userlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.list);

        //create three persons
        PersonItem atiar = new PersonItem("Atiar","Swajan", "Accounts", R.drawable.alpha);
        PersonItem jibne = new PersonItem("Kamal","Jibne", "Marketing", R.drawable.beta);
        PersonItem nafis = new PersonItem("Nafis","UI",  "Logistics", R.drawable.gamma);

        PersonItem prince = new PersonItem("Prince","Jp","IT", R.drawable.alpha);
        PersonItem sakib = new PersonItem("Sakib","Walcott", "Service", R.drawable.beta);
        PersonItem sunny = new PersonItem("Sunny","Rudrozzal",  "Process", R.drawable.gamma);

        //Add those created objects to an ArrayList

        final ArrayList<PersonItem> personItems = new ArrayList<>();
        personItems.add(atiar);
        personItems.add(jibne);
        personItems.add(nafis);

        personItems.add(prince);
        personItems.add(sakib);
        personItems.add(sunny);

        //create PersonAdapter
        PersonAdapter nameAdapter = new PersonAdapter(this, personItems);

        //setAdapter to listView
        listView.setAdapter(nameAdapter);
    }
}
