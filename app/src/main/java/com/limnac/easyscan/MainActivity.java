package com.limnac.easyscan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.limnac.easyscan.Activity.EasyScanManager;
import com.limnac.easyscan.Activity.IEasyScan;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnScan = findViewById(R.id.btn_scan);
        btnScan.setOnClickListener(v -> {
            EasyScanManager.getInstance().startEasyScan(this, new IEasyScan() {
                @Override
                public void getScanInfo(String msg) {
                    Toast.makeText(getApplication(),msg,Toast.LENGTH_LONG).show();
                }
            });
        });
    }
}