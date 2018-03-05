import java.util.Enumeration;
//리팩토링 기법 - 메소드로 뽑는걸 제일 많이 한다. :: 메소드 추출기법
//Alt + Shift + N

public class ExtractMethod {
	private String name;
	private Orders orders;
	
	void printOwing() {
		printBanner();
		//이 배너출력을 위쪽으로 빼버리면 선언부터 모든 것을 메소드로 뽑아낼 수 있다.

/*		
		double outstanding = getOutstanding();
		printDetail(outstanding);
*/		
		printDetail(getOutstanding());
		//재사용 할거 아니면 윗소스를 이렇게 Inline 해도 괜찮다.

	}

	private double getOutstanding() {
		Enumeration order = orders.elements();
		double outstanding = 0.0;
		
		//배너출력은 원래 여기 있었다.
		
		//외상액 계산
		while(order.hasMoreElements()) {
			Order each = (Order)orders.nextElement();
			outstanding += each.getAmount();
		}
		return outstanding;
	}

	//중요하지 않은 내용을 코드블럭에서 빼버릴 수 있다. 그러므로 흐름을 빠르게 파악할 수 있다.
	private void printDetail(double outstanding) {
		//세부내역 출력 <- Extract Method를 통해 이 주석을 지울수 있다.
		System.out.println("고객명 : " + name);
		System.out.println("외상액 : " + outstanding);
	}

	private void printBanner() {
		//배너 출력 <- Extract Method를 통해 이 주석을 지울수 있다.
		System.out.println("****************");
		System.out.println("*** 고객 외상 ***");
		System.out.println("****************");
	}
}
