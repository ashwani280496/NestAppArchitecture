package com.example.basearchitecture;

public class SocietyActivity extends BaseActivity {


    @Override
    int getContentViewId() {
        return R.layout.activity_society;
    }

    @Override
    int getNavigationMenuItemId() {
        return R.id.society;
    }
}