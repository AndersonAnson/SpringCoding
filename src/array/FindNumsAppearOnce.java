package array;

import java.util.Arrays;
import java.util.Stack;

public class FindNumsAppearOnce {
	public void findNumsAppearOnce(int[] array, int num1[], int num2[]) {
//      ���������η���ջ�� ���pop==peek
//    	�յĻ�����ӽ���ջ
		Arrays.sort(array);
		Stack<Integer> st = new Stack<Integer>();
		for (int i = 0; i < array.length; i++) {
			if (st.empty() || st.peek() != array[i]) {
				st.push(array[i]);
			} else if (st.peek() == array[i]) {
				st.pop();
			}
		}
		num1[0] = st.pop();
		num2[0] = st.pop();
	}
}
