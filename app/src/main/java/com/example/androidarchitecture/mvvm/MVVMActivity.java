package com.example.androidarchitecture.mvvm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.androidarchitecture.R;
import com.example.androidarchitecture.mvc.MVCActivity;

public class MVVMActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvvmactivity);
        setTitle("MVVM Activity");
    }

    public static Intent getIntent(Context context){
        return new Intent(context, MVVMActivity.class);
    }
}