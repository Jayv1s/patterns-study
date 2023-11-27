package com.github.jayv1s.creational.factory_method.implementation;

import com.github.jayv1s.creational.factory_method.interf.IAnimal;

public class Dog implements IAnimal {
    @Override
    public String eat() {
        return "The dog has been fed!";
    }

    @Override
    public String veterinaryTreatment() {
        return "All treatments have been done for the dog!";
    }
}
