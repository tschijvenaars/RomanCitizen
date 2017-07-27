package com.portfolio.timsoft.romanlegionary.model;

import com.portfolio.timsoft.romanlegionary.R;

/**
 * Created by timschijvenaars on 18/07/2017.
 */

public class StoryTelling3 implements Story {

    public StoryTelling3() {
        /*********************************************************************/
//        pages[0] = new Page(
//                R.drawable.ic_roman_senator,
//                R.drawable.forest,
//                "Blieb bloeb",
//                new Choice("Start Journey",1)
//        );
//        pages[1] = new Page(
//                R.drawable.ic_roman_senator,
//                R.drawable.forest,
//                "Hardyharrr",
//                new Choice("Run to the farm",2),
//                new Choice("Wait for the night",3),
//                new Choice("Go the other way",4)
//        );
        /*********************************************************************/

    }

    @Override
    public Page getPage(int index){
        return pages[index];
    }

}
