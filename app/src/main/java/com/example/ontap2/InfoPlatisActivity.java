package com.example.ontap2;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InfoPlatisActivity extends AppCompatActivity {
    TextView tvPlantsName;
    TextView tvPlantsPrice;
    TextView tvPlantsDes;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_info_donut);
        tvPlantsName = findViewById(R.id.tvPlatisName);
        tvPlantsPrice = findViewById(R.id.tvPlatisPrice);
        tvPlantsDes = findViewById(R.id.tvPlatisDes);
        imageView = findViewById(R.id.imageView);

        String resourceId = getIntent().getStringExtra("resourceId");
        String name = getIntent().getStringExtra("name");
        String des = getIntent().getStringExtra("des");
        String price = getIntent().getStringExtra("price");

        imageView.setImageResource(Integer.valueOf(resourceId));
        tvPlantsName.setText(name);tvPlantsDes.setText(des);tvPlantsPrice.setText(price);
    }
}
