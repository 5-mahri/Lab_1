package Lab_1;

public class Question_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cigarParty(30,false);
		cigarParty(50,false);
		cigarParty(65,true);

	}
	public static void cigarParty(int a, boolean weekend) {

			if(weekend) {
				if(a>=40) {
				System.out.println("true");
				}else {
				System.out.println("false");
				}
			}else {
				if(a>=40 && a<=60) {
					System.out.println("true");
				}else {
					System.out.println("false");
				
			}
			}
		}

	}
