package OPP.Lesson4;

import OPP.Lesson4.Warriors.Archer;
import OPP.Lesson4.Warriors.Infantryman;
import OPP.Lesson4.Warriors.Warrior;
import OPP.Lesson4.Weapons.meleeWeapon.Axe;
import OPP.Lesson4.Weapons.meleeWeapon.Sword;
import OPP.Lesson4.Weapons.rangedWeapon.Bow;
import OPP.Lesson4.Weapons.rangedWeapon.CrossBow;
import OPP.Lesson4.shields.Fiery;
import OPP.Lesson4.shields.Shield;
import OPP.Lesson4.shields.Steel;
import OPP.Lesson4.shields.Wood;

/*
Реализовать абстрактный класс Warrior, с полями name, weapon, healthPoint.
Сделать конструктор и сеттеры/геттеры на поля

Создать интерфейс Weapon с методом damage(), который будет показывать наносимый урон
оружием. В классе Warrior добавить метод hit(), который на основе метода от Weapon.damage()
будет считать, сколько урона нанес воин сопернику (воин может и промахнуться)

На основе класса Warrior создать различные типы воинов, например, лучник, меченосец,
ополченец и т.п. У лучника добавить поле расстояние поражения.

Создать различные виды вооружения, например, меч, лук, лопата.
Обеспечить, чтобы определенный тип воина мог нести только определенной оружие.
Можно на определенное оружие добавить уникальные признаки, например, у лука - дальность стрельбы.
Сделать метод у лучника: дальность прицельной стрельбы на основе лука
(дальность прицельной стрельбы лучника меньше дальности полета стрелы из лука)
 */
public class Main {
    public static void main(String[] args) {
        Team<Warrior> team1 = new Team<>();
        team1.add(new Archer("Robin", 100, new Bow(), new Wood()));
        team1.add(new Infantryman("John", 150, new Axe(), new Steel()));
        team1.add(new Infantryman("Ivan", 120, new Sword(), new Fiery()));


        Team<Archer> teamArchers = new Team<>();
        teamArchers.add(new Archer("Jimmy", 100, new CrossBow(), new Fiery()));
        teamArchers.add(new Archer("Piter",100, new Bow(), new Wood()));

        Team<Infantryman> teamInfantryman = new Team<>();
        teamInfantryman.add(new Infantryman("James", 150, new Sword(), new Steel()));


        System.out.println(team1);
        System.out.println("-----------");
        System.out.println(teamArchers);
        System.out.println("-----------");
        System.out.println(teamInfantryman);


        Infantryman melee = new Infantryman("John", 50,new Axe(), new Fiery());
        Archer range = new Archer("Robin", 30, new Bow(), new Wood());
        Battle battle1 = new Battle(melee, range);

        System.out.println("---fight---");
        battle1.fight();

    }
}
