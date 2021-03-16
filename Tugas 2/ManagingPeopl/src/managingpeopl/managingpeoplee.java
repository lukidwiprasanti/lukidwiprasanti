/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managingpeopl;

/**
 *
 * @author ASUSPC
 */
public class managingpeoplee {
    public static void main(String[] args){
        Person p1 = new Person("Arial", 37);
        Person p2 = new Person("Joseph", 15);
        
        if(p1.getAge()!=p2.getAge())
       {
           System.out.println(p1.getName()+" Is not the same age as "+p2.getName());
       }
       else
       {
           System.out.println(p1.getName()+" Is the same age as "+p2.getName());   
       }
    }

    private static class Person {
        private final String Name;
        private final int Age;

        public class Person{
        String Name;
        int Age;
        
                }) {
            this.Name = Name;
            this.Age = Age;
            
            public String getName(){
                return this.Name;
                
            }
            
        }
    }
    
}
