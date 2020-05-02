
import java.util.Random;
public class Randomization{
	private static char[] alphabets = {'a','b','c','d','e','f'
							,'g','h','i','j','k','l','m',
							'n','o','p','q','r','s','t'
							,'u','v','w','x','y','z'};
	public static String buildString(int size){
		Random rand = new Random();
		String result = "";
		for (int i =0; i < size; i++){
			result += alphabets[rand.nextInt(26)];
		}
		return result;
	}
	public static void main(String[] args){
		String input = "";
		int size = 1000;
		String s1 = buildString(size);
		size = 2000;
		String s2 = buildString(size);
		size = 3000;
		String s3 = buildString(size);
		size = 4000;
		String s4 = buildString(size);
		size = 5000;
		String s5 = buildString(size);
		size = 6000;
		String s6 = buildString(size);
		size = 7000;
		String s7 = buildString(size);
		size = 8000;
		String s8 = buildString(size);
		size = 9000;
		String s9 = buildString(size);
		size = 10000;
		String s10 = buildString(size);

		System.out.println(s1);
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println(s2);
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println(s3);
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println(s4);
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println(s5);
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println(s6);
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println(s7);
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println(s8);
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println(s9);
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println(s10);
		System.out.println("---------------------------------------------------------------------------------------------");
	}
}
