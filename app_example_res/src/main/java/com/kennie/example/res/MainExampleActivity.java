package com.kennie.example.res;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;

import com.kennie.example.res.R;

public class MainExampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_example);
        CheckBox mDisableCamera = findViewById(R.id.cb_disable_camera);
        mDisableCamera.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked){
                mDisableCamera.setText("开启摄像头");
            }else{
                mDisableCamera.setText("关闭摄像头");

            }
        });
    }
}