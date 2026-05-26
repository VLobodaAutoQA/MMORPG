package arena.heroes;

public class Hero {
    private static final int MAX_LEVEL = 100;
    public String name;
    public int level;
    public int health;

    public void printInfo() {
        System.out.println("Имя героя: " + name);
        System.out.println("Уровень героя: " + level);
        System.out.println("Текущее здоровье героя: " + health);
    }

    public void takeDamage(int damage) {
        int result = health - damage;
        if (result <= 0) {
            System.out.println(0);
        } else {
            System.out.println(result);
        }
    }

    public void levelUp() {
        if (level < MAX_LEVEL) {
            level++;
        } else {
            System.out.println("ТЕСТ Уровень героя: " + MAX_LEVEL);
        }
    }

    public void attack() {
        System.out.println("Герой наносит обычный удар.");
    }

    public void attack(String target) {
        System.out.println("Герой наносит обычный удар. Цель: " + target);
    }

    public void attack(String target, int times) {
        System.out.println("Герой атакует цель " + target + " " + times + " раза");
    }

    private static int heroesCreated = 0;

    public Hero(String name, int level, int health) {
        this.name = name;
        this.level = level;
        this.health = health;
        heroesCreated++;
    }

    public Hero() {}

    public static void printHeroesCreated() {
        System.out.println("Всего создано героев: " + heroesCreated);
    }

    public final void rest() {
        System.out.println("Герой отдыхает и восстанавливает силы.");
    }
}
