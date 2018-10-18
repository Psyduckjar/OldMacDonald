class Chick implements Animal
{     
     private String myType;     
     private String mySound, myName;      
     public Chick(String type, String sound)    
     {         
         myType = type;         
         mySound = sound;     
     }     
     public Chick()     {         
         myType = "Chicken";         
         mySound = "unknown";  
         myName = "Susan";
     }      
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
     public String getName() {return myName;}
}  
