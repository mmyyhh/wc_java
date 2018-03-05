
public class Factorial {

	public int calc(int i) {
		// TODO Auto-generated method stub
//		return 1; //이제 만들어보자
		
//		if(i<2) 
//			return 1;
//		else 
//			return 2;
		//2팩토리얼까진 된다.
		
		if (i < 0)
			throw new RuntimeException();
		
		if(i < 2) 
			return 1;
//		else 이건 없어도 된다. 
			return i * calc (i - 1);
	}

}
