package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<String> personages = Arrays.asList("magician","druid","prest");
        BaseHero newCom = new BaseHero();
        List<BaseHero> firstCommand = new ArrayList<>();
        firstCommand.addAll(newCom.getCommandHeroys(10,personages));
        System.out.println("-------------команда героев до нанесения урона-------------");
        firstCommand.forEach(i-> System.out.println(i));
        System.out.println("-------------после нанесения урона-----------------");
        firstCommand.forEach(i-> i.getDamage(new Random().nextInt(10,80)));
        firstCommand.forEach(i-> System.out.println(i));
        System.out.println("Hello world!");
//13.
        Healer healer1 = new Healer("healer1",100,10);
        firstCommand.add(healer1);
        System.out.println("------------команда после добавления лекаря------------------");
        firstCommand.forEach(i-> System.out.println(i));
        System.out.println("--------------------------------------------------------------");
//14.
        for (BaseHero i:firstCommand) {
            healer1.treatment(i,new Random().nextInt(10,60));
        }


        System.out.println("-----------так выглядит команда после лечения----------------");
        firstCommand.forEach(i-> System.out.println(i));
        }



    }
