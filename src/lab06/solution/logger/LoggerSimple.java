package lab06.solution.logger;

import java.util.ArrayList;
import java.util.List;

public class LoggerSimple {
	private List<Log> logs;

	public LoggerSimple() {
		logs = new ArrayList<Log>();
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

	public static void main(String[] args) {
		LoggerSimple logger = new LoggerSimple();

		logger.log(LogLevel.TRACE, "추적용 메세지");
		logger.log(LogLevel.DEBUG, "디버그용 메세지");
		logger.log(LogLevel.INFO, "정보 메세지");
		logger.log(LogLevel.WARN, "경고 메세지");
		logger.log(LogLevel.ERROR, "에러 메세지");

		// 모든 로그 출력
		System.out.println("모든 로그:");
		logger.displayLogs();

		// 매개변수로 받은 레벨과 같거나 이상인 로그만 프린트
		System.out.println("\n특정 로그 이상:");
		logger.displayLogs(LogLevel.INFO);
	}
}