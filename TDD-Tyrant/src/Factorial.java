
public class Factorial {

	public int calc(int i) {
		// TODO Auto-generated method stub
//		return 1; //���� ������
		
//		if(i<2) 
//			return 1;
//		else 
//			return 2;
		//2���丮����� �ȴ�.
		
		if (i < 0)
			throw new RuntimeException();
		
		if(i < 2) 
			return 1;
//		else �̰� ��� �ȴ�. 
			return i * calc (i - 1);
	}

}
