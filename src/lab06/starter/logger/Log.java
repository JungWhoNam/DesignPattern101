package lab06.starter.logger;

import java.time.LocalDateTime;

public class Log {
	private LogLevel level;
	private LocalDateTime time;
	private String message;

	public Log(LogLevel level, String message) {
		this.level = level;
		this.time = LocalDateTime.now();
		this.message = message;
	}

	public LogLevel getLevel() {
		return level;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public String getMessage() {
		return message;
	}
	
	// setter 는 일부러 구현 하지 않음

	@Override
	public String toString() {
		return String.format("[%s] [%s] %s", level, time, message);
	}

	public static void main(String[] args) {
		Log log1 = new Log(LogLevel.TRACE, "추적용 메세지");
		Log log2 = new Log(LogLevel.DEBUG, "디버그용 메세지");
		Log log3 = new Log(LogLevel.INFO, "정보 메세지");
		Log log4 = new Log(LogLevel.WARN, "경고 메세지");
		Log log5 = new Log(LogLevel.ERROR, "에러 메세지");

		System.out.println(log1);
		System.out.println(log2);
		System.out.println(log3);
		System.out.println(log4);
		System.out.println(log5);
	}

}
