import java.util.Enumeration;
//�����丵 ��� - �޼ҵ�� �̴°� ���� ���� �Ѵ�. :: �޼ҵ� ������
//Alt + Shift + N

public class ExtractMethod {
	private String name;
	private Orders orders;
	
	void printOwing() {
		printBanner();
		//�� �������� �������� �������� ������� ��� ���� �޼ҵ�� �̾Ƴ� �� �ִ�.

/*		
		double outstanding = getOutstanding();
		printDetail(outstanding);
*/		
		printDetail(getOutstanding());
		//���� �Ұ� �ƴϸ� ���ҽ��� �̷��� Inline �ص� ������.

	}

	private double getOutstanding() {
		Enumeration order = orders.elements();
		double outstanding = 0.0;
		
		//�������� ���� ���� �־���.
		
		//�ܻ�� ���
		while(order.hasMoreElements()) {
			Order each = (Order)orders.nextElement();
			outstanding += each.getAmount();
		}
		return outstanding;
	}

	//�߿����� ���� ������ �ڵ������ ������ �� �ִ�. �׷��Ƿ� �帧�� ������ �ľ��� �� �ִ�.
	private void printDetail(double outstanding) {
		//���γ��� ��� <- Extract Method�� ���� �� �ּ��� ����� �ִ�.
		System.out.println("���� : " + name);
		System.out.println("�ܻ�� : " + outstanding);
	}

	private void printBanner() {
		//��� ��� <- Extract Method�� ���� �� �ּ��� ����� �ִ�.
		System.out.println("****************");
		System.out.println("*** �� �ܻ� ***");
		System.out.println("****************");
	}
}
