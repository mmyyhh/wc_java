import java.util.Arrays;
import java.util.Random;

//��� ���� Introduce Assertion
//�ڵ� �ӿ� �����ؾ� �� ������ �ִ� ���, 
//�ּ����� "�̷� ������ �����ؾ� �Ѵ�. (�����ؾ� �Ѵ�)"
//��� ������ ���� ��ż��� �����ض�.

//�����迭�� �����ϴ� �ڵ�
public class IntArraySorter {
	private final int[] datas;
	private int iData;

	public IntArraySorter(int[] data, int i){
		//this.datas = data; //�迭�� �ּҸ� �����ϱ� ������ ������ �ȵȴ�.
		this.datas = new int[data.length];
		this.iData = i;
		System.arraycopy(data, 0, datas, 0, data.length); //�ӽù迭�� ����� �Űܾ� �Ѵ�.
	}

	//�ڷᱸ�� ������ �ؾ߰ڴ�...
	public void sort() {
		for (int x = 0; x < datas.length - 1 ; x++) {
			int m = x;

			//���⼭����
			for (int y = x +1 ; y < datas.length; y++) {
				if (datas[m] > datas[y]) {
					m = y;
				}
			}
			//������� �ּ�ó���ϸ� ���۵��� ���̴�.

			//���⼭ ��������.
			assert isMin(m, x, datas.length - 1) : this + ", x = " + x;

			//"���⿡�� datas[m]�� datas[x] ~ datas[datas.length - 1]�� �ּҰ��̾�� �Ѵ�."
			//�̰� �ּ����μ� ������ �ɱ�?
			int v = datas[m];
			datas[m] = datas[x];
			datas[x] = v;
			//"���⿡�� datas[0] ~ datas[x+1]�� �̹� ���ĵǾ� �־�� �Ѵ�."
			//�̰� �ּ����μ� ������ �ɱ�?
			//��ż� ���� ������� �����丵 �غ���.

			//���⼭ ��������.
			assert isSorted(0, x+1);
		}
	}

	//�ٽ� ������
	//"���⿡�� datas[m]�� datas[x] ~ datas[datas.length - 1]�� �ּҰ��̾�� �Ѵ�."
	private boolean isMin(int pos, int start, int end) {
		for (int i = start; i <= end; i++) {
			if (this.datas[pos] > this.datas[i]) 
				return false;
		}
		return true;
	}


	//"���⿡�� datas[0] ~ datas[x+1]�� �̹� ���ĵǾ� �־�� �Ѵ�."
	private boolean isSorted(int start, int end) {
		for (int i = start; i < end; i++) {
			if (this.datas[i] > this.datas[i+1])
				return false;
		}
		return true;
	}

	public String toString() { //���� api
		return Arrays.toString(this.datas) + ", i = " + this.iData;
	}
}

//debug configration -> VM argument�� -ea ������ �ȴ�.
//assert ǥ����; => ǥ������ ����� false �̸� java.lang.assertionError ���� �߻�
//assert ǥ���� : �ɼ�; => print��
