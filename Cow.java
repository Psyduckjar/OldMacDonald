class Cow implements Animal 
{     
     private String myType;
     private String mySound, myName;
     public Cow(String type,String name, String sound) {
       myType = type;
       mySound = sound;
       myName = name;
     }
    public Cow()     {         
        myType = "cow";         
        mySound = "mooo";   
        myName = "Michael";
    }      
     public String getSound()
     {
     return mySound;
     }     
     public String getType()
     {
     return myType;
     } 
     public String getName() 
     { return myName; }
}
