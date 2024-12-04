package lab06.starter.logger;

import java.util.ArrayList;
import java.util.List;

public class LoggerSimple {
	private List<Log> logs;

	public LoggerSimple() {
		logs = new ArrayList<Log>();
	}

	public void log(LogLevel level, String message) {

		// TODO Log 인스턴스 생성 및 추가
	}

	public void displayLogs() {
		// TODO 모든 로그 출력
	}

	public void displayLogs(LogLevel level) {
		// TODO 매개변수로 받은 레벨과 같거나 이상인 로그만 프린트
	}

	public static void main(String[] args) {
		LoggerSimple logger = new LoggerSimple();

		logger.log(LogLevel.TRACE, "추적용 메세지");
		logger.log(LogLevel.DEBUG, "디버그용 메세지");
		logger.log(LogLevel.INFO, "정보 메세지");
		logger.log(LogLevel.WARN, "경고 메세지");
		logger.log(LogLevel.ERROR, "에러 메세지");

		// 모든 로그 출력
		logger.displayLogs();

		// 매개변수로 받은 레벨과 같거나 이상인 로그만 프린트
		logger.displayLogs(LogLevel.INFO);
	}

}