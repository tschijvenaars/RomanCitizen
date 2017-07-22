package com.portfolio.timsoft.romanlegionary.model;

/**
 * Created by timschijvenaars on 18/07/2017.
 */

public interface Story {

    Page[] pages = new Page[100];

    Page getPage(int index);


}
