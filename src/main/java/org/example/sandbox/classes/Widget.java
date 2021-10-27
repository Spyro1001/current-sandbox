package org.example.sandbox.classes;

import org.example.sandbox.inheritance.animal.Bird;
import org.example.sandbox.inheritance.animal.Fish;

public class Widget {

    private Bird bird;
    private Fish fish;

    // composition
    public Widget() {
        this.bird = new Bird();
        this.fish = new Fish();
    }

    // aggregation
    public Widget(Bird bird, Fish fish) {
        this.bird = bird;
        this.fish = fish;
    }
}
