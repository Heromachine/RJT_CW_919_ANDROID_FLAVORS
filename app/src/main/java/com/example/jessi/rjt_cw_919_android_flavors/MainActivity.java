package com.example.jessi.rjt_cw_919_android_flavors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.jessi.rjt_cw_919_android_flavors.free.FreeActivity;
import com.example.jessi.rjt_cw_919_android_flavors.monkey.Monkey;
import com.example.jessi.rjt_cw_919_android_flavors.paid.PaidActivity;

public class MainActivity extends AppCompatActivity {

    Button button;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, ""+BuildConfig.FLAVOR.toString(), Toast.LENGTH_LONG).show();
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if(BuildConfig.FLAVOR.equals("free"))
                {
                    intent = new Intent(MainActivity.this, FreeActivity.class);

                }else if (BuildConfig.FLAVOR.equals("paid"))
                {

                    intent = new Intent(MainActivity.this, PaidActivity.class);
                }
                else if (BuildConfig.FLAVOR.equals("monkey"))
                {
                    intent = new Intent(MainActivity.this, Monkey.class);
                }
                startActivity(intent);
            }
        });
    }
}
