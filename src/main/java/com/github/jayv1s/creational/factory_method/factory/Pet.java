package com.github.jayv1s.creational.factory_method.factory;

import com.github.jayv1s.creational.factory_method.interf.IAnimal;

public abstract class Pet {
    public abstract IAnimal defineNewPet();

    public String takeCareOfThePet() {
        IAnimal animal = defineNewPet();
        String fedResult = animal.eat();
        String veterinaryResult = animal.veterinaryTreatment();

        return String.join(" / ", fedResult, veterinaryResult);
    }
}
