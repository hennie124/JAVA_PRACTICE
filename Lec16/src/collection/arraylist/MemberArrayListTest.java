package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLim = new Member(101,"임창");
		Member memberLee = new Member(102,"이민");
		Member memberChae = new Member(103,"채형");
		
		memberArrayList.addMember(memberLim);
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberChae);
		
		memberArrayList.showAll();
		memberArrayList.removeMember(memberLee.getMemberId());
		//memberArrayList.showAll();
		
	}

}
