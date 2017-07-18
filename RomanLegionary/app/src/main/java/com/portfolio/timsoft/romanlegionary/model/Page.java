package com.portfolio.timsoft.romanlegionary.model;

/**
 * Created by timsc on 16-4-2016.
 */
public class Page
{

    private String mText;
    private Choice choice1;
    private Choice choice2;
    private Choice choice3;
    private boolean isEnd = false;
    private int playerIcon;
    private int backgroundIcon;

    public Page(int playerIcon, int backgroundIcon, String txt, Choice c1, Choice c2, Choice c3)
    {
        this.playerIcon = playerIcon;
        this.backgroundIcon = backgroundIcon;
        this.mText = txt;
        this.choice1 = c1;
        this.choice2 = c2;
        this.choice3 = c3;
    }

    public Page(int playerIcon, int backgroundIcon, String txt, Choice c1, Choice c2){
        this.playerIcon = playerIcon;
        this.backgroundIcon = backgroundIcon;
        this.mText = txt;
        this.choice1 = c1;
        this.choice2 = c2;
        this.choice3 = null;
    }

    public Page(int playerIcon, int backgroundIcon, String txt, Choice c1){
        this.playerIcon = playerIcon;
        this.backgroundIcon = backgroundIcon;
        this.mText = txt;
        this.choice1 = c1;
        this.choice2 = null;
        this.choice3 = null;
    }

    public Page(String txt){
        this.mText = txt;
        this.backgroundIcon = backgroundIcon;
        this.isEnd = true;
        this.choice1 = null;
        this.choice2 = null;
        this.choice3 = null;
    }

    public String getText() {
        return mText;
    }

    public void setText(String mText) {
        this.mText = mText;
    }

    public Choice getChoice1() {
        return choice1;
    }

    public void setChoice1(Choice choice1) {
        this.choice1 = choice1;
    }

    public Choice getChoice2() {
        return choice2;
    }

    public void setChoice2(Choice choice2) {
        this.choice2 = choice2;
    }

    public Choice getChoice3() {
        return choice3;
    }

    public void setChoice3(Choice choice3) {
        this.choice3 = choice3;
    }

    public boolean isEnd() {
        return isEnd;
    }

    public void setIsEnd(boolean isEnd) {
        this.isEnd = isEnd;
    }

    public int getPlayerIcon() {
        return playerIcon;
    }

    public void setPlayerIcon(int playerIcon) {
        this.playerIcon = playerIcon;
    }

    public int getBackgroundIcon() {
        return backgroundIcon;
    }

    public void setBackgroundIcon(int backgroundIcon) {
        this.backgroundIcon = backgroundIcon;
    }
}
