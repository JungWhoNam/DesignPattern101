package lab06.starter.logger;

public class TestMain {

	public static void main(String[] args) {
        System.out.println("\n====== 케이스 #2 (싱글톤 패턴 사용) ======");
        Logger logger = Logger.getInstance();
        logger.log(LogLevel.TRACE, "추적용 메세지");
		logger.log(LogLevel.DEBUG, "디버그용 메세지");
		logger.log(LogLevel.INFO, "정보 메세지");
		logger.log(LogLevel.WARN, "경고 메세지");
		logger.log(LogLevel.ERROR, "에러 메세지");

		// 모든 로그 출력
		System.out.println("Case #1 ======== ");
		logger.displayLogs();

		// 매개변수로 받은 레벨과 같거나 이상인 로그만 프린트
		System.out.println("\nCase #2 ======== ");
		logger.displayLogs(LogLevel.INFO);
	}
}
