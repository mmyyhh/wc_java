import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

	public static int add(String number) {
		//공백방어 시작
		number = number.trim();
		if("".equals(number)) {
			return 0;
		}
		//공백방어 끝
/*		String[] numbers = number.split(",");	*/
		
		//백슬래시n도 허용하려면 정규식을 활용
/*		String[] numbers = number.split(",|\n");	*/
		
		//다양한 구분문자 허용
		String delimeter = ",|\n";
		String numberWithoutDelimeter = number;
		if (number.startsWith("//")) {
			delimeter = number.substring(2, number.indexOf("\n"));
			numberWithoutDelimeter = number.substring(number.indexOf("\n") + 1);
		}
		String[] numbers = numberWithoutDelimeter.split(delimeter);
		
		//음수시 예외
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
			throw new RuntimeException("에러임"+negativeNumbers.toString());
		}
		return sum;
	}

}
