
public class Order {

	public double getAmount() {
		// TODO Auto-generated method stub
		return 0;
	}
		
	private int numberOfLateDeliveries; //�������Ƚ��
	
	/*
	int getRating() {
		return (moreThanFiveRateDeliveries() ? 2 : 1);
	}

	private boolean moreThanFiveRateDeliveries() {
		// TODO Auto-generated method stub
		return numberOfLateDeliveries > 5;
	}
	*/ //ExtractMethod�� �ݴ�� Inline��
	//Alt + Shift + I
	int getRating() {
		return (numberOfLateDeliveries > 5 ? 2 : 1);
	}
	//inline�� �ϸ� �̷��� �޼ҵ尡 �����ǰ� �ڵ尡 ª������.
}
