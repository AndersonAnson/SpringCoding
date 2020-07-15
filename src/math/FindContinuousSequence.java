package math;

import java.util.ArrayList;

public class FindContinuousSequence {
    public ArrayList<ArrayList<Integer>> findContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        for (int i = 1; i < sum; i++) {
            int temp = 0;
            int j = i;
            while (temp < sum) {
                temp += j;
                j++;
            }
            if (temp == sum) {// ����ҵ�����ô��Ҫ��������ӵ���������С�
                ArrayList<Integer> newArray = new ArrayList<Integer>();
                for (int k = i; k < j; k++)
                    newArray.add(k);
                result.add(newArray);
            }
        }
        return result;
    }
}
