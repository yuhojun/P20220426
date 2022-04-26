package co.micol.prj.listTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
public void setTest() {
	Set<String> name = new HashSet<String>();
	name.add("홍길동");
	name.add("박승리");
	name.add("이기자");
	name.remove("이기자");
	
	Iterator<String> iterator = name.iterator(); //집합안에 있는것들을 줄세운다
	while(iterator.hasNext()) {
		System.out.println(iterator.next()); //set 구조출력
	}
}
}
