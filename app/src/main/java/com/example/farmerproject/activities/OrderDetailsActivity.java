package com.example.farmerproject.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.farmerproject.R;

public class OrderDetailsActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private Button btn_refuse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        toolbar.setTitle("تفاصيل الطلب");
//        getSupportActionBar().setTitle("تفاصيل الطلب");

        btn_refuse = findViewById(R.id.orderDetails_refuse);

        btn_refuse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),RefuseCauseActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }

}