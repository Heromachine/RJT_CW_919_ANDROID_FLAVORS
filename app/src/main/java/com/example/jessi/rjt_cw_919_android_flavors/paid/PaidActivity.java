package com.example.jessi.rjt_cw_919_android_flavors.paid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.example.jessi.rjt_cw_919_android_flavors.R;

public class PaidActivity extends AppCompatActivity {

    Button button;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paid);
    }
}
