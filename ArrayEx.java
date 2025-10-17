package testproject;

class number{
	public int[] numbers(int[] num_list) {
		// 1. 입력 배열과 길이가 같고, 반환할 결과를 저장할 
		//새로운 배열(answer)을 생성합니다.
		int [] answer = new int [num_list.length];
		
		int a = num_list.length; // a 에다가 배열의 길이 저장
		
		// 반복문을 통해 배열의 모든 요소 순회
		for(int i = 0; i < num_list.length; i++) {
			// 배열의 a-i-1 번째 위치(뒤에서 부터) 대입
			//ex) i = 0 일 때 [a-1] = num_list[0]; 첫 요소를 마지막에
			answer[a-i-1] = num_list[i];
			
		}
		return answer;
	}
		
}




public class JavaTest4Ex {
	public static void main(String[] args) {
		number n = new number();
		
		int[] inputArray = {1,2,3,4,5};
		
		int[] result = n.numbers(inputArray);
		
		System.out.println(java.util.Arrays.toString(result));
		
		
		
	}
	
	
	
}