package co.micol.prj.listTest;

import java.util.HashMap;
import java.util.Map;

import co.micol.prj.dto.StudentVO;

public class MapTest {
	public void mapTest() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "ȫ�浿");
		map.put("address", "�뱸������");
		
		System.out.println(map.get("name"));//������ Ŷ�� (get)���ָ��
		System.out.println(map.get("address"));
	}
	
	public void studentMap() {
		Map<Integer,StudentVO> map = new HashMap<Integer, StudentVO>();
		map.put(1,new StudentVO("ȫ�浿"));
		map.put(2,new StudentVO("�ڽ¸�"));
		
		System.out.println(map.get(1));
	}
}
