
public class RobotMain {

	public static void main(String[] args) {
		Robot robot = new Robot("Android");
		
		//�з��ڵ带 Ŭ������ ġȯ�ϱ� ���� �ּ�ó��
//		robot.order(0);
//		robot.order(1);
//		robot.order(2);
//		robot.order(3);
//		robot.order(4);
		
		//Extract Constant ���� �˾ƺ��� �ξ� ����. ���ȭ
		robot.order(Robot.COMMAND_WALK);
		
		//���� ���س��� ��� �̿��� �͵��� ���ü��� �ִ�.
//		robot.order(100);
		
		//���� ������� ��� �ؾ� �ϴ°�?
		//������ ����� ���� �������?
		//1. �����ѹ��� ��ȣ����� ġȯ ("1000/1001" ��)
		//2. �з��ڵ带 Ŭ������ ġȯ
		
		//Robot.java�� RobotCommand�� ���� �з��ڵ带 Ŭ������ ġȯ�ϸ� ������ ��� �̿ܿ��� ����� �Ұ���������.
		
		//�������� ���߿� �˻��غ���
		robot.order(Robot.Command.JUMP);
		
		//3��8�� ���������� ¥���� ����
	}

}
