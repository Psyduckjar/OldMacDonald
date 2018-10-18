   class Farm  {     
   private Animal[] aBunchOfAnimals = new Animal[3];    
   public Farm()     {       
      aBunchOfAnimals[0] = new NamedCow("cow","Michael","green", "moo");           
      aBunchOfAnimals[1] = new Chick("chick","Elsie","cluck");       
      aBunchOfAnimals[2] = new Pig("pig","Meastro","oink");    }         
   public void animalSounds()    {       
     for (int nI=0; nI < aBunchOfAnimals.length; nI++)       {          
       System.out.println( aBunchOfAnimals[nI].getType() + " goes " + aBunchOfAnimals[nI].getSound());       
      }    
      for (int P = 0; P < aBunchOfAnimals.length;P++) {
      System.out.println( "this "+ (aBunchOfAnimals[P].getType()) + "... he is known as " + (aBunchOfAnimals[P]).getName());
      }
      System.out.println("the " + (((NamedCow)aBunchOfAnimals[0]).getType()) + " is " + ((NamedCow)aBunchOfAnimals[0]).getColor());
}
   }
