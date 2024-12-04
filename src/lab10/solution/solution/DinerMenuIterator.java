package lab10.solution.solution;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
	MenuItem[] list;
	// 반복 작업이 처리되고 있는 위치 저장
	int position = 0;

	public DinerMenuIterator(MenuItem[] list) {
		this.list = list;
	}

	// 배열의 다음 원소를 리턴하고 position 값을 1 증가
	@Override
	public MenuItem next() {
		MenuItem menuItem = list[position];
		position = position + 1;
		return menuItem;
	}

	@Override
	public boolean hasNext() {
		if (position >= list.length || list[position] == null) {
			return false;
		} else {
			return true;
		}
	}
}
