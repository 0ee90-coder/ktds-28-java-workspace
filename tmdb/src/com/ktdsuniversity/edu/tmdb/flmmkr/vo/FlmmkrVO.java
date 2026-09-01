package com.ktdsuniversity.edu.tmdb.flmmkr.vo;

import com.ktdsuniversity.edu.tmdb.invlvd.vo.InvlvdVO;
import com.ktdsuniversity.edu.tmdb.mv.vo.MvVO;

public class FlmmkrVO {

	private String flmmkrId;
	private String invlvdId;
	private String mvId;
	private String rl;
	private String prt;
	
	// 참여자 한명이 하나의 영화를 제작했다.
	private MvVO mvVO;
	
	// 제작자 한명에 대한 참여자 정보
	private InvlvdVO invlvdVO;

	public String getFlmmkId() {
		return flmmkrId;
	}

	public void setFlmmkId(String flmmkId) {
		this.flmmkrId = flmmkId;
	}

	public String getInvlvdId() {
		return invlvdId;
	}

	public void setInvlvdId(String invlvdId) {
		this.invlvdId = invlvdId;
	}

	public String getMvId() {
		return mvId;
	}

	public void setMvId(String mvId) {
		this.mvId = mvId;
	}

	public String getRl() {
		return rl;
	}

	public void setRl(String rl) {
		this.rl = rl;
	}

	public String getPrt() {
		return prt;
	}

	public void setPrt(String prt) {
		this.prt = prt;
	}

	public MvVO getMvVO() {
		return this.mvVO;
	}

	public void setMvVO(MvVO mvVO) {
		this.mvVO = mvVO;
	}

	public InvlvdVO getInvlvdVO() {
		return this.invlvdVO;
	}

	public void setInvlvdVO(InvlvdVO invlvdVO) {
		this.invlvdVO = invlvdVO;
	}

	@Override
	public String toString() {
		return "FlmmkrVO [flmmkrId=" + flmmkrId + ", invlvdId=" + invlvdId + ", mvId=" + mvId + ", rl=" + rl + ", prt="
				+ prt + "]";
	}

}
