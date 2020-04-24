package com.example.basearchitecture;

public class HomeActivity extends BaseActivity {


    @Override
    int getContentViewId() {
        return R.layout.activity_home;
    }

    @Override
    int getNavigationMenuItemId() {
        return R.id.home;
    }

}