package com.ktdsuniversity.edu.tmdb.mvkwrd.vo;

public class MvKwrdVO {

	private String mvKwrdId;
	private String mvId;
	private String kwrdId;

	public String getMvKwrdId() {
		return mvKwrdId;
	}

	public void setMvKwrdId(String mvKwrdId) {
		this.mvKwrdId = mvKwrdId;
	}

	public String getMvId() {
		return mvId;
	}

	public void setMvId(String mvId) {
		this.mvId = mvId;
	}

	public String getKwrdId() {
		return kwrdId;
	}

	public void setKwrdId(String kwrdId) {
		this.kwrdId = kwrdId;
	}

	@Override
	public String toString() {
		return "MvKwrdVO [mvKwrdId=" + mvKwrdId + ", mvId=" + mvId + ", kwrdId=" + kwrdId + "]";
	}

}
