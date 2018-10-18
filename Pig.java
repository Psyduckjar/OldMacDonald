class Pig implements Animal
{     
     private String myType;     
     private String mySound, myName;      
     public Pig(String type, String name, String sound)     {         
         myType = type;         
         mySound = sound;
         myName = name;
     }          
     public String getSound(){return mySound;}     
     public String getType(){return myType;}  
     public String getName() { return myName; }
}
