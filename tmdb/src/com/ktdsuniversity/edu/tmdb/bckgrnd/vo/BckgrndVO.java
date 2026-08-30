package com.ktdsuniversity.edu.tmdb.bckgrnd.vo;

public class BckgrndVO {

	private String bckgrndId;
	private String mvId;
	private String bckgrndUrl;

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

	@Override
	public String toString() {
		return "BckgrndVO [bckgrndId=" + bckgrndId + ", mvId=" + mvId + ", bckgrndUrl=" + bckgrndUrl + "]";
	}

}
