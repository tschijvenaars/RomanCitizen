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

public class BackgroundActivity extends AppCompatActivity {

    TextView title;
    TextView background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_background);

        title = (TextView)findViewById(R.id.title);
        background = (TextView)findViewById(R.id.storyText);

        Typeface face = Typeface.createFromAsset(getAssets(),"fonts/pixelFont.ttf");
        title.setTypeface(face);
        background.setTypeface(face);
    }

}
