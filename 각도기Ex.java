package testproject;




class Gakdogi {
	public int gakdogi(int angle) {
        // 최종적으로 반환할 정답(각의 종류를 나타내는 숫자)을 저장할 변수 (초기값 0
		int answer = 0;
        // 각의 종류(예각, 직각, 둔각, 평각)를 문자열로 저장할 변수
		String gak = null;
		if(0 < angle && angle < 90) {
			gak = "예각";
		};
		if(angle == 90) {
			gak = "직각";
		};
		if (90 < angle && angle < 180) {
			gak = "둔각";
		};
		if (angle == 180) {
			gak = "평각";
		};
        //각의 종류(gak) 문자열에 따라 'answer' 변수에 해당하는 정수 값을 설정합니다.
		switch(gak) {
		case "예각":
			answer = 1;
			break;
		case "직각":
			answer = 2;
			break;
		case "둔각":
			answer = 3;
			break;
		case "평각":
			answer = 4;
			break;
		};
		return answer;
	}
}






public class 각도기Ex {
	public static void main(String[] args) {
		Gakdogi g = new Gakdogi();
		System.out.println(g.gakdogi(180));
	}

}