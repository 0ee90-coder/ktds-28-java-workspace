package com.ktdsuniversity.edu.tmdb.mv.vo;

public class MvVO {
	
	private String mvId;
	private String ttl;
	private String mvRtng;
	private int rnngTm;
	private String rlsDt;
	private String smmr;
	private String mainPstrUrl;
	private String fbUrl;
	private String xUrl;
	private String instaUrl;
	private String tgln;
	private String orgnlTtl;
	private String plyng;
	private String orgnlLngg;
	private long bdgt;
	private long bxOffcRvn;
	
	
	public String getTtl() {
		return ttl;
	}

	public void setTtl(String ttl) {
		this.ttl = ttl;
	}

	public String getMvRtng() {
		return mvRtng;
	}

	public void setMvRtng(String mvRtng) {
		this.mvRtng = mvRtng;
	}

	public int getRnngTm() {
		return rnngTm;
	}

	public void setRnngTm(int rnngTm) {
		this.rnngTm = rnngTm;
	}

	public String getRlsDt() {
		return rlsDt;
	}

	public void setRlsDt(String rlsDt) {
		this.rlsDt = rlsDt;
	}

	public String getSmmr() {
		return smmr;
	}

	public void setSmmr(String smmr) {
		this.smmr = smmr;
	}

	public String getMainPstrUrl() {
		return mainPstrUrl;
	}

	public void setMainPstrUrl(String mainPstrUrl) {
		this.mainPstrUrl = mainPstrUrl;
	}

	public String getFbUrl() {
		return fbUrl;
	}

	public void setFbUrl(String fbUrl) {
		this.fbUrl = fbUrl;
	}

	public String getxUrl() {
		return xUrl;
	}

	public void setxUrl(String xUrl) {
		this.xUrl = xUrl;
	}

	public String getInstaUrl() {
		return instaUrl;
	}

	public void setInstaUrl(String instaUrl) {
		this.instaUrl = instaUrl;
	}

	public String getTgln() {
		return tgln;
	}

	public void setTgln(String tgln) {
		this.tgln = tgln;
	}

	public String getOrgnlTtl() {
		return orgnlTtl;
	}

	public void setOrgnlTtl(String orgnlTtl) {
		this.orgnlTtl = orgnlTtl;
	}

	public String getPlyng() {
		return plyng;
	}

	public void setPlyng(String plyng) {
		this.plyng = plyng;
	}

	public String getOrgnlLngg() {
		return orgnlLngg;
	}

	public void setOrgnlLngg(String orgnlLngg) {
		this.orgnlLngg = orgnlLngg;
	}

	public long getBdgt() {
		return bdgt;
	}

	public void setBdgt(long bdgt) {
		this.bdgt = bdgt;
	}

	public long getBxOffcRvn() {
		return bxOffcRvn;
	}

	public void setBxOffcRvn(long bxOffcRvn) {
		this.bxOffcRvn = bxOffcRvn;
	}

	public void setMvId(String mvId) {
		this.mvId = mvId;
	}

	public String getMvId() {
		return this.mvId;
	}

	@Override
	public String toString() {
		return "MvVO [mvId=" + mvId + ", ttl=" + ttl + ", mvRtng=" + mvRtng + ", rnngTm=" + rnngTm + ", rlsDt=" + rlsDt
				+ ", smmr=" + smmr + ", mainPstrUrl=" + mainPstrUrl + ", fbUrl=" + fbUrl + ", xUrl=" + xUrl
				+ ", instaUrl=" + instaUrl + ", tgln=" + tgln + ", orgnlTtl=" + orgnlTtl + ", plyng=" + plyng
				+ ", orgnlLngg=" + orgnlLngg + ", bdgt=" + bdgt + ", bxOffcRvn=" + bxOffcRvn + "]";
	}

}
