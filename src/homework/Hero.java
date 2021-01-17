package homework;

class Hero {
    private String name;
    private int hp;

    public Hero(String name, int hp) {
        this.name = name;
        if(hp <=200 && hp >= 0) {
            this.hp = hp;
        }else if(hp < 0){
            this.hp = 0;
        }else{
            this.hp = 200;
        }
    }

    public Hero() {
        this("Paratrooper", 100);
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }
}

class HeroTest {
    public static void main(String[] args) {
        Hero hero = new Hero("Stranger", 50);

        //Expect Stranger
        System.out.println(hero.getName());

        //Expect 50
        System.out.println(hero.getHp());
    }
}