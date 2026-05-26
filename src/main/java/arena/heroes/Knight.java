package arena.heroes;

public class Knight extends Hero {
    public int armor;

    public Knight(String name, int level, int health, int armor) {
        super(name, level, health);
        this.armor = armor;
    }

    @Override
    public void attack() {
        System.out.println("Рыцарь бьёт мечом!");
        System.out.println("======================");
    }

//    @Override
//    public final void rest() {
//        System.out.println("Рыцарь отдыхает и восстанавливает силы.");
//    }


    @Override
    public String toString() {
        return "Knight{" +
                "armor=" + armor +
                ", name='" + name + '\'' +
                ", level=" + level +
                ", health=" + health +
                '}';
    }
}
