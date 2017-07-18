package com.portfolio.timsoft.romanlegionary.model;

/**
 * Created by timsc on 16-4-2016.
 */
public class Choice
{
    private String mText;
    private int mNextPage;

    public Choice(String txt, int nxtPage){
        this.mText = txt;
        this.mNextPage = nxtPage;
    }

    public String getText() {
        return mText;
    }

    public void setText(String mText) {
        this.mText = mText;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int mNextPage) {
        this.mNextPage = mNextPage;
    }
}
