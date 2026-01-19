package com.kh.chap03_stream.part03_optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalMethod {

	public static void main(String[] args) {
		OptionalMethod om = new OptionalMethod();
//		om.test1();
		om.test2();
	}
	
	public void test1() {
		List<String> list = Arrays.asList("홍길동", "신사", null, "");
		list.stream().forEach(s -> System.out.println(s+" : "+getStringLength(s)));
	}
	
	public int getStringLength(String str) {
		Optional<String> maybeStr = Optional.ofNullable(str);
		
//		return maybeStr.map(s -> s.length()).orElse(0);
		return maybeStr.map(s -> s.length()).orElseThrow(()->new RuntimeException(str));
	}
	
	static class Order {
        Member member;
        int count;
        public Order() {
        }
        public Member getMember() {
            return member;
        }
        public void setMember(Member member) {
            this.member = member;
        }
        public int getCount() {
            return count;
        }
        public void setCount(int count) {
            this.count = count;
        }
        public Order(Member member, int count) {
            super();
            this.member = member;
            this.count = count;
        }
        @Override
        public String toString() {
            return "Order [member=" + member + ", count=" + count + "]";
        }
    }
    static class Member {
        String id;
        String email;
        public Member() {
        }
        public String getId() {
            return id;
        }
        public void setId(String id) {
            this.id = id;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public Member(String id, String email) {
            super();
            this.id = id;
            this.email = email;
        }
        @Override
        public String toString() {
            return "Member [id=" + id + ", email=" + email + "]";
        }
    }
	
	public void test2() {
		Member member = new Member();
		Order order = new Order();
		
		member.setEmail("taehwna422@gmail.com");
		order.setMember(member);
		
		System.out.println(getEmailOfMemberFromOrder(order));
		System.out.println(getEmailOfMemberFromOrder(null));
		System.out.println(getEmailOfMemberFromOrder(new Order()));
	}
	
	public String getEmailOfMemberFromOrder(Order order) {
		return Optional.ofNullable(order).map(o -> o.getMember()).map(m -> m.getEmail()).orElse("이메일이 존재하지 않습니다.");
	}
	

	
	
}
