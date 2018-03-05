import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

	public static int add(String number) {
		//������ ����
		number = number.trim();
		if("".equals(number)) {
			return 0;
		}
		//������ ��
/*		String[] numbers = number.split(",");	*/
		
		//�齽����n�� ����Ϸ��� ���Խ��� Ȱ��
/*		String[] numbers = number.split(",|\n");	*/
		
		//�پ��� ���й��� ���
		String delimeter = ",|\n";
		String numberWithoutDelimeter = number;
		if (number.startsWith("//")) {
			delimeter = number.substring(2, number.indexOf("\n"));
			numberWithoutDelimeter = number.substring(number.indexOf("\n") + 1);
		}
		String[] numbers = numberWithoutDelimeter.split(delimeter);
		
		//������ ����
		List negativeNumbers = new ArrayList();
		
		int sum = 0;
		for(String no : numbers) {
			int i = Integer.parseInt(no);
			if(i < 0) {
				negativeNumbers.add(i);
			} 
			
			if( i < 1000)
				sum += i;
		}
		if (negativeNumbers.size() > 0) {
			throw new RuntimeException("������"+negativeNumbers.toString());
		}
		return sum;
	}

}
