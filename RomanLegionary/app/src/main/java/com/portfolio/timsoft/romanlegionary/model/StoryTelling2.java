package com.portfolio.timsoft.romanlegionary.model;

import com.portfolio.timsoft.romanlegionary.R;

/**
 * Created by timschijvenaars on 18/07/2017.
 */

public class StoryTelling2 implements Story {

    public StoryTelling2() {
        /*********************************************************************/
        pages[0] = new Page(
                R.drawable.ic_roman_unknown,
                R.drawable.forest,
                "You are going to start the story about an unknown slave. You are called \"Marcus's puer\", where the word puer is loosely" +
                        " translated to boy. This means you are a slave/boy of Marcus. Marcus is a rich trader and beginning statesman.",
                new Choice("Start Journey",1)
        );
        pages[1] = new Page(
                R.drawable.ic_roman_senator,
                R.drawable.forest,
                "After roaming in the woods for a couple of days: tired, hungry and broken, you reach the end of the treeline. There is a huge " +
                        "field and you see a small farm far away. Since you don't know where you are, the people can be friendly or hostile." +
                        " What should I do?",
                new Choice("Run to the farm",2),
                new Choice("Wait for the night",3),
                new Choice("Go the other way",4)
        );
        /*********************************************************************/

    }

    @Override
    public Page getPage(int index){
        return pages[index];
    }
}
