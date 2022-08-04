package collection;

import java.util.Comparator;

public class Member implements Comparable<Member> ,Comparator<Member> {

	private int memberId;
	private String memberName;
	
	public Member() {
		
	}
	
	public Member(int memberId,String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String toString() {
		return memberName + "회원님의 아이디는 "+memberId+"입니다.";
	}

	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			
			if(this.memberId == member.memberId) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}

	@Override
	public int compareTo(Member member) {
		
		// 내가 가지고 있는 memberId와 받아온 memberId를 비교해서 오름차순으로 출력
		return (this.memberId - member.memberId);
		
		//내림차순으로 출력하기
		//return (this.memberId - member.memberId)*(-1);
		
		//memberName으로 출력
		//return(this.memberName.compareTo(member.memberName));
		//return(this.memberName.compareTo(member.memberName)) * (-1);
	}

	@Override
	public int compare(Member member1, Member member2) {
		return (member1.memberId - member2.memberId);
	}
	
	
	
	
}
