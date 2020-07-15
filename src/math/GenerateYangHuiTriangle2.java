package math;

import java.util.ArrayList;
import java.util.List;

public class GenerateYangHuiTriangle2 {
	public List<Integer> getRow(int rowIndex) {
		List<Integer> lastRow = new ArrayList<>();
		lastRow.add(1);
		if (rowIndex == 0) {
			return lastRow;
		}
		for (int number = 1; number <= rowIndex; number++) {
			List<Integer> tempRow = new ArrayList<>();
			tempRow.add(1);
			for (int j = 1; j < lastRow.size(); j++) {
				tempRow.add(lastRow.get(j - 1) + lastRow.get(j));
			}
			tempRow.add(1);
			lastRow = tempRow;
		}
		return lastRow;
	}
}
