package math;

import java.util.ArrayList;
import java.util.List;

public class GenerateYangHuiTriangle {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> row = new ArrayList<>();
		if (numRows == 0) {
			return res;
		}
		res.add(row);
		res.get(0).add(1);
		for (int rowNum = 1; rowNum < numRows; rowNum++) {
			List<Integer> tmpRow = new ArrayList<>();
			List<Integer> upRow = res.get(rowNum - 1);
			tmpRow.add(1);
			for (int j = 1; j < upRow.size(); j++) {
				tmpRow.add(upRow.get(j - 1) + upRow.get(j));
			}
			tmpRow.add(1);
			res.add(tmpRow);
		}
		return res;
	}
}
