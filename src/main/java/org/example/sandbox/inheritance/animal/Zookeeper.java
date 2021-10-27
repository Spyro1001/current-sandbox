package org.example.sandbox.inheritance.animal;

import org.example.sandbox.classes.Widget;

import java.util.ArrayList;
import java.util.List;

public class Zookeeper {

    public static void main(String[] args) {

        Animal bird = new Bird();
        Animal fish = new Fish();
        Animal reptile = new Reptile();
        Animal invertebrate = new Invertebrate();
        Animal mammal = new Mammal();
        Animal amphibian = new Amphibian();

        List<Animal> animals = new ArrayList<>();
        animals.add(bird);
        animals.add(fish);
        animals.add(reptile);
        animals.add(invertebrate);
        animals.add(mammal);
        animals.add(amphibian);

        for (Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName());
        }

        // aggregation
        Widget widget = new Widget((Bird)bird, (Fish)fish);

    }
}
