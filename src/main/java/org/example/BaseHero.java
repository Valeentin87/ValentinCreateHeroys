package org.example;
// 1. Создадим базовый класс Героев, в котором предусмотреть поля:
//      Количество героев
//      Случайное число
//      Имя Героя
//      Максимальное количество здоровья
//      Текущее состояние здоровья
//
// 2. Зададим конструктор, позволяющий ввести имя героя, максим. здоровье и текущее здоровье и конструктор по умолчанию
// 3. Зададим персонажей magician, druid, prest
// 4. Создадим геттеры и сеттеры
// 5. Создадим метод для создания команды из произвольного числа героев через цикл и конструктор
// 6. Переопределить метод toString для вывода информации по каждому герою
// 7. В методе main вывести полученную команду
// 8. В методе BaseHero создать метод дающий уникальное имя герою
// 9. Описать метод нанесения урона здоровью
// 10.В методе main продемонстрировать нанесение случайного урона каждому персонажу.
// 11.Создадим новый класс лекарей, который будет наследоваться от BaseHero
// 12.Создадим метод в классе Healer, который будет лечить героев
// 13. Добавить к нашей команде лекаря и вывести на экран
// 14. Выполнить процедуру произвольного лечения игрока (10 раз)

//1.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BaseHero {
    public int number;
    public Random r;
    public String name;
    public int maxHp;
    public int hp;
//2.
    public BaseHero(String name, int maxHp, int hp) {
        this.name = name;
        this.maxHp = maxHp;
        this.hp = hp;
    }

    public BaseHero() {
    }

    //3.
    List<String> personages = Arrays.asList("magician","druid","prest");

//4.
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Random getR() {
        return r;
    }

    public void setR(Random r) {
        this.r = r;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
//5.
    List<BaseHero> getCommandHeroys(int num, List<String> person) {
        List<BaseHero> newCommand = new ArrayList<>();
        for(int i=0;i<num;i++){
            newCommand.add(i,new BaseHero(person.get(new Random().nextInt(0,(person.size()))),
                    100,new Random().nextInt(1,100)));
            this.name+=new Random().toString();
        }
        newCommand.forEach(i->i.unicName());
        return newCommand;
    }



// 6.

    @Override
    public String toString() {
        return String.format("герой %s, количество здоровья %d",name,hp);
    }

    public void toString(int number){
         super.toString();
    }

// 8.
    public void unicName() {
        Random rnd = new Random();
        this.name = this.name+String.format("%d",rnd.nextInt());
    }
// 9.

    public void getDamage(int damage) {
        if (this.hp<damage) {
            this.hp = 0;
            this.name+=" !!!!!killed!!!! ";
        }
        else this.hp-=damage;
    }
}
