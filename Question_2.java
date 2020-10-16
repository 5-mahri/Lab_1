package Lab_1;

public class Question_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		love6(6,4);
		love6(4,5);
		love6(1,5);
		love6(12,6);

	}
	
	public static void love6(int a, int b) {
		if(a==6 || b==6) {
			System.out.println("true");
		}else if((a+b)==6) {
			System.out.println("true");
		}else if((a-b)==6 || (b-a)==6) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
