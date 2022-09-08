/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1ex1;

/**
 *
 * @author PHOTON
 */
public class Ex01PhotonLeonin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    String name1 = "Chijmes";
    String color1 = "Black";
    int age1 = 16;
    
    String name2 = "Mia";
    String color2 = "Purple";
    int age2 = 16;
    
    String name3 = "Vicky";
    String color3 = "Blue";
    int age3 = 16;
            
    System.out.println ("Student 1");
    System.out.printf("Name: %s%nFavorite color: %s%nAge: %d%n", name1, color1, age1);
    System.out.println ();
    System.out.println ("Student 2");
    System.out.printf("Name: %s%nFavorite color: %s%nAge: %d%n", name2,color2, age2);
    System.out.println ();
    System.out.println ("Student 3");
    System.out.printf("Name: %s%nFavorite color: %s%nAge: %d%n", name3,color3, age3);
    System.out.println ();
    
    int sum = age1 + age2 + age3;
    
    System.out.println("The sum of their ages is: " + sum);
    System.out.println("Mia is older than Vicky by a year: " + (age2 > age3));
    System.out.println("Chijmes' favorite color is blue: " + ("blue".equals(color2)));
    
    }
    
}
