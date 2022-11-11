package Demo;

public class Animal{

    private int legs;
     private String name;
     private boolean hungry = true;

     public int getLegs(){
         return this.legs;
     }
     public void setLegs(int legs){
         this.legs=legs;
     }
     public String getName() {
         return this.name;
     }
     public void setName(String name){
             this.name=name;
     }
     public boolean getHungry() {
         return this.hungry;
      }

     public Animal(int legs, String name){
         this.legs=legs;
         this.name=name;
     }

     public void eat(){
         if (this.hungry == true) {
             System.out.println("Кушает");
             this.hungry=false;
         }
         else{
             System.out.println("Животное сытое");
         }
     }
}
