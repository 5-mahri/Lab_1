package Lab_1;

public class Question_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		specialEleven(22);
		specialEleven(23);
		specialEleven(24);

	}
	public static void specialEleven(int a) {
		if(a%11 == 0 || a%11 == 1) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
