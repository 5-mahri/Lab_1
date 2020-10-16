package Lab_1;

public class Question_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		deerPlay(70,false);
		deerPlay(95, false);
		deerPlay(91,true);

	}
	public static void deerPlay(int a, boolean isSummer) {
		if(isSummer) {
			if(a>60 && a<100) {
				System.out.println("true");
			}else {
				System.out.println("false");
				}
		}else {
			if(a>60 && a<90) {
				System.out.println("true");
			}
			else {
			System.out.println("false");
			}
			}
		}
}
