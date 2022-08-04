package collection.hashmap;

import collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		//memberId에 있는 정보가 고유한 번호이기 때문에 숫자를 바꾸면 오류가 남
		Member memberLim = new Member(101,"임창");
		Member memberLee = new Member(102,"이민");
		Member memberChae = new Member(103,"채형");
		
		memberHashMap.addMember(memberLim);
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberChae);
		
		memberHashMap.removeMember(102);
		memberHashMap.showAllMember();
		
	}

}
