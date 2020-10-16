package Lab_1;

public class Question_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		caughtSpeeding(60, false);
		caughtSpeeding(65, false);
		caughtSpeeding(65, true);

	}
	
	public static void caughtSpeeding(int a, boolean birthday) {
			if(birthday) {
				a-=5;
				if(a<=60) {
					System.out.println("0");
			}else if(a>=61 && a<=80){
				System.out.println("1");
				}else if (a>=81) {
					System.out.println("2");
				}
		}else  {
			if(a<=60) {
			System.out.println("0");
			}else if(a>=61 && a<=80){
				System.out.println("1");
			} else if (a>=81) {
			System.out.println("2");
		}
		}
			}
	}
