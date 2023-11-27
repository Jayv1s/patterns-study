package com.github.jayv1s.creational.factory_method.entities;

import com.github.jayv1s.creational.factory_method.factory.Pet;
import com.github.jayv1s.creational.factory_method.implementation.Dog;
import com.github.jayv1s.creational.factory_method.interf.IAnimal;

public class ScoobyDoo extends Pet {
    @Override
    public IAnimal defineNewPet() {
        return new Dog();
    }
}
