//매직 넘버를 기호화된 상수로 치환
//Replace Magic Number width Symbolic Constant
//
//매직 넘버 : 소스코드에 특정한 의미를 나타내는 숫자
public class Robot {
	//분류코드를 클래스로 치환하기 위해 주석처리
//	public static final int COMMAND_STOP = 1;
//	public static final int COMMAND_WALK = 0;
	
	public static final RobotCommand COMMAND_STOP = new RobotCommand("STOP");
	public static final RobotCommand COMMAND_WALK = new RobotCommand("WALK");

	private final String name;
	
	
	////// 자바 새 버전의 열거형
	public enum Command {
		WALK,
		STOP,
		JUMP
	};
	/////
	
	
	
	public Robot (String name) {
		this.name = name;
	}
	
	//분류코드를 클래스로 치환하기 위해 주석처리
//	public void order(int command) {
//		//리팩토링해보자.
//		if (command == COMMAND_WALK) { //0이었는데 Extract Constrant 사용시 저렇게 바뀜 / 상수화
//			System.out.println(name + "walks");
//		} else if (command == COMMAND_STOP) {
//			System.out.println(name + "stops");
//		} else if (command == 2) {
//			System.out.println(name + "jumps");
//		} else {
//			System.out.println(command + "is error");
//		}
//	}
	
	public void order(RobotCommand command) {
		//리팩토링해보자.
		if (command == COMMAND_WALK) { //0이었는데 Extract Constrant 사용시 저렇게 바뀜 / 상수화
			System.out.println(name + "walks");
		} else if (command == COMMAND_STOP) {
			System.out.println(name + "stops");
		}  else {
			System.out.println(command + "is error");
		}
	}
	
	//enum 열거형을 사용해보자. 이것 외에는 들어올 수 없음
	public void order(Robot.Command command) {
		//리팩토링해보자.
		if (command == Robot.Command.WALK) { //0이었는데 Extract Constrant 사용시 저렇게 바뀜 / 상수화
			System.out.println(name + "walks");
		} else if (command == Robot.Command.STOP) {
			System.out.println(name + "stops");
		}  else {
			System.out.println(command + "is error");
		}
	}
	
	
}
