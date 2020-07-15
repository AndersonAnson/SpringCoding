package linklist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoopLength {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String input=in.nextLine();
		in.close();
		StringBuilder s=new StringBuilder();
		String[] str = input.split(",");
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < str.length; i++) {
			list.add(Integer.valueOf(str[i]));
		}
		System.out.println(list);
		char[] arr=input.toCharArray();
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		Map<Integer,Integer> map=new HashMap<>();
		int left=2;
		int right=4;
	}
}
