package test.etudeheritage;


public class myDriver {

    public static void main(String[] argv) {
    	/*
    Soprano est inclus dans Singer
    Soprano descend de Singer
    Soprano est implicitement de type Singer
    Soprano est de type Soprano
    	*/
    	
    	//Soprano myTypeSopranoBySinger =  new Singer();
    	
        
        Singer  myTypeSinger_BySinger = new Singer();   
        Soprano myTypeSoprano_BySoprano = new Soprano();  
        Singer  myTypeSinger_BySoprano = new Soprano();  //Instance Soprano de type Singer
        
        myTypeSinger_BySinger.sing() ; 
        myTypeSoprano_BySoprano.sing() ; 
        myTypeSinger_BySoprano.sing() ; 
        
        myTypeSoprano_BySoprano.sing("myTypeSoprano_BySoprano") ; 
        
        myTypeSoprano_BySoprano.typeChanson();

        boolean isSopranoHeritedFromSinger = Singer.class.isAssignableFrom(Soprano.class);
        if(isSopranoHeritedFromSinger) 
        	System.out.println("Soprano descend de Singer");
        
        
       // myTypeSopranoBySinger.sing();
    }

}