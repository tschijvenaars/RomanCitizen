package com.portfolio.timsoft.romanlegionary.model;

import com.portfolio.timsoft.romanlegionary.R;

/**
 * Created by timschijvenaars on 18/07/2017.
 */

public class StoryTelling2 implements Story {

    public StoryTelling2() {
        /*********************************************************************/
        pages[0] = new Page(
                R.drawable.ic_slave_gladiator_noob,
                R.drawable.trainingground,
                "You are going to start the story about an unknown slave. You are called \"Marcus's puer\", where the word puer is loosely" +
                        " translated to boy. This means you are a slave/boy of Marcus. Marcus is a rich trader and beginning statesman.",
                new Choice("Start Journey",1)
        );
        pages[1] = new Page(
                R.drawable.ic_slave_gladiator_noob,
                R.drawable.trainingground,
                "One day, you wake up to the voice of Marcus. You jump right up. What does the master want form you? Why has he come personally to you?" +
                        " Usually the slave master gives the orders around. But apparently it's that important. Then you hear it: " +
                        "\"Slave, you are going to fight for me as a gladiator.\" You have no other choice then to obey him...",
                new Choice("Obey",2)
        );
        /*********************************************************************/
        pages[2] = new Page(
                R.drawable.ic_slave_gladiator_noob_sword,
                R.drawable.trainingground,
                "It's training day. You and several other slaves are given a sword. The slave master is explaining some of the techniques. Everyone can die during the training. " +
                        "After some basic moves, the slave master asks for volunteers. Do you volunteer or not?",
                new Choice("Volunteer",3),
                new Choice("Refuse",4)
        );
        pages[3] = new Page(
                R.drawable.ic_slave_gladiator_noob_sword,
                R.drawable.trainingground,
                "\"I-I... I volunteer\", you say. You stand in front of the slave master. He looks very intimidating. You tell yourself, you can learn from this fight. " +
                        "As your enemy prepares, you do too. What stance do you take?",
                new Choice("Charge",5),
                new Choice("Defensive",6),
                new Choice("Wait until you see his move",7)
        );
        pages[5] = new Page(
                R.drawable.ic_slave_gladiator_noob_sword,
                R.drawable.trainingground,
                "You charge at your enemy. Mid-charge, you swing your sword at the enemy. While you think you have a reasonable chance to hit him, " +
                        "he avoids your attack and makes you trip. You are laying at the ground, looking him in his eyes. " +
                        "\"Well done, I like your vigor! You know I can kill you right now right?\", he says. After that he walks away and orders all the slaves " +
                        "to train on each other.",
                new Choice("End a successful training day",8)
        );
        pages[6] = new Page(
                R.drawable.ic_slave_gladiator_noob_sword,
                R.drawable.trainingground,
                "You take on a defensive stance. Since you don't have a shield, it's not that effective. He charges at you. Somehow, during the adrenaline rush, you manage to deflect the attack. " +
                        "You have a split second to react. What do you do?",
                new Choice("Counter",10),
                new Choice("Take on defensive stance again",11)
        );
        pages[7] = new Page(
                R.drawable.ic_slave_gladiator_noob_sword,
                R.drawable.trainingground,
                "He charges at you and knocks you down. \"You know I can kill you right now right?\", he says. After that he walks away and orders all the slaves " +
                "to train on each other.",
                new Choice("End training day",9)
        );
        pages[8] = new Page(
                R.drawable.ic_slave_gladiator_noob,
                R.drawable.trainingground,
                "A few hours pass. You take some beatings and you give some beatings. You feel confident about yourself. You really gained some experience today! All the thing's I've learned, will surely be useful in the upcoming battle! Now I've got to rest.",
                new Choice("Go to sleep",13)
        );
        pages[9] = new Page(
                R.drawable.ic_slave_gladiator_noob_wounded,
                R.drawable.trainingground,
                "A few hours pass. You take some beatings and give some beatings. You regret the mistakes you made today. What could I have done different? You get nervous " +
                        "thinking about the upcoming battle. Am I going to survive?",
                new Choice("Go to sleep",99)
        );
        pages[10] = new Page(
                R.drawable.ic_slave_gladiator_noob_sword,
                R.drawable.trainingground,
                "In the moment your opponent is recovering, you hit him. Your hit was successful. \"Well done slave, maybe you're not that useless after all.\", he says. " +
                        "After that he walks away and orders all the slaves " +
                        "to train on each other.",
                new Choice("End successful training day",8)
        );
        pages[11] = new Page(
                R.drawable.ic_slave_gladiator_noob_sword,
                R.drawable.trainingground,
                "You take on a defensive stance again. \"You shouldn't have done that\", says your slave master. He then vigorously charges at you and tackles you. You are scared of his anger. " +
                        "\"You know I can kill you right now right?\", he says. After that he walks away and orders all the slaves " +
                        "to train on each other.",
                new Choice("End training day",9)
        );
        /**********************************************************************/
        pages[4] = new Page(
                R.drawable.ic_slave_gladiator_noob_sword,
                R.drawable.forest,
                "Why would you volunteer? It's dangerous! \"No volunteers huh?\", the slave master shouts, \"You there!\". He points at a really fragile looking slave. " +
                        "He looks scared. As he and the slave master both prepare to start the mock-fight, you and the other slaves watch. " +
                        "Then the fight begins, only to end a little while later. As the slave master charges at the slave, the slave obviously didn't know what to do. " +
                        "The master knocks the slave down after a hard charge, after which he begins to hit the slave. The slave is heavily wounded and is carried away. " +
                        "\"Let this be an example for you all!\", the master says. \"You! Hopefully you can do it better...\", he says after pointing at you." +
                        "You should step forward to fight.",
                new Choice("Obey",12)
        );
        pages[12] = new Page(
                R.drawable.ic_slave_gladiator_noob_sword,
                R.drawable.trainingground,
                "\"Yes master\", you say. You stand in front of the slave master. He looks very intimidating. You tell yourself, you can learn from this fight. " +
                        "As your enemy prepares, you do too. What stance do you take?",
                new Choice("Charge",5),
                new Choice("Defensive",6),
                new Choice("Wait until you see his move",7)
        );
        /********************************* Experience *************************************/
        pages[13] = new Page(
                R.drawable.ic_slave_gladiator_noob_sword_shield,
                R.drawable.stadium,
                "A few weeks pass. Hard trainings, minor wounds make you tougher. Today is the day of your first fight. You have learned a lot. You are given a sword and a shield.",
                new Choice("Go on",14)
        );
        pages[14] = new Page(
                R.drawable.ic_slave_enemy_net_spear,
                R.drawable.stadium,
                "You hear your opponent will be a more experienced slave, with a net and a spear.",
                new Choice("Go on",15)
        );
        pages[15] = new Page(
                R.drawable.ic_slave_gladiator_noob_sword_shield,
                R.drawable.stadium,
                "Still you are really confident. You both enter the ring. The crowd cheers. They want to see someone die today. After you both reach the center. You think of your next move. " +
                        "Which is that?",
                new Choice("Charge",5),
                new Choice("Aggressive",6),
                new Choice("Defensive",7)
        );
        /********************************* No Experience *************************************/
    }

    @Override
    public Page getPage(int index){
        return pages[index];
    }
}
