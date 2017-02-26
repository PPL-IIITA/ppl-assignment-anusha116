package iit2015116;

public class random_generation {
     static void generate(girl girls[], boy boys[]){
        
        int i,j;
        random r = new random();
         
        for(i=0;i<50;i++){
            boys[i].id = i+10;
            boys[i].attract = r.getRandomNumberInRange(1, 10);
            boys[i].intel = r.getRandomNumberInRange(1, 10);
            boys[i].budget = r.getRandomNumberInRange(1000, 5000);
            boys[i].type = r.getRandomNumberInRange(1, 3);
            boys[i].paired = 0;
        }
        
        for(i=0;i<20;i++){
            girls[i].id = i+100;
            girls[i].attract = r.getRandomNumberInRange(1, 10);
            girls[i].intel = r.getRandomNumberInRange(1, 10);
            girls[i].main_budget = r.getRandomNumberInRange(1000, 5000);
            girls[i].type = r.getRandomNumberInRange(1, 3);
            girls[i].criteria = r.getRandomNumberInRange(1, 3);
            girls[i].paired = 0;
            girls[i].pairid = 0;
        }
     }
}
