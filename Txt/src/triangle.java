import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int x, y, z;
		
		x = scan.nextInt();
		y = scan.nextInt();
		z = scan.nextInt();
		
		if(x+y > z && x+z > y && y+z > x) {
			System.out.println("삼각형입니다1111.");
		}else {
			System.out.println("삼각형이 아닙니다2222 .");
		}
		
	}

}
