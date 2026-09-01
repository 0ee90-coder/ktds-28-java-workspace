package com.ktdsuniversity.edu.tmdb.pstr.vo;

import com.ktdsuniversity.edu.tmdb.mv.vo.MvVO;

public class PstrVO {

	private String pstrId;
	private String mvId;
	private String pstrUrl;
	
	// 하나의 포스터는 하나의 영화를 위한 것이다.
	private MvVO mvVO;

	public String getPstrId() {
		return pstrId;
	}

	public void setPstrId(String pstrId) {
		this.pstrId = pstrId;
	}

	public String getMvId() {
		return mvId;
	}

	public void setMvId(String mvId) {
		this.mvId = mvId;
	}

	public String getPstrUrl() {
		return pstrUrl;
	}

	public void setPstrUrl(String pstrUrl) {
		this.pstrUrl = pstrUrl;
	}

	public MvVO getMvVO() {
		return this.mvVO;
	}

	public void setMvVO(MvVO mvVO) {
		this.mvVO = mvVO;
	}

	@Override
	public String toString() {
		return "PstrVO [pstrId=" + pstrId + ", mvId=" + mvId + ", pstrUrl=" + pstrUrl + "]";
	}

}
