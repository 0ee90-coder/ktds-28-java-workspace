package com.ktdsuniversity.edu.tmdb.str.vo;

public class StrVO {

	private String strId;
	private String invlvdId;
	private String mvId;
	private String rlNm;

	public String getStrId() {
		return strId;
	}

	public void setStrId(String strId) {
		this.strId = strId;
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

	public String getRlNm() {
		return rlNm;
	}

	public void setRlNm(String rlNm) {
		this.rlNm = rlNm;
	}

	@Override
	public String toString() {
		return "StrVO [strId=" + strId + ", invlvdId=" + invlvdId + ", mvId=" + mvId + ", rlNm=" + rlNm + "]";
	}

}
