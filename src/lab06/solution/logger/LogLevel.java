package lab06.solution.logger;

public enum LogLevel {
	TRACE(1), DEBUG(2), INFO(3), WARN(4), ERROR(5);

	private final int level;

	LogLevel(int level) {
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public static void main(String[] args) {
		// Enum 타입 객체 생성
		LogLevel level0 = LogLevel.INFO;
		System.out.println(level0 == LogLevel.TRACE); // false
		System.out.println(level0 == LogLevel.INFO); // true
		System.out.println(level0 == LogLevel.ERROR); // false

		// 전체 열거 객체 중 몇 번째 열거 객체인지 확인
		System.out.println(level0.ordinal()); // 2
		System.out.println(LogLevel.TRACE.ordinal()); // 0
		System.out.println(LogLevel.INFO.ordinal()); // 2
		System.out.println(LogLevel.ERROR.ordinal()); // 4
	}

}
