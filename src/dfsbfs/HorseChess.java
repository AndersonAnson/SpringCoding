package dfsbfs;

import java.awt.Point;
import java.util.ArrayList;

public class HorseChess {
	private static int X;
	private static int Y;
	private static boolean visited[];
	private static boolean finished[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
//	����һ��������һ����ά����
//	����ǰλ�����Ϊ�Ѿ�����Ȼ����ݵ�ǰλ�ü�����������Щλ��,���ŵ�һ��������arrayList ����а˸�λ�� ÿ��һ����ʹ��step+1
//	���������д�ŵ�����λ��,�����ĸ�������ͨ �����ͨ�˾ͼ��� �߲�ͨ�ͻ���
//	�ж����Ƿ��������ʿ�������� step��Ӧ���ߵĲ����Ƚ�
//	���û�д���������ʾû��������� ������������Ϊ0
	public static ArrayList<Point> next(Point curPoint){
		ArrayList<Point> ps=new ArrayList<Point>();
//		����һ��Point
		Point p1=new Point();
		if((p1.x=curPoint.x-2)>=0&&(p1.y=curPoint.y-1)>=0) {
			ps.add(new Point(p1));
		}
		if((p1.x=curPoint.x-1)>=0&&(p1.y=curPoint.y-2)>=0) {
			ps.add(new Point(p1));
		}
		if((p1.x=curPoint.x+1)<=X&&(p1.y=curPoint.y-2)>=0) {
			ps.add(new Point(p1));
		}
		if((p1.x=curPoint.x+2)<=X&&(p1.y=curPoint.y-1)>=0) {
			ps.add(new Point(p1));
		}
		if((p1.x=curPoint.x+2)<=X&&(p1.y=curPoint.y+1)<=Y) {
			ps.add(new Point(p1));
		}
		if((p1.x=curPoint.x+1)<=X&&(p1.y=curPoint.y+2)>=0) {
			ps.add(new Point(p1));
		}
		if((p1.x=curPoint.x-1)<=X&&(p1.y=curPoint.y+2)>=0) {
			ps.add(new Point(p1));
		}
		if((p1.x=curPoint.x-2)<=X&&(p1.y=curPoint.y+1)>=0) {
			ps.add(new Point(p1));
		}
		return ps;
	}
}
