package testproject;



class MyPerson extends Object {
	int age;
	String name;
	int score1;
	int score2;
	int score3;

	int e = 0;
	
	
	public MyPerson(String n, int a , int s1, int s2, int s3) {
		name = n;
		age = a;
		score1 = s1;
		score2 = s2;
		score3 = s3;
		
		
	}
	
	public void 성적평균구하기() {
		int result = score1 + score2 + score3;
		e = result / 3;
		
		
	}
	
	public void 성적표출력() {
		System.out.println("이름" + name);
		System.out.println("나이" + age);
		System.out.println("평균" + e);
		
	}