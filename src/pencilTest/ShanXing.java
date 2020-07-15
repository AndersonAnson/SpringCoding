package pencilTest;

import java.util.Scanner;

public class ShanXing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
//		定义远点
		int oriX = in.nextInt();
		int oriY = in.nextInt();
		// 定义中心线
		int centralX = in.nextInt();
		int centralY = in.nextInt();
//		定义圆心角大小
		int angle = in.nextInt();
//		定义p点坐标
		int pX = in.nextInt();
		int pY = in.nextInt();

		int dX = pX - oriX;
		int dY = pY - oriY;
		float length = (float) Math.sqrt(dX * dX + dY * dY);
		float normalDx = dX / length;
		float normalDy = dY / length;
		double hudu = Math.acos(normalDx * centralX + normalDy * centralY);
		if (Math.toDegrees(hudu) <= angle) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

}
