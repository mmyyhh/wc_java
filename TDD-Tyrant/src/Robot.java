//���� �ѹ��� ��ȣȭ�� ����� ġȯ
//Replace Magic Number width Symbolic Constant
//
//���� �ѹ� : �ҽ��ڵ忡 Ư���� �ǹ̸� ��Ÿ���� ����
public class Robot {
	//�з��ڵ带 Ŭ������ ġȯ�ϱ� ���� �ּ�ó��
//	public static final int COMMAND_STOP = 1;
//	public static final int COMMAND_WALK = 0;
	
	public static final RobotCommand COMMAND_STOP = new RobotCommand("STOP");
	public static final RobotCommand COMMAND_WALK = new RobotCommand("WALK");

	private final String name;
	
	
	////// �ڹ� �� ������ ������
	public enum Command {
		WALK,
		STOP,
		JUMP
	};
	/////
	
	
	
	public Robot (String name) {
		this.name = name;
	}
	
	//�з��ڵ带 Ŭ������ ġȯ�ϱ� ���� �ּ�ó��
//	public void order(int command) {
//		//�����丵�غ���.
//		if (command == COMMAND_WALK) { //0�̾��µ� Extract Constrant ���� ������ �ٲ� / ���ȭ
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
		//�����丵�غ���.
		if (command == COMMAND_WALK) { //0�̾��µ� Extract Constrant ���� ������ �ٲ� / ���ȭ
			System.out.println(name + "walks");
		} else if (command == COMMAND_STOP) {
			System.out.println(name + "stops");
		}  else {
			System.out.println(command + "is error");
		}
	}
	
	//enum �������� ����غ���. �̰� �ܿ��� ���� �� ����
	public void order(Robot.Command command) {
		//�����丵�غ���.
		if (command == Robot.Command.WALK) { //0�̾��µ� Extract Constrant ���� ������ �ٲ� / ���ȭ
			System.out.println(name + "walks");
		} else if (command == Robot.Command.STOP) {
			System.out.println(name + "stops");
		}  else {
			System.out.println(command + "is error");
		}
	}
	
	
}
