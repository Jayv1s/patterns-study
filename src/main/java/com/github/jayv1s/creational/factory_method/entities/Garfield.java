package com.github.jayv1s.creational.factory_method.entities;

import com.github.jayv1s.creational.factory_method.factory.Pet;
import com.github.jayv1s.creational.factory_method.implementation.Cat;
import com.github.jayv1s.creational.factory_method.interf.IAnimal;

public class Garfield extends Pet {

    @Override
    public IAnimal defineNewPet() {
        return new Cat();
    }
}
