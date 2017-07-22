package com.portfolio.timsoft.romanlegionary.ui;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.portfolio.timsoft.romanlegionary.R;

public class MainActivity extends AppCompatActivity {

      TextView startButton1;
      TextView startButton2;
      TextView startButton3;
      TextView backgroundButton;
      TextView settingsButton;
      TextView exitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton1 = (TextView)findViewById(R.id.startStory1But);
        startButton2 = (TextView)findViewById(R.id.startStory2But);
        startButton3 = (TextView)findViewById(R.id.startStory3But);
        backgroundButton = (TextView)findViewById(R.id.backgroundBut);
        settingsButton = (TextView)findViewById(R.id.settingsBut);
        exitButton = (TextView)findViewById(R.id.exitBut);

        settingsButton.setVisibility(View.INVISIBLE);

        Typeface face = Typeface.createFromAsset(getAssets(),"fonts/pixelFont.ttf");
        startButton1.setTypeface(face);
        startButton2.setTypeface(face);
        startButton3.setTypeface(face);
        backgroundButton.setTypeface(face);
        settingsButton.setTypeface(face);
        exitButton.setTypeface(face);
    }

    public void onClickStart1(View v) {
        Intent i=new Intent(MainActivity.this, StartActivity.class);
        i.putExtra("start", "citizen");
        startActivity(i);
    }

    public void onClickStart2(View v) {
        Intent i=new Intent(MainActivity.this, StartActivity.class);
        i.putExtra("start", "slave");
        startActivity(i);
    }

    public void onClickStart3(View v) {
        Intent i=new Intent(MainActivity.this, StartActivity.class);
        i.putExtra("start", "senator");
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
