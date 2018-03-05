import java.util.Random;

public class intArraySorterTest { //Ctrl Shift O : import
	private static final Random ran = new Random(1234);
	
	private static void execute(int length) {
		//length ������ �迭�� �����ϰ� ������ �����͸� �ۼ�
		int[] data = new int[length];
		for (int i = 0; i < length; i++) {
			data[i] = ran.nextInt(data.length);
		}
		
		int ii = 999;
		
		//�����͸� ���
		IntArraySorter sorter = new IntArraySorter(data, ii);
		System.out.println("������ : " + sorter);
		
		ii = 888;
		//�̰� �ִ´ٸ�?
		data[1] = 100;
		data[2] = 200;
		
		System.out.println("������ : " + sorter);
		//�̰� �ִ´ٸ�? END
		
		//���� ����� ���
		sorter.sort();
		System.out.println("������ : " + sorter);
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
