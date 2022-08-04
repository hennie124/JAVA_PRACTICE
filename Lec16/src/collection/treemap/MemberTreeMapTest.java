package collection.treemap;

import collection.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		//memberId에 있는 정보가 고유한 번호이기 때문에 숫자를 바꾸면 오류가 남
		//memberId 번호를 바꿔도 출력하면 정렬해서 출력해준다.
		Member memberLim = new Member(101,"임창");
		Member memberLee = new Member(102,"이민");
		Member memberChae = new Member(103,"채형");
		
		memberTreeMap.addMember(memberLim);
		memberTreeMap.addMember(memberLee);
		memberTreeMap.addMember(memberChae);
		
		//memberTreeMap.removeMember(102);
		memberTreeMap.showAllMember();
		
	}

}
