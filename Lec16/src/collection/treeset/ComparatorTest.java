package collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{

	@Override
	public int compare(String str1, String str2) {
		// TODO Auto-generated method stub
		return str1.compareTo(str2) * (-1);
	}
	
}
public class ComparatorTest {

	public static void main(String[] args) {
		
		//new MyCompare()를 작성하지 않으면 그대로 오름차순으로 정리되는데 
		//작성을 하면 위의 출력방식을 적용할 수 있음
	TreeSet<String> tree = new TreeSet<String>(new MyCompare());
		
		tree.add("aaa");
		tree.add("bbb");
		tree.add("ccc");
		
		System.out.println(tree);
	
	}

}
