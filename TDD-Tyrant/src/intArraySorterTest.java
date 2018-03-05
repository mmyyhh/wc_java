import java.util.Random;

public class intArraySorterTest { //Ctrl Shift O : import
	private static final Random ran = new Random(1234);
	
	private static void execute(int length) {
		//length 길이의 배열을 생성하고 난수로 데이터를 작성
		int[] data = new int[length];
		for (int i = 0; i < length; i++) {
			data[i] = ran.nextInt(data.length);
		}
		
		int ii = 999;
		
		//데이터를 출력
		IntArraySorter sorter = new IntArraySorter(data, ii);
		System.out.println("정렬전 : " + sorter);
		
		ii = 888;
		//이걸 넣는다면?
		data[1] = 100;
		data[2] = 200;
		
		System.out.println("정렬전 : " + sorter);
		//이걸 넣는다면? END
		
		//정렬 결과를 출력
		sorter.sort();
		System.out.println("정렬후 : " + sorter);
		System.out.println();
	}
	
	public static void main(String[] args) {
		execute(10);
		execute(10);
		execute(10);
		execute(10);
		execute(10);
		
	}
}
