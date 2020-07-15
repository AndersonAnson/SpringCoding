package array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class AdjustArray {
	public int adjustOneNum(int a) {
		return a*2;
	}
	
	public static boolean compareTwo(int a,int b) {
		if(a==b) {
			return true;
		}
		else if(a<b) {
			return compareTwo(2*a,b);
		}
		else {
			return compareTwo(a,2*b);
		}
	}
	public String res() {
		Scanner in = new Scanner(System.in);
		int N=in.nextInt();
		LinkedList<Integer> list=new LinkedList<Integer>();
		int[] arr=new int[N];
		boolean[] b=new boolean[N];
		
		int i=0;
		for(i=0;i<N;i++) {
//			Integer tmp=new Integer(in.nextInt);
			int temp=in.nextInt();
			arr[i]=temp;
			list.add(temp);
		}
		in.close();
		Arrays.sort(arr);
		for(int j=1;i<N;j++) {
			if(compareTwo(arr[0],arr[j])) {
				b[j]=true;
			}
			else {
				b[j]=false;
				return new String("NO");
			}
		}
		return new String("YES");
	}
	public static void main(String[] args) {
		new AdjustArray().res();
		
	}
}
