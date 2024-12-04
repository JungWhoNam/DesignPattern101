package lab11.starter.gumball;

public class GumballMachine {

	final static int SOLD_OUT = 0; // 알맹이 매진
	final static int NO_QUARTER = 1; // 동전 없음
	final static int HAS_QUARTER = 2; // 동전 있음
	final static int SOLD = 3; // 알맹이 판매

	int state = SOLD_OUT; // 현재 상태
	int count = 0; // 현재 알맹이 수

	public GumballMachine(int count) {
		this.count = count;
		if (count > 0) {
			state = NO_QUARTER;
		}
	}

	// 동전이 투입된 경우
	public void insertQuarter() {
		if (state == HAS_QUARTER) { // 동전 있음 상태
			System.out.println("동전은 한 개만 넣어주세요.");
		} else if (state == NO_QUARTER) { // 동전 없음 상태
			state = HAS_QUARTER; // 동전 있음 상태로 변경
			System.out.println("동전이 투입되었습니다.");
		} else if (state == SOLD_OUT) { // 알맹이 매진 상태
			System.out.println("매진되었습니다.");
		} else if (state == SOLD) { // 알맹이 판매 상태
			System.out.println("알맹이를 내보내고 있습니다.");
		}
	}

	// 동전이 반환되는 경우
	public void ejectQuarter() {
		if (state == HAS_QUARTER) {
			System.out.println("동전이 반환됩니다.");
			state = NO_QUARTER; // 동전 없음 상태로 변경
		} else if (state == NO_QUARTER) {
			System.out.println("동전을 넣어 주세요.");
		} else if (state == SOLD) {
			System.out.println("이미 알맹이를 뽑으셨습니다.");
		} else if (state == SOLD_OUT) {
			System.out.println("동전을 넣지 않으셨습니다. 동전이 반환되지 않습니다.");
		}
	}

	// 손잡이를 돌리는 경우
	public void turnCrank() {
		if (state == SOLD) {
			System.out.println("손잡이는 한 번만 돌려 주세요.");
		} else if (state == NO_QUARTER) {
			System.out.println("동전을 넣어 주세요.");
		} else if (state == SOLD_OUT) {
			System.out.println("매진되었습니다.");
		} else if (state == HAS_QUARTER) {
			System.out.println("손잡이를 돌리셨습니다.");
			state = SOLD;
			dispense();
		}
	}

	// 알맹이 내보내기
	private void dispense() {
		if (state == SOLD) {
			System.out.println("알맹이를 내보내고 있습니다.");
			count = count - 1;
			if (count == 0) {
				System.out.println("더 이상 알맹이가 없습니다.");
				state = SOLD_OUT;
			} else {
				state = NO_QUARTER;
			}
		} else if (state == NO_QUARTER) {
			System.out.println("동전을 넣어 주세요.");
		} else if (state == SOLD_OUT) {
			System.out.println("매진입니다.");
		} else if (state == HAS_QUARTER) {
			System.out.println("알맹이를 내보낼 수 없습니다.");
		}
	}
}
