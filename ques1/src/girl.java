package iit2015116;

public class girl {
    int id;
    int attract;
    int intel;
    //int happiness;
    int main_budget;
    int type;
    int criteria;
    int paired;
    int pairid;
    
    random r = new random();
    girl(){
        this.attract = r.getRandomNumberInRange(1, 10);
            this.intel = r.getRandomNumberInRange(1, 10);
            this.main_budget = r.getRandomNumberInRange(1000, 5000);
            this.type = r.getRandomNumberInRange(1, 3);
            this.criteria = r.getRandomNumberInRange(1, 3);
            this.paired = 0;
            this.pairid = 0;
    }
     
}
