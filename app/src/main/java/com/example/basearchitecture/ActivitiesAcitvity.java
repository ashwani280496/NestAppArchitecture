package com.example.basearchitecture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ActivitiesAcitvity extends BaseActivity {

    @Override
    int getContentViewId() {
        return R.layout.activity_main;
    }

    @Override
    int getNavigationMenuItemId() {
        return R.id.activity;
    }
}
