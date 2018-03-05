import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//dbfile.txt 파일의 내용을 읽어서 맵에 저장
//메일주소=이름 
public class SimpleDatabase {

	private Map<String, String> map = new HashMap<String, String>();
	private static Pattern dataPattern = Pattern.compile("([^=]+)=(.*)");
	/*
	 * (			group(1)
	 * 		[^=]+	"="를 제외한 문자가 1개 이상 반복
	 * 	)
	 * =
	 * (
	 * 		.*		임의의 문자가 0개 이상 반복
	 * )
	 */
	

	//refactor - rename alt+shift+r => r1, r2 s1, s2 이런것보단 의미를 담아서 개발하자. rename 사용하면 좋다.
	public SimpleDatabase(Reader reader) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(reader);
		//		boolean reading = false;
		String line;
		while (true) { //계속 while 하다가 다 읽으면 break로 빠져나가기
			line = bufferedReader.readLine();
			if(line == null) break;
			//한줄은 이렇게 만들면 가독성이 늘수도 줄수도...

			//정규식으로 다시 만들어보기
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
			} */ //아래소스를 위에처럼 만들면 소스가 굉장히 줄어든다.
			
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
						keyBuffer.append(c);//이메일 들어감
					}
				} else {
					valueBuffer.append(c); //이름 들어감
				}
			}
			String key = keyBuffer.toString();
			String value = valueBuffer.toString();
			map.put(key, value);*/
		}

	}


	//제어 flag 고치기전
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
							keyBuffer.append(c);//이메일 들어감
						}
					} else {
						valueBuffer.append(c); //이름 들어감
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
