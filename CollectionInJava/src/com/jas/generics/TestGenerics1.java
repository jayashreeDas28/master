/**
 * 
 * @author jayashreedas
 *
 *will check it out how generics works with regular array
 */
package com.jas.generics;
import java.util.*;
public class TestGenerics1 {
	public static void main(String arg[]) {
		new TestGenerics1().go();;
	}
	
	public void go() {
		// declaring a animal array having all kind a animal
		Animal[ ] animals = {new Dog(), new Cat(), new Dog()};
		
		// declaring an array with only dog 
		Dog[] dogs = {new Dog(), new Dog(), new Dog()};
		//takeAnimals(animals);
		//takeAnimals(dogs);
		
		
		
		// will try now with arrayList instead of Array 
		ArrayList<Animal> animalArrayList = new ArrayList<Animal>();
		animalArrayList.add(new Dog());
		animalArrayList.add(new Cat());
		animalArrayList.add(new Dog());
		//takeAnimlas(animalArrayList);
		
		ArrayList<Dog>  dogArrayList = new ArrayList<Dog>();
		dogArrayList.add(new Dog());
		takeAnimals(dogArrayList);
		
	}
	
	
	public void takeAnimals(Animal[] animals) {
		for(Animal animal : animals) {
			animal.eat();
		}
	}
	
	public void takeAnimlas(ArrayList<Animal> animalArrayList) {
		for(Animal animal : animalArrayList) {
			animal.eat();
		}
	}
	
	
	public void takeAnimals(ArrayList<? extends Animal> animals) {
		animals.add(null);
		for(Animal a : animals) {
			a.eat();
		}
	}

}
