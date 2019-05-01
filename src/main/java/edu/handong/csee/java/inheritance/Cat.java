package edu.handong.csee.java.inheritance;

public class Cat extends Animal {
	String name = "Cat";
	
	public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

	public static void main(String[] args) {
		Cat myCat = new Cat(); 
		myCat.testClassMethod(); //hiding - static method 
		myCat.testInstanceMethod(); //overriding 
		System.out.println(myCat.name);
		
		Animal myAnimal = myCat; //polymorphism
        myAnimal.testClassMethod();
        myAnimal.testInstanceMethod(); //overriding
        
        Animal myAnimal2 = new Dog(); //polymorphism
        myAnimal2.testClassMethod(); //hiding
        myAnimal2.testInstanceMethod(); //overriding
	}

}
