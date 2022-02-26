package by.academy10022.lesson1;

public class Main1 {
	public static void main(String[] args) {
		Cat Cat1 = new Cat();
		Cat Cat2 = new Cat(1);
		Cat Cat3 = new Cat(2, "Vaska");
		Cat Cat4 = new Cat(2, "Александр");
		Cat Cat5 = new Cat(2, "Pusok");
		Cat Cat6 = new Cat(2, "Pusik");
		Cat Cat7 = new Cat(2, "Pavlik");

//		Cat1.sleep();
//		Cat2.sleep();
		// Cat4.sleep();
//		Cat1.eat();
//		Cat2.grow(0);
//		Cat6.grow(50);
//		Cat7.eat();
		System.out.println(Cat4.getAge());
		Cat4.setAge(100);
		System.out.println(Cat4.getAge());
		System.out.println(Cat4.getnickname());
	}

}
