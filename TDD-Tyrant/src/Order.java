
public class Order {

	public double getAmount() {
		// TODO Auto-generated method stub
		return 0;
	}
		
	private int numberOfLateDeliveries; //지연배송횟수
	
	/*
	int getRating() {
		return (moreThanFiveRateDeliveries() ? 2 : 1);
	}

	private boolean moreThanFiveRateDeliveries() {
		// TODO Auto-generated method stub
		return numberOfLateDeliveries > 5;
	}
	*/ //ExtractMethod의 반대는 Inline임
	//Alt + Shift + I
	int getRating() {
		return (numberOfLateDeliveries > 5 ? 2 : 1);
	}
	//inline을 하면 이렇게 메소드가 삭제되고 코드가 짧아진다.
}
