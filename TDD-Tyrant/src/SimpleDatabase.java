import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//dbfile.txt ������ ������ �о �ʿ� ����
//�����ּ�=�̸� 
public class SimpleDatabase {

	private Map<String, String> map = new HashMap<String, String>();
	private static Pattern dataPattern = Pattern.compile("([^=]+)=(.*)");
	/*
	 * (			group(1)
	 * 		[^=]+	"="�� ������ ���ڰ� 1�� �̻� �ݺ�
	 * 	)
	 * =
	 * (
	 * 		.*		������ ���ڰ� 0�� �̻� �ݺ�
	 * )
	 */
	

	//refactor - rename alt+shift+r => r1, r2 s1, s2 �̷��ͺ��� �ǹ̸� ��Ƽ� ��������. rename ����ϸ� ����.
	public SimpleDatabase(Reader reader) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(reader);
		//		boolean reading = false;
		String line;
		while (true) { //��� while �ϴٰ� �� ������ break�� ����������
			line = bufferedReader.readLine();
			if(line == null) break;
			//������ �̷��� ����� �������� �ü��� �ټ���...

			//���Խ����� �ٽ� ������
			Matcher matcher = dataPattern.matcher(line);
			if(matcher.matches()) {
				String key = matcher.group(1);
				String value = matcher.group(2);
				map.put(key, value);
			}
			/*
			int equalIndex = line.indexOf("=");
			if (equalIndex > 0){
				String key = line.substring(0, equalIndex);
				String value = line.substring(equalIndex+1);
				map.put(key, value);
			} */ //�Ʒ��ҽ��� ����ó�� ����� �ҽ��� ������ �پ���.
			
			/*
			boolean scanningKey = true;
			StringBuffer keyBuffer = new StringBuffer();
			StringBuffer valueBuffer = new StringBuffer();
			for(int i = 0; i < line.length(); i++ ) {
				char c = line.charAt(i);
				if (scanningKey) {
					if (c == '=') {
						scanningKey = false;
					} else {
						keyBuffer.append(c);//�̸��� ��
					}
				} else {
					valueBuffer.append(c); //�̸� ��
				}
			}
			String key = keyBuffer.toString();
			String value = valueBuffer.toString();
			map.put(key, value);*/
		}

	}


	//���� flag ��ġ����
	/*
	public SimpleDatabase(Reader reader) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(reader);
		boolean reading = false;
		String line;
		while (!reading) {
			line = bufferedReader.readLine();
			if(line == null) {
				reading = true;
			} else {
				boolean scanningKey = true;
				StringBuffer keyBuffer = new StringBuffer();
				StringBuffer valueBuffer = new StringBuffer();
				for(int i = 0; i < line.length(); i++ ) {
					char c = line.charAt(i);
					if (scanningKey) {
						if (c == '=') {
							scanningKey = false;
						} else {
							keyBuffer.append(c);//�̸��� ��
						}
					} else {
						valueBuffer.append(c); //�̸� ��
					}
				}
				String key = keyBuffer.toString();
				String value = valueBuffer.toString();
				map.put(key, value);
			}
		}
	}
	 */

	public Iterator<String> iterator() {
		return map.keySet().iterator();
	}

	public String getValue(String key) {
		return map.get(key);
	}

}
