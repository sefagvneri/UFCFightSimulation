public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;
    int speed;

    Fighter(String name, int damage, int health, int weight, int dodge, int speed) {
        this.name = name;
        this.damage = damage;
        this.weight = weight;
        this.health = health;
        this.dodge = dodge;
        this.speed = speed;
    }

    int hit(Fighter foe) {
        
        System.out.println(this.name + " dealt " + this.damage + " damage to " + foe.name);
        
        if(isDodge()){
            System.out.println(foe.name + " blocked the incoming attack.");
            return foe.health;
        }
        if(foe.health - this.damage < 0) {
            return 0;
        }
        
        return foe.health - this.damage;
        
        
        
    }
    boolean isDodge(){
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }
  
}
