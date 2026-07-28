package com.ktdsuniversity.eud.oop.interfaces;

public class System1 implements MemberService{

	@Override
	public void join() {
		System.out.println("회원가입을 하세요");
			
	}

	@Override
	public void login() {
		System.out.println("로그인을 하세요");
			
	}

	@Override
	public void deleteMe() {
		System.out.println("회원탈퇴를 하세요");
			
	}

	@Override
	public void logout() {
		System.out.println("로그아웃을 하세요");
			
	}

}
