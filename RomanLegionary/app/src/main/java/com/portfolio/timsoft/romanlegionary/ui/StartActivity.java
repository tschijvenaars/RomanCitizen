package com.portfolio.timsoft.romanlegionary.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.portfolio.timsoft.romanlegionary.R;
import com.portfolio.timsoft.romanlegionary.model.Page;
import com.portfolio.timsoft.romanlegionary.model.StoryTelling;

public class StartActivity extends AppCompatActivity {

    ImageView player;
    ImageView backImg;

    TextView storyText;
    Button choice1;
    Button choice2;
    Button choice3;

    ImageView stats;
    ImageView settings;
    ImageView home;
    private Page mCurrentPage;
    private StoryTelling story;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        player = (ImageView)findViewById(R.id.character);
        storyText = (TextView)findViewById(R.id.storyText);
        choice1 = (Button)findViewById(R.id.choiceBut1);
        choice2 = (Button)findViewById(R.id.choiceBut2);
        choice3 = (Button)findViewById(R.id.choiceBut3);
        //stats = (ImageView)findViewById(R.id.playerStats);
        //settings = (ImageView)findViewById(R.id.settings);
        //home = (ImageView)findViewById(R.id.home);
        backImg = (ImageView)findViewById(R.id.backImage);

        Typeface face = Typeface.createFromAsset(getAssets(),"fonts/pixelFont.ttf");
        storyText.setTypeface(face);
        choice1.setTypeface(face);
        choice2.setTypeface(face);
        choice3.setTypeface(face);

        choice1.setText("Start Journey");
        choice2.setVisibility(View.INVISIBLE);
        choice3.setVisibility(View.INVISIBLE);
        story = new StoryTelling();
        loadPage(0);
    }

//    public void onStatsClick(View v){
//
//    }

//    public void onSettingsClick(View v){
//
//    }
//
//    public void onHomeClick(View v){
//
//    }

    private void loadPage(int index){
        mCurrentPage = story.getPage(index);

        String text = mCurrentPage.getText();
        storyText.setText(text);

        if(mCurrentPage.getChoice1().getText() == "Main Menu"){
            mCurrentPage.setIsEnd(true);
        }

        if(mCurrentPage.isEnd()){
            choice1.setText(mCurrentPage.getChoice1().getText());
            choice2.setVisibility(View.INVISIBLE);
            choice3.setVisibility(View.INVISIBLE);
            choice1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }else {
                Drawable background = getResources().getDrawable(mCurrentPage.getBackgroundIcon(), getTheme());
                backImg.setImageDrawable(background);

                Drawable drawable = getResources().getDrawable(mCurrentPage.getPlayerIcon(), getTheme());
                player.setImageDrawable(drawable);

                if(mCurrentPage.getChoice1() != null) {
                    choice1.setVisibility(View.VISIBLE);
                    choice1.setText(mCurrentPage.getChoice1().getText());
                }else{
                    choice1.setVisibility(View.INVISIBLE);
                }
                if(mCurrentPage.getChoice2() != null) {
                    choice2.setVisibility(View.VISIBLE);
                    choice2.setText(mCurrentPage.getChoice2().getText());
                }else{
                    choice2.setVisibility(View.INVISIBLE);
                }
                if(mCurrentPage.getChoice3() != null) {
                    choice3.setVisibility(View.VISIBLE);
                    choice3.setText(mCurrentPage.getChoice3().getText());
                }else{
                    choice3.setVisibility(View.INVISIBLE);
                }

                choice1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int nextPage = mCurrentPage.getChoice1().getNextPage();
                        loadPage(nextPage);
                    }
                });

                choice2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int nextPage = mCurrentPage.getChoice2().getNextPage();
                        loadPage(nextPage);
                    }
                });

                choice3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int nextPage = mCurrentPage.getChoice3().getNextPage();
                        loadPage(nextPage);
                    }
                });

        }
    }

    @Override
    public void onBackPressed()
    {
        Context context = this.getApplicationContext();
        CharSequence text = "Finish the story, Coward!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

}
