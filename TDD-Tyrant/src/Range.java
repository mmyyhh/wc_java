
public class Range {
	int begin;
	int end;
	
	public Range(int begin, int end) {
		this.begin = begin;
		this.end = end;
	}

	boolean overlapsWidth(Range r) {
//		return (begin >= r.begin && begin <= r.end) || (end >= r.begin && end <= r.end);
//		[0,2)�� [2,4)�� ��ġ�� ������ ���
		
//		begin/end�� r�� ������ ���ԵǴ� ��찡 ������ ����
//		return (begin >= r.begin && begin < r.end) || (end > r.begin && end <= r.end);
		
		//�̰͵� ������
//		return (begin >= r.begin && begin < r.end) || (end > r.begin && end <= r.end) || (begin <= r.begin && end >= r.end);
		
		if(r.end <= begin) return false;
		if(r.begin >= end) return false;
		return true;
	}
	
	public static void main (String[] args) {
		Range a = new Range(1, 3); //3 ������
		Range b = new Range(3, 6); //6 ������
		Range c = new Range(6, 8); 
		Range d = new Range(2, 8); 
		
		System.out.println(a.overlapsWidth(b)); //f
		System.out.println(a.overlapsWidth(c)); //f
		System.out.println(a.overlapsWidth(d)); //t
		System.out.println();
		
		System.out.println(b.overlapsWidth(b)); //f
		System.out.println(b.overlapsWidth(c)); //f
		System.out.println(b.overlapsWidth(d)); //t
		System.out.println();
		
		System.out.println(c.overlapsWidth(a)); //f
		System.out.println(c.overlapsWidth(b)); //f
		System.out.println(c.overlapsWidth(d)); //t
		System.out.println();
		
		System.out.println(d.overlapsWidth(a)); //t
		System.out.println(d.overlapsWidth(b)); //t
		System.out.println(d.overlapsWidth(c)); //t
		System.out.println();
	}
}	
