package com.gacrnd.gcs.activitylaunchmode;

import android.os.Bundle;

public class MainActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected String getTAG(){
        return "MainActivity";
    }
}

