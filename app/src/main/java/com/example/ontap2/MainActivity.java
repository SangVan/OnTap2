package com.example.ontap2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<platis> listPlatis;
    private ListView listView;
    private ListAdapter listAdapter;
    private int positionSelect = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.lvPlatis);
        loadDataDonut();

        listAdapter = new ArrayAdapter<platis>(this, 0, listPlatis) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
                convertView = inflater.inflate(R.layout.platis_item, null);

                TextView tvPlatisName = convertView.findViewById(R.id.tvPlatisName);
                TextView tvPlatisDes = convertView.findViewById(R.id.tvPlatisDes);
                TextView tvPlatisPrice = convertView.findViewById(R.id.tvPlatisPrice);
                ImageView lvImg = convertView.findViewById(R.id.imageView);
                platis donut = listPlatis.get(position);
                tvPlatisName.setText(donut.getName());
                tvPlatisDes.setText(donut.getDescription());
                tvPlatisPrice.setText("$ " + donut.getPrice() + ".00");
                lvImg.setImageResource(donut.getImg());

                return convertView;
            }
        };
        listView.setAdapter(listAdapter);

        }


        private void loadDataDonut() {
            listPlatis = new ArrayList<>();
            listPlatis.add(new platis(R.drawable.niceglass2_removebg_preview_1,"Platis Optical",15,"for man"));
            listPlatis.add(new platis(R.drawable.g_rm_1,"Non-Platis",19,"for man"));
            listPlatis.add(new platis(R.drawable.niceglass4_removebg_preview_1,"Optical fiber",10,"for man"));
            listPlatis.add(new platis(R.drawable.niceglass6_removebg_preview_1,"Platis Optical",11,"for man"));


        }

}