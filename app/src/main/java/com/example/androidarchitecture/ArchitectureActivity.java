package com.example.androidarchitecture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.androidarchitecture.mvc.MVCActivity;
import com.example.androidarchitecture.mvp.MVPActivity;
import com.example.androidarchitecture.mvvm.MVVMActivity;

public class ArchitectureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_architecture);
    }

    public void onMVC(View view){
        startActivity(MVCActivity.getIntent(this));
    }

    public void onMVP(View view){
        startActivity(MVPActivity.getIntent(this));
    }

    public void onMVVM(View view){
        startActivity(MVVMActivity.getIntent(this));
    }
}