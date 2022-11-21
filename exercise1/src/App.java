// player
class Player {
    String name;
    double health;
    int level;
    // object member
    Weapon weapon;
    Armour armour;

    Player (String name, double health) {
        this.name = name;
        this.health = health;
    }

    void Attack(Player enemy) {
        double attackPower = this.weapon.attackPower;
        System.out.println(this.name + " attacking " + enemy.name + " with power " + attackPower);
        enemy.Defence(attackPower);
    }

    void Defence(double attackPower) {
        double damage;
        if (this.armour.defencePower < attackPower) {
            damage = attackPower - this.armour.defencePower;
        } else {
            damage = 0;
        }

        this.health -= damage;

        System.out.println(this.name + " got damage " + damage);
    }

    void equipWeapon (Weapon weapon) {
        this.weapon = weapon;
    }

    void equipArmour (Armour armour) {
        this.armour = armour;
    }

    void display() {
        System.out.println("\nName = " + this.name);
        System.out.println("Health = " + this.health + " hp");
        this.weapon.display();
        this.armour.display();
    }
}

// weapon
class Weapon {
    String name;
    double attackPower;

    Weapon(String name, double attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    void display() {
        System.out.printf("Weapon = %s | attack power = %.1f\n", this.name, this.attackPower);
    }
}

// armour
class Armour {
    String name;
    double defencePower;

    Armour (String name, double defencePower) {
        this.name = name;
        this.defencePower = defencePower;
    } 

    void display() {
        System.out.printf("Armour = %s | defence power = %.1f\n", this.name, this.defencePower);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        
        // object player
        Player kratos = new Player("Kratos", 100);
        Player freya = new Player("Freya", 100);

        // object weapon
        Weapon blade_of_chaos = new Weapon("Blade of Chaos", 20);
        Weapon sigil_arrow = new Weapon("Sigil Arrow", 20);

        // object armour
        Armour armour_max = new Armour("Armour Max", 10);
        Armour armour_min = new Armour("Armour Min", 0);

        kratos.equipWeapon(blade_of_chaos);
        kratos.equipArmour(armour_max);
        kratos.display();

        freya.equipWeapon(sigil_arrow);
        freya.equipArmour(armour_min);
        freya.display();

        System.out.println("\nBattle");

        kratos.Attack(freya);
        freya.Attack(kratos);

        System.out.println();

        kratos.display();
        freya.display();

    }
}
