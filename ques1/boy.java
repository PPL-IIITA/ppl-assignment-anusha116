package iit2015116;

public class boy {
    int id;
    int attract;
    int intel;
    int budget;
    int type;
    int paired;
    
    random r = new random();
    boy(){
            this.attract = r.getRandomNumberInRange(1, 10);
            this.intel = r.getRandomNumberInRange(1, 10);
            this.budget = r.getRandomNumberInRange(1000, 5000);
            this.type = r.getRandomNumberInRange(1, 3);
            this.paired = 0;
    }
}
