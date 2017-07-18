package com.portfolio.timsoft.romanlegionary.ui;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.portfolio.timsoft.romanlegionary.R;

public class SettingsActivity extends AppCompatActivity {

    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        title = (TextView)findViewById(R.id.title);

        Typeface face = Typeface.createFromAsset(getAssets(),"fonts/pixelFont.ttf");
        title.setTypeface(face);
    }

}
