package co.micol.prj.listTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
public void setTest() {
	Set<String> name = new HashSet<String>();
	name.add("ȫ�浿");
	name.add("�ڽ¸�");
	name.add("�̱���");
	name.remove("�̱���");
	
	Iterator<String> iterator = name.iterator(); //���վȿ� �ִ°͵��� �ټ����
	while(iterator.hasNext()) {
		System.out.println(iterator.next()); //set �������
	}
}
}
