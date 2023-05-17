package com.yedam.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servelf/Jsp");
		set.add("Java");
		set.add("iBatis");
		
		//size
		int size = set.size();
		System.out.println("총 객체 수 : " + size);
		
		//반복자 를 활용한 HashSet 객체 출력
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {//hasnext 다음의 데이터가 있냐 t/f
			String element = iterator.next();
			System.out.println("\t" +element);
		}
		
		set.remove("Java");
		set.remove("JDBC");
		
		System.out.println("========향상된 for문========");
		
		for(String temp : set) {
			System.out.println("\t" + temp);
		}
		
		set.clear();
		System.out.println("총 객체 수 : " + set.size());
		
		if(set.isEmpty()) {
			System.out.println("객체가 하나도 업습니다.");
		}
		
		Set<Member> mSet = new HashSet<>();
		
		mSet.add(new Member("고길동", 26));
		mSet.add(new Member("고길동", 26));
		
		System.out.println("총 객체 수 :" + mSet.size());
		
		
		
	}

}
