package com.portfolio.timsoft.romanlegionary.ui;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.portfolio.timsoft.romanlegionary.R;

import butterknife.Bind;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

      TextView startButton;
      TextView backgroundButton;
      TextView settingsButton;
      TextView exitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton = (TextView)findViewById(R.id.startBut);
        backgroundButton = (TextView)findViewById(R.id.backgroundBut);
        settingsButton = (TextView)findViewById(R.id.settingsBut);
        exitButton = (TextView)findViewById(R.id.exitBut);

        settingsButton.setVisibility(View.INVISIBLE);

        Typeface face = Typeface.createFromAsset(getAssets(),"fonts/pixelFont.ttf");
        startButton.setTypeface(face);
        backgroundButton.setTypeface(face);
        settingsButton.setTypeface(face);
        exitButton.setTypeface(face);
    }

    public void onClickStart(View v) {
        Intent i=new Intent(MainActivity.this, StartActivity.class);
        startActivity(i);
    }

    public void onClickBack(View v) {
        Intent i=new Intent(MainActivity.this, BackgroundActivity.class);
        startActivity(i);
    }

    public void onClickSettings(View v) {
        Intent i=new Intent(MainActivity.this, SettingsActivity.class);
        startActivity(i);
    }

    public void onClickExit(View v) {
        this.finish();
        System.exit(0);
    }


}
