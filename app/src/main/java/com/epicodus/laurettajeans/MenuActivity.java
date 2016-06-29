package com.epicodus.laurettajeans;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import butterknife.Bind;
import butterknife.ButterKnife;

public class MenuActivity extends AppCompatActivity {

    @Bind(R.id.listView) ListView mListView;
    private String[] pies = new String[] {"Strawberry Sweet Cream", "Blackberry Raspberry Streusel",
            "Tart Cherry", "Rhubarb Streusel", "Rhubarb Raspberry Sour Cream", "Blueberry Rhubarb",
            "Strawberry Rhubarb", "Chocolate Cream", "Coconut Cream", "Chocolate Banana Cream",
            "Banana Cream", "Blackbottom Coconut", "Key Lime", "Lemon Gingersnap", "Salted Honey",
            "Honey Hazelnut", "Chocolate Chess", "S'mores", "Strawberry Short Pie", "Lemon Meringue"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ButterKnife.bind(this);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, pies);
        mListView.setAdapter(adapter);
    }
}