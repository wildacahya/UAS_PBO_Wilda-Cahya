/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.animal;

/**
 *
 * @author ASUS
 */
public class TestAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();
        d.setName("MyFish");
        d.eat();
        System.out.println("This fish's name is"+d.getName());
        d.walk();
        c.eat();
        System.out.println("This fish's name is"+c.getName());
        c.walk();
        ((Fish)a).setName("MyFish2");
        ((Fish)a).eat();
        System.out.println("This fish's name is"+((Fish)a).getName());
        ((Fish)a).walk();
        ((Spider)e).eat();
        ((Spider)e).walk();
        ((Cat)p).setName("MyCat");
        ((Cat)p).eat();
        System.out.println("This fish's name is"+((Cat)p).getName());
        ((Cat)p).walk();
    }
}
    
