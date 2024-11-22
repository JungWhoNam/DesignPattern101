package lab10.two.java;

import java.util.Iterator; // 자바 Iterator 사용

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

	@Override
	public void remove() {
		// 메뉴 항목은 없애는 것은 잘못된 것이라고 예외 표시
		throw new UnsupportedOperationException("메뉴 항목은 지우면 안 됩니다.");
	}
}
