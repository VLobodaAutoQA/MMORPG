package arena.heroes;

public class App {
    static void main() {
        Hero[] heroes = {
                new Knight("Рыцарь Джон", 25, 77, 100),
                new Archer("Лучник Стив", 50, 100, 30),
                new Mage("Маг Дональд", 75, 90, 300)
        };

        for (Hero hero : heroes) {
            hero.printInfo();
            hero.attack();
        }

        final Knight knight = new Knight("Рыцарь Мартин", 99, 100, 100);

        System.out.println(knight);

        knight.name = "Рыцарь Не Мартин";
        knight.level = 1;
        knight.health = 2;
        knight.armor = 3;

        System.out.println(knight);

    }
}
