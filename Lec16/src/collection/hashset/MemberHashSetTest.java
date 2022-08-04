package collection.hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLim = new Member(101,"임창");
		Member memberLee = new Member(102,"이민");
		Member memberChae = new Member(103,"채형");
		
		memberHashSet.addMember(memberLim);
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberChae);
		
		memberHashSet.showAll();
		
		Member memberLee2 = new Member(101,"이주");
		memberHashSet.addMember(memberLee2);
		memberHashSet.showAll();
		
	}
}
