package recursion;

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
//	创建一个棋盘是一个二维数组
//	将当前位置设计为已经访问然后根据当前位置计算马还能走哪些位置,并放到一个集合中arrayList 最多有八个位置 每走一步就使用step+1
//	遍历集合中存放的所有位置,看看哪个可以走通 如果走通了就继续 走不通就回溯
//	判断马是否完成了骑士周游问题 step和应该走的步数比较
//	如果没有达成数量则表示没有完成人物 将整个棋盘置为0
	public static ArrayList<Point> next(Point curPoint){
		ArrayList<Point> ps=new ArrayList<Point>();
//		创建一个Point
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
