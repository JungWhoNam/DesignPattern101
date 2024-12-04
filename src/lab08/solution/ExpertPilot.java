package lab08.solution;

public class ExpertPilot implements Pilot {
	String name;

	public ExpertPilot(String name) {
		this.name = name;
	}

	@Override
	public void introduce() {
		System.out.println("사람: 조종사 " + name + " 입니다.");
	}

	@Override
	public void prepare() {
		System.out.println("사람: 천천히 검지 손가락을 풉니다.");
	}

	@Override
	public void fly() {
		System.out.println("사람: '이륙' 버튼을 누릅니다.");
	}

}
