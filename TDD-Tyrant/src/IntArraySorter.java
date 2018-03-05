import java.util.Arrays;
import java.util.Random;

//어서션 도입 Introduce Assertion
//코드 속에 성립해야 할 조건이 있는 경우, 
//주석으로 "이런 조건을 만족해야 한다. (성립해야 한다)"
//라고 남기지 말고 어셔선을 도입해라.

//정수배열을 정렬하는 코드
public class IntArraySorter {
	private final int[] datas;
	private int iData;

	public IntArraySorter(int[] data, int i){
		//this.datas = data; //배열은 주소를 전달하기 때문에 저러면 안된다.
		this.datas = new int[data.length];
		this.iData = i;
		System.arraycopy(data, 0, datas, 0, data.length); //임시배열을 만들고 옮겨야 한다.
	}

	//자료구조 공부좀 해야겠당...
	public void sort() {
		for (int x = 0; x < datas.length - 1 ; x++) {
			int m = x;

			//여기서부터
			for (int y = x +1 ; y < datas.length; y++) {
				if (datas[m] > datas[y]) {
					m = y;
				}
			}
			//여기까지 주석처리하면 오작동할 것이다.

			//여기서 검증하자.
			assert isMin(m, x, datas.length - 1) : this + ", x = " + x;

			//"여기에서 datas[m]는 datas[x] ~ datas[datas.length - 1]의 최소값이어야 한다."
			//이게 주석으로서 도움이 될까?
			int v = datas[m];
			datas[m] = datas[x];
			datas[x] = v;
			//"여기에서 datas[0] ~ datas[x+1]은 이미 정렬되어 있어야 한다."
			//이게 주석으로서 도움이 될까?
			//어셔션 도입 방식으로 리팩토링 해보자.

			//여기서 검증하자.
			assert isSorted(0, x+1);
		}
	}

	//다시 만들어보자
	//"여기에서 datas[m]는 datas[x] ~ datas[datas.length - 1]의 최소값이어야 한다."
	private boolean isMin(int pos, int start, int end) {
		for (int i = start; i <= end; i++) {
			if (this.datas[pos] > this.datas[i]) 
				return false;
		}
		return true;
	}


	//"여기에서 datas[0] ~ datas[x+1]은 이미 정렬되어 있어야 한다."
	private boolean isSorted(int start, int end) {
		for (int i = start; i < end; i++) {
			if (this.datas[i] > this.datas[i+1])
				return false;
		}
		return true;
	}

	public String toString() { //정렬 api
		return Arrays.toString(this.datas) + ", i = " + this.iData;
	}
}

//debug configration -> VM argument에 -ea 넣으면 된다.
//assert 표현식; => 표현식의 결과가 false 이면 java.lang.assertionError 예외 발생
//assert 표현식 : 옵션; => print됨
