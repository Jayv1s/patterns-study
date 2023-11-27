package com.github.jayv1s;

import com.github.jayv1s.creational.factory_method.entities.Garfield;
import com.github.jayv1s.creational.factory_method.entities.ScoobyDoo;
import com.github.jayv1s.creational.factory_method.factory.Pet;

public class Main {
    public static void main(String[] args) {

        Pet firstPet = new Garfield();

        Pet secondPet = new ScoobyDoo();

        System.out.println(firstPet.takeCareOfThePet());

        System.out.printf(secondPet.takeCareOfThePet());
    }
}