package edu.johnmelvinrabino;
import java.util.*;
public class Main{

    public static void main(String args[]) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Ana");
        names.add("Mark");
        names.add("Ana"); // duplicates allowed

        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String n = it.next();
            System.out.println(n);
        }

        for (String n : names) {
            System.out.println(n);
        }

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i).toString());
        }

        var animals = new ArrayList<Animal>();
        var a = new Animal();
        a.color = "brown";
        a.name = "kupal";
        animals.add(a);
        animals.add(new Animal() {
        });

    }

    static class Animal {
        public String color;
        public String name;
        public Animal() {
            this.color = color;
            this.name = name;
        }
    }
    
}