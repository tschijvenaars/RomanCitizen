package com.portfolio.timsoft.romanlegionary.model;

import com.portfolio.timsoft.romanlegionary.R;

/**
 * Created by timsc on 16-4-2016.
 */
public class StoryTelling1 implements Story {

    public StoryTelling1() {
        /*********************************************************************/
        pages[0] = new Page(
                R.drawable.ic_roman_citizen,
                R.drawable.forest,
                "It's 345 A.D. The Roman Empire is as strong as it can get. We control land from Spain and Britain to the Far East and Egypt." +
                        "You are Servius Curius Gaurus, the son of a Roman governor in Colonia Agrippina, near the Rhine. Just as you head back from a walk in the forest, you see the city " +
                        "is getting attacked by Frankish troops. You hurry home and see your father is killed... Scared of these savages, you run away from all the raiding back into the forest." +
                        "",
                new Choice("Start Journey",1)
        );
        pages[1] = new Page(
                R.drawable.ic_roman_citizen,
                R.drawable.forest,
                "After roaming in the woods for a couple of days: tired, hungry and broken, you reach the end of the treeline. There is a huge " +
                "field and you see a small farm far away. Since you don't know where you are, the people can be friendly or hostile." +
                " What should I do?",
                new Choice("Run to the farm",2),
                new Choice("Wait for the night",3),
                new Choice("Go the other way",4)
        );
        /*********************************************************************/
        pages[2] = new Page(
                R.drawable.ic_roman_citizen_dagger,
                R.drawable.field,
                "You ran to the farm. When you finally got there, you saw the farmer working in the field. \"HELP\", you shouted" +
                "\"I'm really hungry and my city is attacked by Frankish savages!\". As soon as you explained who you are, the " +
                "farmer welcomes you in his home and his wife gives you something to eat. After eating, you also sleep for a little while." +
                " When you wake up you thank the family and they tell you about an Roman camp nearby where you can seek help. The wife gives you a knife so you can defend yourself. You thank her and leave.",
                new Choice("Start walking down the road",5));

        pages[3] = new Page(
                R.drawable.ic_roman_citizen_trident,
                R.drawable.field,
                "It is really dark and can't see much. You wait until the lights in the house go off. You sneak to the field " +
                "and you grab some vegetables from the garden and a pitchfork which is lying around. Unfortunately you didn't see some other tools lying around, " +
                "so you trip over them. The farmer wakes up and comes out of the house shouting. He also holds an axe, which he throws at you because he can't keep up with you." +
                " As you keep sprinting, the axe hits you and makes a shallow cut in your arm. Lightly wounded you escape.",
                new Choice("Walk down the road", 6),
                new Choice("Get back in the forest",7));
        pages[4] = new Page(
                R.drawable.ic_roman_citizen,
                R.drawable.field,
                "Even though you are hungry, you walk away from the forest and the farm. Several minutes later you see a road and you decide to follow it.",
                new Choice("Continue",8));

        /*********************************************************************/
        pages[5] = new Page(
                R.drawable.ic_roman_citizen_dagger,
                R.drawable.road,
                "Now you finally have something to defend yourself with and are fully recovered, you feel a lot more confident. After a long hike of a couple of hours, you arrive at the Roman camp without " +
                "any trouble. \"Ave! What brings you here?\", asks one of the camp guards. After you explain who you are you are brought to the Centurion, the leader of the camp. He decides to recruit you and give you training, armor and food.",
                new Choice("Join the army",9),
                new Choice("Refuse offer", 10));
        pages[6] = new Page(
                R.drawable.ic_roman_citizen_trident,
                R.drawable.road,
                "After you reached safe distance, you decided to eat the stolen vegetables and camp somewhere. The next day, your wound starts to swell. It starts to hurt more. After you venture forth you arrive at a Roman camp. " +
                "The guards approach you carefully, but point their spears at you. \"Put your weapon down! Why are you hurt?\", they say. What do you say?",
                new Choice("A farmer attacked me!",11),
                new Choice("I got attacked by Franks!",12));
        pages[7] = new Page(
                R.drawable.ic_roman_citizen_trident,
                R.drawable.forest,
                "You head back into the forest and find a place to rest. You also eat the vegetables. You fall asleep against a tree. You wake up by the sound of shouting. The forest is full of Frankish warriors and the warband captures you.",
                new Choice("Beg for mercy",45),
                new Choice("Attack them",45));
        pages[8] = new Page(
                R.drawable.ic_roman_citizen,
                R.drawable.road,
                "Dizzy from hunger and thirst, you arrive at a Roman Camp. The guards see you and bring you to the Centurion, the leader of the camp. He decides to recruit you and give you training, armor and food.",
                new Choice("Join the army",9),
                new Choice("Refuse offer",10));
        /*********************************************************************/
        pages[9] = new Page(
                R.drawable.ic_legionary,
                R.drawable.camp,
                "You decided to join the Roman army because you have nowhere to go. You spend weeks training, you get your own armor and you are part of a cohort. You are finally a legionary. After a long day of training, " +
                        "you are at your tent again.",
                new Choice("Go to sleep",13));
        pages[10] = new Page(
                R.drawable.ic_roman_citizen_light,
                R.drawable.camp,
                "You kindly refuse the offer. The Centurion understands you want to go back to your family. He gives you some supplies and a Legionary helmet and a dagger. You continue your journey.",
                new Choice("Continue",14));
        pages[11] = new Page(
                R.drawable.ic_roman_citizen,
                R.drawable.camp,
                "\"Why would a farmer attack an innocent citizen?\", they ask you. After you explain what you've done, they look angry at you. \"Are you a thief?\", they say while they grab your arm. You are taken prisoner.",
                new Choice("Be a prisoner",15));
        pages[12] = new Page(
                R.drawable.ic_roman_citizen,
                R.drawable.camp,
                "\"Damn Franks!\". After talking some more you they bring you inside the camp. The camp's medic treats your wound. After eating and resting for a day, the camp's Centurion visits you." +
                        " He offers you a place in the Roman army.",
                new Choice("Join the army",9),
                new Choice("Refuse offer",10));
        /*********************************************************************/
        pages[13] = new Page(
                R.drawable.ic_legionary_sword,
                R.drawable.camp,
                "You wake up and see everyoine running around and screaming. \"Wake up! We are under attack\", screams a random passing legionary. You put your armor on in a hurry and get your sword. And rush to the " +
                        "gates. After some fighting you see it's hopeless. Frankish warriors keep rushing to the camp, wave after wave. You and the camp are clearly outnumbered. You see the Centurion fighting off 3 Franks at the same time. " +
                        "You also see a lot of troops start fleeing. What do you decide to do?",
                new Choice("Help the Centurion",16),
                new Choice("Flee",17));
        pages[14] = new Page(
                R.drawable.ic_roman_citizen_light,
                R.drawable.camp,
                "You start walking again, well rested and fed. You are really confident and lightly equipped, good enough to defend yourself against some minor threats. What do you do?",
                new Choice("Continue down the road",18),
                new Choice("Go to the forest and camp",19),
                new Choice("Search for a river",20));
        pages[15] = new Page(
                R.drawable.ic_roman_citizen,
                R.drawable.camp,
                "As you are a prisoner, you have to work every day. Hard manual labor and when you don't work hard enough, you are whipped. You are treated bad. \"How have I become like this\", you ask yourself. " +
                        "After weeks of work, the military camp is attacked by Frankish Warriors. It's an ambush! Thank God! Everyone is running around. The guard, who always had sympathy for you, takes of your chains and cuffs. " +
                        "\"Go away!\", he said silently, \"Never tell anyone your story and make sure I don't regret this decision.\"",
                new Choice("Make a run for it",21),
                new Choice("Convince him to flee",22),
                new Choice("Scavange supplies",23));
        /*********************************************************************/
        pages[16] = new Page(
                R.drawable.ic_legionary_sword,
                R.drawable.field,
                "You rush to the Centurion and kill two of the barbarians, which didn't see you comming. After you helped the Centurion he thanks you. You and him retreat to inside the camp, where he rounds up some man to form a couple of units. " +
                        "Everyone is unprepared. However, as a unit you manage to take on a large amount of enemy troops. After 15 minutes of fighting your unit breaks and scatters. You have been the whole time on the side of the Centurion, " +
                        "which saved your life once. He just won't give up fighting. What do you do?",
                new Choice("Stay at his side",24),
                new Choice("Leave him behind",17));
        pages[17] = new Page(
                R.drawable.ic_legionary_sword,
                R.drawable.field,
                "As you are fleeying, you feel guilty to leave the man behind which gave you a chance. You try to get to the other side of the camp. You see some stuff lying arount, but you're not sure you should take it. " +
                        "You also don't know if you can carry that much. You also see some extra equipment lying around. You decide to take some rations and one piece of equipment. What's that?",
                new Choice("You take the helmet",25),
                new Choice("You take the shield",26),
                new Choice("You take them both",27));
        pages[18] = new Page(
                R.drawable.ic_roman_citizen_light,
                R.drawable.road,
                "You keep following the road. Days after days. You meet new people, fight off wild animals, hunt and camp. The dagger and helmet have proven to be really usefull. Thieves think twice before attacking you.",
                new Choice("Keep going",28));
        pages[19] = new Page(
                R.drawable.ic_roman_citizen_light,
                R.drawable.forest,
                "You head to the nearest forest and decide to make some sort of camping spot there. You are approximately 20 minutes away from the Roman camp, so you think you are safe.",
                new Choice("Stay at this spot",29),
                new Choice("Search for a river",20));
        pages[20] = new Page(
                R.drawable.ic_roman_citizen_light,
                R.drawable.field_water,
                "You finally get to a river. Every reasonable river eventually leads to a city right?",
                new Choice("Continue",30));
        pages[21] = new Page(
                R.drawable.ic_roman_citizen,
                R.drawable.forest,
                "You run away from all the fighting, you don't have any weapons or supplies. Even though you are happy to be alive, you are in really bad shape. You keep running and running until you are at a safe distance." +
                        " Should you go into the woods or try to search for life?",
                new Choice("Hide in the woods",31),
                new Choice("Search for a river",30));
        pages[22] = new Page(
                R.drawable.ic_legionary_sword_shield_helm,
                R.drawable.forest,
                "You try to convince the guard to flee with you. \"I swore my loyalty to the Emperor\", he says, \"Wait! You should get some things to defend yourself in the future!\". He brings you to one of the tents and " +
                        "gives you some armor, a sword, a shield and an helmet. Disguised as a Roman legionary, you flee the field of battle. You walk for days and days. You meet some people who tell you there is a small " +
                        "settlement nearby to the east.",
                new Choice("Go east",32),
                new Choice("Keep walking",33));
        pages[23] = new Page(
                R.drawable.ic_roman_citizen,
                R.drawable.forest,
                "You start looking around the camp for supplies and equipment. You find some armor, a sword and some food. Before you can put it on two Roman soldiers see you stealing some stuff. \"I knew  you were a filthy thief!\"," +
                        " said one of them. They both reach for their swords. Do you leave the stuff and run away, or try to fight them?",
                new Choice("Run away",21),
                new Choice("Fight them",34));
        /***********************************NewChapter*************************************/
        pages[24] = new Page(
                R.drawable.ic_legionary_sword,
                R.drawable.forest,
                "As you and the Centurion keep fight Frank after Frank, you notice you two are the only ones left in the camp. You are outnumbered.",
                new Choice("Continue",45));
        pages[25] = new Page(
                R.drawable.ic_legionary_sword_helm,
                R.drawable.forest,
                "You quickly put on the helmet and keep fleeing. As you kill a couple of barbarian on your way out, you see a couple of dead guards with shields. You quickly grab one of the shields.",
                new Choice("Continue",27));
        pages[26] = new Page(
                R.drawable.ic_legionary_sword_shield,
                R.drawable.forest,
                "You quickly grab the shield and keep fleeying. As you kill a couple of barbarians on your way out, you see a couple of dead guards with helmets. You quickly grab one of the helmets.",
                new Choice("Continue",27));
        pages[27] = new Page(
                R.drawable.ic_legionary_sword_shield_helm,
                R.drawable.road,
                "Now you have a shield and an helmet. You run as fast as you can. Finally you manage to get away without being seen. You flee further down south, thinking about everything what happened. " +
                        "After a while you reach a big road.",
                new Choice("Continue down the road",33));
        /*********************************************************************/
        pages[28] = new Page(
                R.drawable.ic_roman_citizen_light,
                R.drawable.forest,
                "One day, raiders try to attack you. It's four versus one. You have an helmet and a dagger. The raiders try to steal your stuff but you panick and kill one of them. The others aren't scared and try to attack you. " +
                        "One of them manages to make a deep cut in your arm, while you evade an attack from another raider. The third one steals the food you have. They try to get away but you catch up with one of them and you manage " +
                        "to kill him too. The two last raiders run have all of your stuff. You don't know how long it will take before you will have food. Do you try to get your supplies back or do you stop chasing them?",
                new Choice("Keep chasing them",35),
                new Choice("Stop chasing",36));
        pages[29] = new Page(
                R.drawable.ic_roman_citizen_light,
                R.drawable.forest,
                "You set up a camping spot. You are safe. You live months just gathering supplies and you even get a couple of companions. Your campspot turns into a tiny settlement. On one day, you hear weird shouting. " +
                        "A lot of Roman soldiers come running your way, \"THE FRANKS ARE HERE!\". The settlement starts panicking. Everyone starts packing their stuff. Not long after the first soldiers came by, you see " +
                        "Franks comming your way. What do you do, defend yourself and the camp or flee and leave everything behind?",
                new Choice("Defend yourself",37),
                new Choice("Flee",21));
        /************************************************************************/
        pages[30] = new Page(
                R.drawable.ic_roman_citizen_light,
                R.drawable.city,
                "You follow the river until you arrive at a small village. To earn some money, you help the local people. You live there for a couple of months. One day, a caravan makes a stop at the village. " +
                        "People are free to join. You, still wanting to go further down south decide to join the caravan.",
                new Choice("Join the caravan",46));
        pages[31] = new Page(
                R.drawable.ic_roman_citizen,
                R.drawable.forest,
                "You hide in the woods, scared of everything going to happen. You eventually fall asleep. You wake up surrounded by Frankish warriors. Don't expect anything positive.",
                new Choice("Continue",45));
        /*********************************************************************/
        pages[32] = new Page(
                R.drawable.ic_legionary_sword_shield_helm,
                R.drawable.road,
                "You head east. After ten minutes you see a group of people in the middle of the road. What do you do?",
                new Choice("Keep walking",38),
                new Choice("Go back",33));
        pages[33] = new Page(
                R.drawable.ic_legionary_sword_shield_helm,
                R.drawable.road,
                "You reach a village after two days of walking. They think you are a Roman soldier. They give you a place to sleep and bring food. In the meantime you help fighting against raiders which are " +
                        "attacking the village. Weeks go by.",
                new Choice("Continue",39));
        pages[34] = new Page(
                R.drawable.ic_roman_citizen,
                R.drawable.camp,
                "You try to defend yourself. They always treated you bad, so there is no way to surrender. Now THEY will pay for it! You storm at them with the sword. All the manual labour has made you tired. You quickly " +
                        "get second thoughts. Sadly it's already too late. The soldiers manage to hit you and you are heavily wounded.",
                new Choice("Continue",44));
        /***********************************NewChapter*************************************/
        pages[35] = new Page(
                R.drawable.ic_roman_citizen_light,
                R.drawable.forest,
                "You keep running. You catch up with the raiders and tackle one of them. The other one stops to help his friend. While you are on the ground, the other raider gets his sword and slashes you. You are " +
                        "mortally wounded. The tackled raider stands up and they both run off with your stuff, leaving you to die.",
                new Choice("Continue",47));
        pages[36] = new Page(
                R.drawable.ic_roman_citizen_light,
                R.drawable.forest,
                "You stop chasing them. They might have all your stuff, but you are still alive! You head in another direction and you get to a river.",
                new Choice("Continue",30));
        pages[37] = new Page(
                R.drawable.ic_roman_citizen_light,
                R.drawable.forest,
                "You and a couple of fellow campers brace yourselves. The Franks keep comming, one after the other. Single warriors become dozens and you are quickly overrun. You try to defend yourself while you get away. " +
                        "Unfortunately you are spotted by some cavalary and they decide to chace you down. You manage to dodge one attack, but you couldn't jump out of the way of the spear of the third warrior. " +
                        "You are mortally wounded. ",
                new Choice("Continue",45));
        pages[38] = new Page(
                R.drawable.ic_legionary_sword_shield_helm,
                R.drawable.forest,
                "When you get closer, you see those guys are a band of Frankish warriors. You count them all and there are twelve of them. What do you do?",
                new Choice("Attack them",40),
                new Choice("Go back",33));
        pages[39] = new Page(
                R.drawable.ic_legionary_sword_shield_helm,
                R.drawable.forest,
                "The village proves to be a safe spot. There are no attacks and it's almost never attacked by raiders. " +
                        "After a while you trade your military gear for some money and decide to keep living there. One day, a caravan makes a stop at the village. " +
                        "People are free to join. You, still wanting to go further down south decide to join the caravan.",
                new Choice("Join the caravan",46));
        /***********************************NewChapter*************************************/
        pages[40] = new Page(
                R.drawable.ic_legionary_sword_shield_helm,
                R.drawable.field,
                "You decide to attack them, but you have no idea how. You go decide to get closer to them first... but unseen.",
                new Choice("Sneak up on them",41));
        pages[41] = new Page(
                R.drawable.ic_legionary_spear_shield_helm,
                R.drawable.forest,
                "You sneak up on them near the treeline. You see the bodies of a couple of dead Roman legionaries. One of them has a spear. You grab the spear, it might be usefull.",
                new Choice("Grab spear",42));
        pages[42] = new Page(
                R.drawable.ic_legionary_sword_shield_helm,
                R.drawable.road,
                "You got closer to the warriors. You count to 10 and start running at the warriors. You kill one after another, four of them with your spear. You didn't know you were this heroic. " +
                        "After the fight you got really tired and the spear is stuck in the body of one of the Franks you killed.",
                new Choice("Rest",43));
        pages[43] = new Page(
                R.drawable.ic_roman_citizen,
                R.drawable.forest,
                "After you rested for a while, you decided to get back the way you came and take the other way. This maybe was a trap, but you'll never know. You just want some peace.",
                new Choice("Go back",33));
        /***********************************NewChapter*************************************/
        pages[44] = new Page(
                R.drawable.ic_roman_citizen,
                R.drawable.camp,
                "You are killed by Roman soldiers. Unfortunately your journey ends here.",
                new Choice("Main Menu",1));
        pages[45] = new Page(
                R.drawable.ic_roman_citizen,
                R.drawable.forest,
                "Frankish warriors killed you. Unfortunately your journey ends here.",
                new Choice("Main Menu",1));
        pages[46] = new Page(
                R.drawable.ic_roman_citizen,
                R.drawable.forest,
                "You safely travel to Augusta Treverorum. You live here for a couple of years, but you still have to flee because of the ongoing attacks of the savages." +
                " War... War never changes.",
                new Choice("Main Menu",1));
        pages[47] = new Page(
                R.drawable.ic_roman_citizen,
                R.drawable.forest,
                "You are dead. Unfortunately your journey ends here.",
                new Choice("Main Menu",1));
    }

    public Page getPage(int index){
        return pages[index];
    }

}
