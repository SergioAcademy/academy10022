package by.academy10022.lesson1;

public class Cat {
	int age;
	String nickname;

	public Cat() {
		super();
	}

	public Cat(int age) {
		super();
		this.age = age;
	}

	public Cat(int age, String nickname) {
		super();
		this.age = age;
		this.nickname = nickname;
	}

	public void sleep() {
		System.out.println("kot spiit:" + nickname);
	}

	public void eat() {
		System.out.println("kot est:" + nickname);
	}

	public void grow(int addAge) {
		age = age + addAge;
		System.out.println("kot viros:" + age);

	}

	public int getAge() {
		return age;
	}

	public String getnickname() {
		return nickname;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setnickname(String nickname) {
		this.nickname = nickname;
	}
	
}
