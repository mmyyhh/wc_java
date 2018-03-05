import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;

//제어 플래그 삭제 (Remove Control Flag)
//제어 플래그 사용이 많아 코드가 복잡해 지는 경우, 제어 플래그를 삭제하고 break, continue, return을 이용해서 단순화한다.

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
