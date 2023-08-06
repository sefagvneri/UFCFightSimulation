public class Match {
    Fighter f1;
    Fighter f2;

    int minWeight;
    int maxWeight;
    int a;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        if(isCheck()) {
            if(isFirst()){
                a = 1;
            }
            else {
                a = 2;
            }
            while(this.f1.health > 0 && this.f2.health > 0) {
                if(a == 1) {
                this.f2.health = this.f1.hit(this.f2);
                System.out.println(this.f2.name + " health: " + this.f2.health);
                if(f1isSpeed()){
                this.f2.health = this.f1.hit(this.f2);
                System.out.println(this.f2.name + " health: " + this.f2.health);
                }
                if(isWin()) {
                    break;
                }
                this.f1.health = this.f2.hit(this.f1);
                System.out.println(this.f1.name + " health: " + this.f1.health);
                if(f2isSpeed()) {
                this.f1.health = this.f2.hit(this.f1);
                System.out.println(this.f1.name + " health: " + this.f1.health);  
                if(isWin()) {
                    break;
                }
                if(isWin()) {
                    break;
                }
                }
                if(a == 2) {
                this.f1.health = this.f2.hit(this.f1);
                System.out.println(this.f1.name + " health: " + this.f1.health);
                if(f2isSpeed()){
                this.f1.health = this.f2.hit(this.f1);
                System.out.println(this.f1.name + " health: " + this.f1.health);
                if(isWin()){
                    break;
                }  
                }
                if(isWin()) {
                    break;
                }
                this.f2.health = this.f1.hit(this.f2);
                System.out.println(this.f2.name + " health: " + this.f2.health);
                if(f1isSpeed()) {
                this.f2.health = this.f1.hit(this.f2);
                System.out.println(this.f2.name + " health: " + this.f2.health); 
                if(isWin()) {
                    break;
                }
                }
                if(isWin()) {
                    break;
                }
                }
                
            }
            }
        }
        else {
            System.out.println("Weights are not eligible..");
        }
    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if(f1.health <= 0) {
            System.out.println(f2.name + " Won.");
            return true;
        }
        if(f2.health <= 0) {
            System.out.println(f1.name + " Won.");
            return true;
        }
        return false;
    }
    boolean isFirst() {
        double randomNumber = Math.random() * 100;
        if(randomNumber <= 50) {
            return true;
        }
        return false;
    }
    boolean f1isSpeed(){
        double randomNumber = Math.random() * 100;
        if(randomNumber <= f1.speed) {
            return true;
        }
        return false;
    }
     boolean f2isSpeed(){
        double randomNumber = Math.random() * 100;
        if(randomNumber <= f2.speed) {
            return true;
        }
        return false;
    }
    
}
