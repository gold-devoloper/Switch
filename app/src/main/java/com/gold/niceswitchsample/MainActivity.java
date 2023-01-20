package com.gold.niceswitchsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.gold.niceswitch.NiceSwitch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NiceSwitch niceSwitch = findViewById(R.id.niceSwitch);


        niceSwitch.setOnCheckedChangedListener(checked -> {
            Toast.makeText(this, checked + "", Toast.LENGTH_SHORT).show();
        });
    }
}
