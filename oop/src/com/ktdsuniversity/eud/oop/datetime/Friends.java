package com.ktdsuniversity.eud.oop.datetime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Friends {
	
	private List<Friend> friendList;

	public Friends() {
		this.friendList = new ArrayList<>();
	}

	public void addFriend(Friend friend) {
		this.friendList.add(friend);
	}

	public Friend get(int index) {
		if (index >= this.friendList.size() && index < 0) {
			return null;
		}
		return this.friendList.get(index);
	}

	/**
	 * 생일이 다가오거나, 생일이거나, 생일이 지난 친구 찾아 반환
	 * @param days 범위
	 * @return 
	 */
	public List<Friend> findFriendsBy(int days) {
		List<Friend> foundFriends = new ArrayList<>();
		
		// 오늘 날짜에서 3일 이전의 날짜를 구한다.

		// 오늘 날짜에서 3일 이후의 날짜를 구한다.		
		
		// 친구들의 생일 날짜에서 연도만 현재로 바꾼다.
		
		// 친구들의 생일이 오늘의 3일 이전날짜보다 이후이면서 오늘보다 이전이면 foundFriends에 추가.
		
		// 친구들의 생일이 오늘의 3일 이후날짜보다 이전이면서 오늘보다 이후이면 foundFriends에 추가.
		
		// 친구들의 생일이 오늘과 같으면 foundFriends에 추가한다.
		
		
		return foundFriends;
	}

	// 오늘 날짜에서 3일 이전의 날짜를 구한다.
	public static void minusDays() {
		LocalDate now = LocalDate.now();
		LocalDate past = now.plusDays(-3);
		System.out.println("3일 전: "+ past);
	}
	
	// 오늘 날짜에서 3일 이후의 날짜를 구한다.		
	public static void plusDays() {
		LocalDate now = LocalDate.now();
		LocalDate future = now.plusDays(3);
		System.out.println("3일 후:" + future);
	}
	
	// 친구들의 생일 날짜에서 연도만 현재로 바꾼다.
	public static void changeYear() {
		LocalDate now = LocalDate.now();
			
			now = now.withYear(2026);
			System.out.println(now);
	}
	
	

	@Override
	public String toString() {
		return "Friends [friendList=" + friendList + "]";
	}


}
