package ArrayList;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		//String[] slist = new String[10];
		//ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list = new ArrayList();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		for(int i = 0; i < list.size();i++){
		//System.out.println(list.get(i))
			//Array 인덱스에서는 제공 안되어 출력이 안됨
		String s = (String)list.get(i);
		}


	}

}
