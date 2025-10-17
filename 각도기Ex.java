package testproject;




class Gakdogi {
	public int gakdogi(int angle) {
		int answer = 0;
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