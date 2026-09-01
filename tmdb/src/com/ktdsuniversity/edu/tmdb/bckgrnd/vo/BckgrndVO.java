package com.ktdsuniversity.edu.tmdb.bckgrnd.vo;

import com.ktdsuniversity.edu.tmdb.mv.vo.MvVO;

public class BckgrndVO {

	private String bckgrndId;
	private String mvId;
	private String bckgrndUrl;
	
	// 하나의 배경은 하나의 영화를 위한 것이다.
	private MvVO mvVO;

	public String getBckgrndId() {
		return bckgrndId;
	}

	public void setBckgrndId(String bckgrndId) {
		this.bckgrndId = bckgrndId;
	}

	public String getMvId() {
		return mvId;
	}

	public void setMvId(String mvId) {
		this.mvId = mvId;
	}

	public String getBckgrndUrl() {
		return bckgrndUrl;
	}

	public void setBckgrndUrl(String bckgrndUrl) {
		this.bckgrndUrl = bckgrndUrl;
	}

	public MvVO getMvVO() {
		return this.mvVO;
	}

	public void setMvVO(MvVO mvVO) {
		this.mvVO = mvVO;
	}

	@Override
	public String toString() {
		return "BckgrndVO [bckgrndId=" + bckgrndId + ", mvId=" + mvId + ", bckgrndUrl=" + bckgrndUrl + "]";
	}

}
