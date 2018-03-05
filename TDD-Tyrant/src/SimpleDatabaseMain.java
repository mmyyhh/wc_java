import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;

//���� �÷��� ���� (Remove Control Flag)
//���� �÷��� ����� ���� �ڵ尡 ������ ���� ���, ���� �÷��׸� �����ϰ� break, continue, return�� �̿��ؼ� �ܼ�ȭ�Ѵ�.

public class SimpleDatabaseMain {
	public static void main(String[] args) {
		String filePath = "./src/dbfile.txt";
		SimpleDatabase db;
		try {
			db = new SimpleDatabase(new FileReader(filePath));

			Iterator<String> it = db.iterator();

			while(it.hasNext()) {
				String key = it.next();
				System.out.println("KEY : " + key);
				System.out.println("VALUE : " + db.getValue(key));
				System.out.println();
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
