package biggenar_java_50_100;

public class Java_book {
    public static void main(String[] args){
     String [] WordListOne = {"24/7", "multiTiar", ",", 
                "30,OOO foot", "B-to-B" , "win-win" , "frontend",
                "web- based" , "pervasive", "smart", "sixsigma",
                "cri tical-path", "dynamic"};
             
    
    String [] WordListTwo = { "empowered", "sticky",
                "value-added.", "oriented", "centric", "distributed",
                "clustered", "branded", "outaide-the-box", "positioned",
                "networked", " focused", "leveraged", "aligned",
                "targeted", "shared", "cooperative", "accelerated"};
    
    String [] WordListThree = {"process", "tippingpoint",
                "solution", "architecture", "core competency" ,
                "strategy", "mindshare", "portal" , "apace", "vision",
                "paradigm", "mssion"};
    
    
    
    int onelength = WordListOne.length;
    int twolength = WordListTwo.length;
    int threelength = WordListThree.length;
    
    int rend1= (int) (Math.random() * onelength);
    int rend2= (int) (Math.random() * twolength);
    int rend3= (int) (Math.random() * threelength);
    
    String phrase = WordListOne[rend1] + " " +WordListTwo[rend2]+ " " +WordListThree[rend3];
    
        System.out.println("Rendom Phrase Is : " +phrase);
    
    
    
    }
}
