package iit2015116;

public class pairing {
    static void makepairs(girl girls[], boy boys[]){
        int i,x, max, index;
        
        for(i=0;i<20;i++){
            switch (girls[i].criteria) {
                case 1:
                    max=0;  
                    index=-1;
                    for(x=0;x<50;x++){
                        if(boys[x].paired==0 && girls[i].main_budget <= boys[x].budget){
                            if(boys[x].budget>max){
                                max = boys[x].budget;
                                index = x;
                            }
                        }
                    }
                    if(index==-1){
                        x=0;
                        while(true){
                            if(boys[x].paired ==0){
                                index=x;
                                break;
                            }
                            x++;
                        }
                    }
                        boys[index].paired = 1;
                        girls[i].paired = 1;
                        girls[i].pairid = boys[index].id;
                       break;
                case 2:
                    max=0;
                    index=-1;
                    for(x=0;x<50;x++){
                        if(boys[x].paired==0 && girls[i].main_budget <= boys[x].budget){
                            if(boys[x].intel>max){
                                max = boys[x].intel;
                                index=x;
                            }
                        }
                    }
                    if(index==-1){
                        x=0;
                        while(true){
                            if(boys[x].paired ==0){
                                index=x;
                                break;
                            }
                            x++;
                        }
                    }
                        boys[index].paired = 1;
                        girls[i].paired = 1;
                        girls[i].pairid = boys[index].id;
                       break;
                case 3:
                    max=0;
                    index=-1;
                    for(x=0;x<50;x++){
                        if(boys[x].paired==0 && girls[i].main_budget <= boys[x].budget){
                            if(boys[x].attract>max){
                                max = boys[x].attract;
                                index = x;
                            }
                        }
                    }
                    if(index==-1){
                        x=0;
                        while(true){
                            if(boys[x].paired ==0){
                                index=x;
                                break;
                            }
                            x++;
                        }
                    }
                        boys[index].paired = 1;
                        girls[i].paired = 1;
                        girls[i].pairid = boys[index].id;
                       break;
                default:
                    break;
            }
        }    
        }
       
}
