package com.ktdsuniversity.edu.tmdb.flmmk.vo;

public class FlmmkVO {

	private String flmmkId;
	private String invlvdId;
	private String mvId;
	private String rl;
	private String prt;

	public String getFlmmkId() {
		return flmmkId;
	}

	public void setFlmmkId(String flmmkId) {
		this.flmmkId = flmmkId;
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

	@Override
	public String toString() {
		return "FlmmkVO [flmmkId=" + flmmkId + ", invlvdId=" + invlvdId + ", mvId=" + mvId + ", rl=" + rl + ", prt="
				+ prt + "]";
	}

}
