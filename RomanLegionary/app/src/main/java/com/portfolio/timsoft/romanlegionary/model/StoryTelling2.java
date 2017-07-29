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
        /********************************** No volunteer ************************************/
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
                R.drawable.halls,
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
                "Still you are really confident. You both enter the ring. The crowd cheers. They want to see someone die today. After you both reach the center, you think of your next move. " +
                        "Which is that?",
                new Choice("Charge at him",16),
                new Choice("Be Aggressive",17),
                new Choice("Be Defensive",18)
        );
        pages[16] = new Page(
                R.drawable.ic_slave_gladiator_noob_sword_shield,
                R.drawable.stadium,
                "You thought of your training. Attack is the best defence. You charge at your opponent. You see him preparing his net to throw at you. " +
                        "You quickly jump out of the way the moment he throws his net. Charging at him, he tries to ready his spear. " +
                        "He is not fast enough. You bash him with your shield.",
                new Choice("Bash him",19)
        );
        pages[17] = new Page(
                R.drawable.ic_slave_gladiator_noob_sword,
                R.drawable.stadium,
                "You start taunting your opponent. You remember your training. The opponent comes at you, pointing his spear. He launches a series of attacks with his spear, " +
                        "which you all deflect with your sword. He starts twirling his net, preparing to throw it at you. " +
                        "Then the moment he tries to throw his net at you, you throw your shield. While the shield gets constricted in your opponents net, it falls on the ground mid-air. " +
                        "Your opponent is stunned. You run at him. He has no time to prepare a defence. You hit him with your sword, slashing his arm. " +
                        "He lets go of his spear and is bleeding very hard. You tackle him.",
                new Choice("Tackle him",19)
        );
        pages[18] = new Page(
                R.drawable.ic_slave_gladiator_noob_sword_shield,
                R.drawable.stadium,
                "You hold up your shield. You remember your training. Maybe this isn't the best way to prepare. He has a net and all... " +
                        "Still you don't get your hopes up. The opponent comes at you, pointing his spear. He then launches a series of attacks with his spear. " +
                        "You keep up your shield. Because of his spear,you keep your distance. Hopefully he will let his guard down so you can strike. " +
                        "He starts twirling his net, preparing to throw it at you. \"Uh Oh\", you think. " +
                        "He then gives a couple of stabs with his spear. You guard yourself with your shield.",
                new Choice("Guard",20)
        );
        pages[20] = new Page(
                R.drawable.ic_slave_gladiator_noob_sword_shield,
                R.drawable.stadium,
                "You hold up your shield to defend yourself. He stops attacking and throws his net. Because you were guarding yourself, you have no time to react. " +
                        "You get constricted in the net. Your enemy comes closer. He pokes you with his spear, which you desperately try to guard against. " +
                        "He hits you in the arm and the leg. You fall on the ground because of the pain...",
                new Choice("Wait",21)
        );
        /********************************* No Experience *************************************/
        pages[22] = new Page(
                R.drawable.ic_slave_gladiator_noob_sword_shield,
                R.drawable.halls,
                "A few weeks pass. You trained hard but it was way too much. You got wounded a lot of times and you aren't as quick on your feet as before. Today is the day of your first fight. You are really nervous. You are given a sword and a shield.",
                new Choice("Go on",14)
        );
        pages[23] = new Page(
                R.drawable.ic_slave_enemy_net_spear,
                R.drawable.stadium,
                "You hear your opponent will be a way more experienced slave, with a net and a spear.",
                new Choice("Go on",15)
        );
        pages[24] = new Page(
                R.drawable.ic_slave_gladiator_noob_sword_shield,
                R.drawable.stadium,
                "You have little confidence in yourself. Since the first training, you despised being a gladiator. You both enter the ring. The crowd cheers. They want to see someone die today. After you both reach the center, you think of your next move. " +
                        "Which is that?",
                new Choice("Charge at him",25),
                new Choice("Be Aggressive",26),
                new Choice("Be Defensive",27)
        );
        pages[25] = new Page(
                R.drawable.ic_slave_gladiator_noob_sword_shield,
                R.drawable.stadium,
                "Let's try to charge him. As you start running at him, you immediately regret it. You aren't as agile as you used to be. You have had several injuries which gave you a slight limb. " +
                        "He starts twirling his net, preparing to throw it at you. \"Uh Oh\", you think. You slow down. \n" +
                        "He then gives a couple of stabs with his spear. You guard yourself with your shield.\"",
                new Choice("Guard",20)
        );
        pages[26] = new Page(
                R.drawable.ic_slave_gladiator_noob_sword,
                R.drawable.stadium,
                "You try to intimidate him by bashing your sword against your shield and roaring. It doesn't seem to work very much. " +
                        "He attacks you with his spear, which you try to deflect. With success. He starts twirling his net, preparing to throw it at you." +
                        "While he does that, you come slowly closer, deflecting his spear attacks.",
                new Choice("Get closer",28)
        );
        pages[27] = new Page(
                R.drawable.ic_slave_gladiator_noob_sword_shield,
                R.drawable.stadium,
                "You hold up your shield. You remember your training. Maybe this isn't the best way to prepare. He has a net and all... " +
                        "Still you don't get your hopes up. The opponent comes at you, pointing his spear. He then launches a series of attacks with his spear. " +
                        "You keep up your shield. Because of his spear,you keep your distance. Hopefully he will let his guard down so you can strike. " +
                        "He starts twirling his net, preparing to throw it at you. \"Uh Oh\", you think. " +
                        "He then gives a couple of stabs with his spear. You guard yourself with your shield.",
                new Choice("Guard",20)
        );
        pages[28] = new Page(
                R.drawable.ic_slave_gladiator_noob_sword,
                R.drawable.stadium,
                "You managed to fend of his spear attacks. You are so close to him his net can't be thrown. It's an intense fight, you are getting tired trying to block all his attacks. " +
                        "You decide to end it for once and for all. You suddenly think of all your training. What should you do?",
                new Choice("Bash him with your shield",19),
                new Choice("Try to slash him",29)
        );
        pages[29] = new Page(
                R.drawable.ic_slave_gladiator_noob_sword,
                R.drawable.stadium,
                "You try to slash him. You lower your shield and try... but your opponent is faster. As he is more experienced and you are not as agile. " +
                        "The moment you lower your guard, he attacks you. He gets three hits with his spear, of which two in your leg. You immediately fall on the ground.",
                new Choice("Wait",21)
        );
        /********************************* Good ending Fight 1 *************************************/
        pages[19] = new Page(
                R.drawable.ic_slave_gladiator_noob_sword_shield,
                R.drawable.stadium,
                "He falls over. This all went a lot better then expected! You point your sword at him. Then look at the crowd in the stadium. " +
                        "Lastly you point at the senator. You wait for his verdict. It gets really silent all of a sudden. The senator stands up..." +
                        "\r\n Then he puts his thumb down. KILL! The crowd starts shouting and cheering. You should kill your opponent.",
                new Choice("Kill him",30)
        );
        /********************************* Bad ending Fight 1 *************************************/
        pages[21] = new Page(
                R.drawable.ic_slave_gladiator_noob_sword_shield,
                R.drawable.stadium,
                "You are in so much pain. You hear the crowd shouting. They want to see more blood. Then it gets really silent. " +
                        "Your vision blurs. Suddenly you hear the crowd shouting and cheering again. I guess this is the end... " +
                        "That is your last thought. You died.",
                new Choice("Main Menu",1)
        );
        /********************************* Survived Battle one *************************************/
        pages[30] = new Page(
                R.drawable.ic_slave_gladiator_experienced,
                R.drawable.halls,
                "The crowd goes wild! Today has been a good day, and you live to fight another day. You return to your chamber where you can eat and rest.",
                new Choice("End your day",31)
        );
        pages[31] = new Page(
                R.drawable.ic_slave_gladiator_experienced,
                R.drawable.trainingground,
                "Again months go by. You train, you win fights and you get treated better. Marcus, your master, is proud of you. One day, he wants to talk to you privately. \"Slave! I'm really proud of you. You have earned me a lot of money\", he says. " +
                        "\"You probably wonder why I wanted to talk to you privately?\". \"Well slave, I am prepared to set you free and grant you citizenship\". You can't believe what he says. Freedom? At last!",
                new Choice("Ask him why",32),
                new Choice("Thanks him",32)
        );
        pages[32] = new Page(
                R.drawable.ic_slave_gladiator_experienced,
                R.drawable.trainingground,
                "\"You probably know what's next...\", he says while looking you straight in the eyes.\"You have to win your next fight\". ",
                new Choice("Tell him that will be done",33)
        );
        pages[33] = new Page(
                R.drawable.ic_slave_gladiator_experienced,
                R.drawable.trainingground,
                "\"Good! Now, go rest and train. Your next battle is only a couple of days away!\". Marcus leaves. You feel happy and nervous at the same time. I've won multiple times and have quite some battles. I wonder why he wants to set me free.",
                new Choice("Skip to the fight",34)
        );
        pages[34] = new Page(
                R.drawable.ic_empty,
                R.drawable.stadium2,
                "The day has come... You have to fight your final battle. After this you are a free man! If you survive...",
                new Choice("Receive your equipment",35)
        );
        pages[35] = new Page(
                R.drawable.ic_slave_gladiator_experienced_sword_bucket,
                R.drawable.stadium2,
                "You receive your equipment. You get some body armor, a sword and a buckler shield. You also get some information about your opponent.",
                new Choice("Hear about your opponent.",36)
        );
        pages[36] = new Page(
                R.drawable.ic_slave_enemy_dual,
                R.drawable.stadium2,
                "Your enemy is Brutus, the biggest, baddest gladiator there is. You hear he's tough, but maybe you are more cunning.",
                new Choice("Go on",37)
        );
        pages[37] = new Page(
                R.drawable.ic_slave_gladiator_experienced_sword_bucket,
                R.drawable.stadium2,
                "That is probably why Marcus wanted to set you free. The stakes are so high, if you win this fight, he will be incredibly rich! Well now. It's time to fight. You prepare and enter the arena. " +
                        "So does Brutus. He is a giant, maybe 2 feet bigger then you. As he walks in the ring, the crowd begins to cheer. They are all routing for Brutus. You start to get nervous, but you think of your possible freedom. " +
                        "Lets win!",
                new Choice("Prepare",38)
        );
        pages[38] = new Page(
                R.drawable.ic_slave_gladiator_experienced_sword_bucket,
                R.drawable.stadium2,
                "You have to think about your strategy. You have body armor and a small shield, but he is bigger and has two swords. In the past, defence wasn't that good of a choice, but maybe it is today? " +
                        "You have to decide quick.",
                new Choice("Charge",39),
                new Choice("Aggressive",43),
                new Choice("Defensive",39)
        );
        /********************************* Charge *************************************/
        pages[39] = new Page(
                R.drawable.ic_slave_gladiator_experienced_sword_bucket,
                R.drawable.stadium2,
                "You chose to charge him. He might be big, but in the past, some quick action always worked. You start running at Brutus with your weapon ready. " +
                        "Wait, what is he doing now? He is charging at you too! What should you do?",
                new Choice("Keep charging",40),
                new Choice("Try to dodge Brutus",42)
        );
        pages[40] = new Page(
                R.drawable.ic_slave_gladiator_experienced_sword_bucket,
                R.drawable.stadium2,
                "You decide to keep running. You'll win or you die. You already accepted that fact. You bash away his sword blow with your shield but... His brute force makes you fall down. You flip over and land on your back. " +
                        "Brutus is recharging from the charge. He walks to you. You stand up.",
                new Choice("Stand up",41)
        );
        pages[41] = new Page(
                R.drawable.ic_slave_gladiator_experienced_sword_bucket,
                R.drawable.stadium2,
                "You stand up, feeling faint. You also have headaches and your vision is blurred. That charge gave you an concussion. That man really is a giant. You see him walking at you and he starts running again. " +
                        "You are too weak to do something. Next moment you feel a hard tackle. You lose consciousness. Brutus stands near your body and appeals to the public. It's clear they want you to die. " +
                        "Brutus kills you...",
                new Choice("The Afterlife",99)
        );
        pages[42] = new Page(
                R.drawable.ic_slave_gladiator_experienced_sword_bucket,
                R.drawable.stadium2,
                "You decide to try to dodge your opponent. Sadly, Brutus is really big and he fought a lot of fights. You soon acknowledge your action is hopeless. Brutus tackles you with all his power. You get knocked on the ground really hard. " +
                        "You should stand up before something bad happens.",
                new Choice("Stand up",41)
        );
        /********************************* Aggressive *************************************/
        pages[43] = new Page(
                R.drawable.ic_slave_gladiator_experienced_sword_bucket,
                R.drawable.stadium2,
                "You decide to be aggressive. He might be big, but that just means he falls harder. You take a deep breath, in through your nose and out through your mouth. You are standing in the ring, ready to fight. " +
                        "Brutus however, is appealing to the public by cheering and shouting. He really takes his time. What are you doing?",
                new Choice("Taunt him",44),
                new Choice("Charge him",39),
                new Choice("Wait until he is finished",41)
        );
        /********************************* Aggr. Taunt *************************************/
        pages[44] = new Page(
                R.drawable.ic_slave_gladiator_experienced_sword_bucket,
                R.drawable.stadium2,
                "You chose to taunt him. You think it takes too long! While he keeps doing his thing, you start walking his way. He notices it, but isn't bothered. " +
                        "He doesn't seem scared about you. Maybe you can use his underestimation against him. ",
                new Choice("Keep walking towards him",48),
                new Choice("Stop walking and spit his way",45)
        );
        pages[45] = new Page(
                R.drawable.ic_slave_gladiator_experienced_sword_bucket,
                R.drawable.stadium2,
                "You stop walking to him. He looks at you for a second. While he does that, you spit in his way. Suddenly he stops cheering to the public. " +
                        "You caught him! You dishonored him. He must be furious. He suddenly starts running at you, way faster then expected. He runs so hard, you might be able to dodge him.",
                new Choice("Dodge him",47),
                new Choice("Brace for impact",46)
        );
        pages[46] = new Page(
                R.drawable.ic_slave_gladiator_experienced_sword_bucket,
                R.drawable.stadium2,
                "Brace for impact! As he comes closer, you start to get worried, he is really big. This is going to hurt! BOOM! He hits you. Really hard and you fall on the ground.",
                new Choice("Stand up",41)
        );
        pages[47] = new Page(
                R.drawable.ic_slave_gladiator_experienced_sword_bucket,
                R.drawable.stadium2,
                "He runs towards you. As he gets really close, you see he tries to tackle you and hit you with his swords. You quickly jump out of the way. " +
                        "As Brutus did not expect your move because of his rage, he falls over. Now is your chance! You run at him and try to hit him. One hit! A block with his swords! Another block! Another hit! " +
                        "He carefully stands up while blocking all your hits. You should think of something else to beat him!",
                new Choice("Stand up",41)
        );
        pages[48] = new Page(
                R.drawable.ic_slave_gladiator_experienced_sword_bucket,
                R.drawable.stadium2,
                "You keep walking towards him. ",
                new Choice("Keep walking towards him",48)
        );
        /********************************* Aggr. Wait *************************************/

        /********************************* Defensive *************************************/


        /********************************* Good ending Fight 2 *************************************/
        pages[19] = new Page(
                R.drawable.ic_slave_gladiator_noob_sword_shield,
                R.drawable.stadium,
                "He falls over. This all went a lot better then expected! You point your sword at him. Then look at the crowd in the stadium. " +
                        "Lastly you point at the senator. You wait for his verdict. It gets really silent all of a sudden. The senator stands up..." +
                        "\r\n Then he puts his thumb down. KILL! The crowd starts shouting and cheering. You should kill your opponent.",
                new Choice("Kill him",30)
        );
        /********************************* Bad ending Fight 2 *************************************/
        pages[21] = new Page(
                R.drawable.ic_slave_gladiator_noob_sword_shield,
                R.drawable.stadium,
                "You are in so much pain. You hear the crowd shouting. They want to see more blood. Then it gets really silent. " +
                        "Your vision blurs. Suddenly you hear the crowd shouting and cheering again. I guess this is the end... " +
                        "That is your last thought. You died.",
                new Choice("Main Menu",1)
        );
    }

    @Override
    public Page getPage(int index){
        return pages[index];
    }
}
