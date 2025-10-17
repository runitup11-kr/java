package testproject;

abstract class Animal {
	abstract public void cry(); // 추상화 메소드
}

class Cat extends Animal {
	public void cry() { // 상속받은 메소드 기능 재정의 -> 메소드 오버라이딩
		System.out.println("야옹");
	}
}

class Dog extends Animal{
	public void cry() { // 상속받은 추상화메소드 오버라이딩해서 일반메소드로 변경
		System.out.println("멍멍");
		}
	
}

class Pig extends Animal{
	@Override
	public void cry() {
		System.out.println("꿀꿀");
		
	}
}




public class 추상화Ex {

	public static void main(String[] args) {
		
		Cat c = new Cat();
		c.cry();
		
		Dog d = new Dog();
		d.cry();
		
		Pig p = new Pig();
		p.cry();
		
		Animal[] a = new Animal[3];
		a[0] = c;
		a[1] = d;
		a[2] = p;
		
		a[0].cry();
		a[1].cry();
		a[2].cry();

	}

}