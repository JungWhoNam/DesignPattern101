package lab11.gumballstate;

public class GumballMachine {
	State soldOutState; // 알맹이 매진
	State noQuarterState; // 동전 없음
	State hasQuarterState; // 동전 있음
	State soldState; // 알맹이 판매

	State state;
	int count = 0;

	public GumballMachine(int numberGumballs) {
		// 상태 인스턴스 생성
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);

		// 시작 상태 설정
		this.count = numberGumballs;
		if (numberGumballs > 0) {
			state = noQuarterState;
		} else {
			state = soldOutState;
		}
	}

	public void insertQuarter() {
		state.insertQuarter();
	}

	public void ejectQuarter() {
		state.ejectQuarter();
	}

	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	void releaseBall() {
		System.out.println("알맹이를 내보내고 있습니다.");
		if (count > 0) {
			count = count - 1;
		}
	}

	void setState(State state) {
		this.state = state;
	}

	int getCount() {
		return count;
	}

	public State getState() {
		return state;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}
}
