package iit2015116;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Iit2015116 {    
    public static void main(String[] args) throws FileNotFoundException {
         boy[] boys = new boy[50];
        girl[] girls = new girl[20];
        int i,j;
    
        for(i=0;i<50;i++){
            boys[i] = new boy();
            boys[i].id = i+10;
        }
        
        for(i=0;i<20;i++){
            girls[i] = new girl();
            girls[i].id = i+100;      
        }
        
        pairing.makepairs(girls, boys);
        
        PrintStream out = new PrintStream(new FileOutputStream("file.txt"));
        System.setOut(out);
        
        for(i=0;i<20;i++){
            System.out.println(girls[i].id+" "+girls[i].pairid+" "+girls[i].paired);
        }
    }
    
}
