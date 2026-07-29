package com.ktdsuniversity.edu.oop.interfaces;

public class System2 implements VipMemberService {

	@Override
	public void join() {
		System.out.println("VIP 회원가입~");
	}

	@Override
	public void login() {
		System.out.println("VIP 로그인~");
	}

	@Override
	public void deleteMe() {
		System.out.println("VIP 탈퇴~");
	}

	@Override
	public void logout() {
		System.out.println("VIP 로그아웃~");
	}

	@Override
	public void addPoint(int point) {
		System.out.println(point + "점 지급~");
	}

}
