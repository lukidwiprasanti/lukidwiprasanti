/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author ASUSPC
 */
public class ManagingPeople {
    // Class Name Which is include 2 Atribute : Name and Ages //
    class person {
        String Name;
        int Ages;
        
        public person (String Name, int Ages){
            this.Name = Name;
            this.Ages = Ages;
        }
        public String getName(){
            return Name;
        }
        public int getAges(){
            return Ages;
        }
        
        public void setAges(int Ages){
            this.Ages = Ages;
        }
        public static void main(String[]args){
            Person pl = new Person("Arial", 37);
        Person p2 = new Person("Joseph", 15);
        
        if(p1.getAge()==p2.getAge()){
            System.out.println(p1.getName()+ "is the same age as "+p2.getName());
        }
        else
        { 
            System.out.println(p1.getName()+ "is NOT the same age as "+p2.getName());
        } 
        }
    }
    }
}
  