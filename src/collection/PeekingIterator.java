package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PeekingIterator implements Iterator<Integer> {
	List<Integer> list = new ArrayList<>();

	public PeekingIterator(Iterator<Integer> iterator) {
		// initialize any member here.
		while (iterator.hasNext()) {
			list.add(iterator.next());
		}
	}

	// Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
		if (list.size() > 0) {
			Integer result = list.get(0);
			return result;
		}
		return null;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
		if (list.size() > 0) {
			Integer result = list.get(0);
			list.remove(0);
			return result;
		}
		return null;
	}

	@Override
	public boolean hasNext() {
		if (list.size() > 0) {
			return true;
		} else {
			return false;
		}
	}
}
