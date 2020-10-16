package Lab_1;

public class Question_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringTimes("Hi",2);
		stringTimes("Hi",3);
		stringTimes("Hi",1);

	}
	
	public static void stringTimes(String word, int num ) {
		
		if(num>0) {
			for(int i=1; i<=num; i++) {
				System.out.print("Hi ");
			}
			System.out.println();
		}else {
				System.out.println("Not valid num");
			}
		}
		
	}
