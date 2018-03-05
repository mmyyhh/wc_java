
public class RobotMain {

	public static void main(String[] args) {
		Robot robot = new Robot("Android");
		
		//분류코드를 클래스로 치환하기 위해 주석처리
//		robot.order(0);
//		robot.order(1);
//		robot.order(2);
//		robot.order(3);
//		robot.order(4);
		
		//Extract Constant 쓰면 알아보기 훨씬 쉽다. 상수화
		robot.order(Robot.COMMAND_WALK);
		
		//내가 정해놓은 상수 이외의 것들이 들어올수는 있다.
//		robot.order(100);
		
		//없게 만들려면 어떻게 해야 하는가?
		//만들어둔 상수만 쓰게 만들려면?
		//1. 매직넘버를 기호상수로 치환 ("1000/1001" 등)
		//2. 분류코드를 클래스로 치환
		
		//Robot.java와 RobotCommand를 통해 분류코드를 클래스로 치환하면 정해진 상수 이외에는 사용이 불가능해진다.
		
		//열거형은 나중에 검색해보기
		robot.order(Robot.Command.JUMP);
		
		//3월8일 열거형으로 짜보기 낼듯
	}

}
