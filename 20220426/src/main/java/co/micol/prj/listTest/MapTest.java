package co.micol.prj.listTest;

import java.util.HashMap;
import java.util.Map;

import co.micol.prj.dto.StudentVO;

public class MapTest {
	public void mapTest() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "È«±æµ¿");
		map.put("address", "´ë±¸±¤¿ª½Ã");
		
		System.out.println(map.get("name"));//º¸³¾¶§ Å¶°ª (get)¸¸ÁÖ¸éµÊ
		System.out.println(map.get("address"));
	}
	
	public void studentMap() {
		Map<Integer,StudentVO> map = new HashMap<Integer, StudentVO>();
		map.put(1,new StudentVO("È«±æµ¿"));
		map.put(2,new StudentVO("¹Ú½Â¸®"));
		
		System.out.println(map.get(1));
	}
}
