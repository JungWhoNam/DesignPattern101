package lab11.solution.gumballstate;

public class GumballMachine {
	State soldOutState; // 알맹이 매진
	State noQuarterState; // 동전 없음
	State hasQuarterState; // 동전 있음
	State soldState; // 알맹이 판매
	State winnerState;

	State state;
	int count = 0;

	public GumballMachine(int numberGumballs) {
		// 상태 인스턴스 생성
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);

		// 시작 상태 설정
		this.count = numberGumballs;
		if (numberGumballs > 0) {
			state = noQuarterState;
		} else {
			state = soldOutState;
		}
	}

	// 동전 넣기
	public void insertQuarter() {
		state.insertQuarter();
	}

	// 동전 빼기
	public void ejectQuarter() {
		state.ejectQuarter();
	}

	// 손잡이 돌림
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	// 알맹이 내보내기
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

	public State getWinnerState() {
		return winnerState;
	}
}
