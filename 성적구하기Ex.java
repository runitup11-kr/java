package testproject;



class MyPerson extends Object {
	int age;
	String name;
	int score1;
	int score2;
	int score3;

	int e = 0; // 성적의 평균을 저장할 변수 (초기값 0)
	

	// 생성자: MyPerson 객체를 만들 때 초기 데이터를 설정합니다.
	// n: 이름, a: 나이, s1, s2, s3: 세 과목 점수
	public MyPerson(String n, int a , int s1, int s2, int s3) {
		name = n;
		age = a;
		score1 = s1;
		score2 = s2;
		score3 = s3;
		
		
	}
	// 메서드: 세 과목 점수의 평균을 계산하여 'e' 변수에 저장합니다.
	public void 성적평균구하기() {
		int result = score1 + score2 + score3;
		e = result / 3;
		
		
	}
	
	
	public void 성적표출력() {
		System.out.println("이름" + name);
		System.out.println("나이" + age);
		System.out.println("평균" + e);
		
	}
	
}


public class 성적구하기2Ex extends Object{
	public static void main(String[] args) {
        //MyPerson 클래스 객체 (인스턴스) m1 생성.
		MyPerson m1 = new MyPerson("ㄴㄴㄴ" ,20 ,30 ,40 ,60);
		m1.성적평균구하기(); //출력
		m1.성적표출력(); //출력

	}

}