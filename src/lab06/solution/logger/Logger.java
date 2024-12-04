package lab06.solution.logger;

import java.util.ArrayList;
import java.util.List;

public class Logger {
	private static Logger uniqueInstance;

	private List<Log> logs;

	private Logger() {
		logs = new ArrayList<Log>();
	}

	public static Logger getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Logger();
		}
		return uniqueInstance;
	}

	public void log(LogLevel level, String message) {
		// Log 인스턴스 생성 및 추가
		logs.add(new Log(level, message));
	}

	public void displayLogs() {
		// 모든 로그 출력
		for (Log log : logs) {
			System.out.println(log);
		}
	}

	public void displayLogs(LogLevel level) {
		// 매개변수로 받은 레벨과 같거나 이상인 로그만 프린트
		for (Log log : logs) {
			if (log.getLevel().ordinal() >= level.ordinal()) {
				System.out.println(log);
			}
		}
	}
}
