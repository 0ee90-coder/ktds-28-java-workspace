package com.ktdsuniversity.edu.tmdb;

import java.util.List;

import com.ktdsuniversity.edu.tmdb.bckgrnd.vo.BckgrndVO;
import com.ktdsuniversity.edu.tmdb.common.utils.DBConnector;
import com.ktdsuniversity.edu.tmdb.flmmkr.vo.FlmmkrVO;
import com.ktdsuniversity.edu.tmdb.gnr.vo.GnrVO;
import com.ktdsuniversity.edu.tmdb.invlvd.vo.InvlvdVO;
import com.ktdsuniversity.edu.tmdb.kwrd.vo.KwrdVO;
import com.ktdsuniversity.edu.tmdb.mv.vo.MvVO;
import com.ktdsuniversity.edu.tmdb.pstr.vo.PstrVO;
import com.ktdsuniversity.edu.tmdb.str.vo.StrVO;
import com.ktdsuniversity.edu.tmdb.vd.vo.VdVO;

public class MovieInfo {

	private DBConnector connector;
	
	public MovieInfo() {
		this.connector = DBConnector.builder()
									.setDriverClassName("oracle.jdbc.driver.OracleDriver")
									.setUrl("jdbc:oracle:thin:@localhost:1521:XE")
									.setSchemaName("TMDB")
									.setPassword("TMDB")
									.connect();
	}
	
	public MvVO selectMovie(String mvId){
		
		StringBuffer query = new StringBuffer();
		query.append(" SELECT MV_ID                                     ");
		query.append("      , TTL                                       ");
		query.append("      , MV_RTNG                                   ");
		query.append("      , RNNG_TM                                   ");
		query.append("      , TO_CHAR(RLS_DT, 'YYYY-MM-DD') AS RLS_DT   ");
		query.append("      , SMMR                                      ");
		query.append("      , MAIN_PSTR_URL                             ");
		query.append("      , FB_URL                                    ");
		query.append("      , X_URL                                     ");
		query.append("      , INSTA_URL                                 ");
		query.append("      , TGLN                                      ");
		query.append("      , ORGNL_TTL                                 ");
		query.append("      , PLYNG                                     ");
		query.append("      , ORGNL_LNGG                                ");
		query.append("      , BDGT                                      ");
		query.append("      , BX_OFFC_RVN                               ");
		query.append("   FROM MV                                        ");
		query.append("  WHERE DEL_YN = 'N'                              ");
		query.append("    AND MV_ID = ?                                 ");
		
		return connector.selectBuilder(MvVO.class, query)
						.setParams(pstmt -> pstmt.setString(1, mvId))
						.selectOne();
	}		
	
	public void setGenres(MvVO movie) {
		StringBuffer query = new StringBuffer();
		query.append(" SELECT G.GNR_ID             ");
		query.append("      , G.NM                 ");
		query.append("   FROM GNR G                ");
		query.append("  INNER JOIN MV_GNR MG       ");
		query.append("     ON G.GNR_ID = MG.GNR_ID ");
		query.append("  WHERE MG.MV_ID = ?         ");
		
		List<GnrVO> genres = this.connector.selectBuilder(GnrVO.class, query)
					  			 		   .setParams(pstmt -> pstmt.setString(1, movie.getMvId()))
					                       .selectList();
		movie.setGnrList(genres);
	}
	
	public void setKeywords(MvVO movie) {
		StringBuffer query = new StringBuffer();
		query.append("SELECT K.KWRD_ID              ");
	    query.append("	 , K.KWRD_NM                ");
	    query.append("  FROM KWRD K                 ");
	    query.append(" INNER JOIN MV_KWRD MK        ");
	    query.append("    ON K.KWRD_ID = MK.KWRD_ID ");
	    query.append(" WHERE MK.KWRD_ID = ?	        ");
	    
	    List<KwrdVO> kwrds = this.connector.selectBuilder(KwrdVO.class, query)
		 		   							.setParams(pstmt -> pstmt.setString(1, movie.getMvId()))
		 		   							.selectList();
	    movie.setKwrdList(kwrds);
	}                                               
	
	public void setVideos(MvVO movie) {
		StringBuffer query = new StringBuffer();
		query.append(" SELECT V.VD_ID            ");
	    query.append("      , V.MV_ID            ");
	    query.append("      , V.VD_URL           ");
	    query.append("   FROM VD V               ");
	    query.append("  INNER JOIN MV M          ");
	    query.append("     ON V.MV_ID = M.MV_ID  ");
	    query.append("  WHERE M.MV_ID = ?        ");
	    
	    List<VdVO> vds = this.connector.selectBuilder(VdVO.class, query)
							 		   .setParams(pstmt -> pstmt.setString(1, movie.getMvId()))
							 		   .selectList();
	    movie.setVdList(vds);
	}
	
	public void setBackGrounds(MvVO movie) {
		StringBuffer query = new StringBuffer();
		query.append("SELECT BG.BCKGRND_ID     ");
	    query.append("	   , BG.MV_ID          ");
	    query.append("	   , BG.BCKGRND_URL    ");
	    query.append("  FROM BCKGRND BG        ");
	    query.append(" INNER JOIN MV M         ");
	    query.append("    ON M.MV_ID = BG.MV_ID");
	    query.append(" WHERE M.MV_ID = ?       ");
	    
	    List<BckgrndVO> bckgrnds = this.connector.selectBuilder(BckgrndVO.class, query)
		 		   .setParams(pstmt -> pstmt.setString(1, movie.getMvId()))
		 		   .selectList();
	    movie.setBckgrndList(bckgrnds);
		
	}
	
	public void setPosters(MvVO movie) {
		StringBuffer query = new StringBuffer();
		query.append("SELECT P.PSTR_ID        ");
	    query.append("     , P.MV_ID          ");
	    query.append("     , P.PSTR_URL       ");
	    query.append("  FROM PSTR P           ");
	    query.append(" INNER JOIN MV M        ");
	    query.append("    ON M.MV_ID = P.MV_ID");
	    query.append(" WHERE M.MV_ID = :   ?  ");
	    
	    List<PstrVO> pstrs = this.connector.selectBuilder(PstrVO.class, query)
		 		   .setParams(pstmt -> pstmt.setString(1, movie.getMvId()))
		 		   .selectList();
	    movie.setPstrList(pstrs);
	}
	
	
	public void setCasts(MvVO movie) {
		// 출연진 조회 Mv has a Str
		final StringBuffer query = new StringBuffer();
		query.append("SELECT STR_ID   ");
	    query.append("     , INVLVD_ID");
	    query.append("     , MV_ID    ");
	    query.append("     , RL_NM    ");
	    query.append("  FROM STR      ");
	    query.append(" WHERE MV_ID = ?");
	    
	    List<StrVO> strs = this.connector.selectBuilder(StrVO.class, query)
	    								 .setParams(pstmt -> pstmt.setString(1, movie.getMvId()))
	    								 .selectList();
	    movie.setStrList(strs);
	    
	   //query = new StringBuffer(); > 상수로 바꿔야하기 때문에
	   query.delete(0, query.length());
	   query.append("SELECT INVLVD_ID    ");
	   query.append("     , PRFL_URL     ");
	   query.append("     , NM           ");
	   query.append("  FROM INVLVD       ");
	   query.append(" WHERE INVLVD_ID = ?");
	   
	    // Str has a Invlvd
	    strs.forEach(str -> {
	    	// 람다 함수 내부에서는 외부의 지역 변수를 사용할 수 없다. (query 가 에러 나는 이유)
	    	// 람다 함수 내부에서 사용할 수 있는 것? => 람다 내부의 지역변수, 람다 외부의 상수, 멤버 변수
	    	// 상수로 바꿔주겠다 final StringBuffer query = new StringBuffer();  >>  final 붙임
	    	
	    	InvlvdVO involved = this.connector.selectBuilder(InvlvdVO.class, query)
	    									  .setParams(pstmt -> pstmt.setString(1, str.getInvlvdId()))
	    									  .selectOne();
	    	str.setInvlvdVO(involved);
	    });
	}
	
	
	
	public void setFilmmakers(MvVO movie) {
		final StringBuffer query = new StringBuffer();
		query.append("SELECT FLMMK_ID    ");
		query.append("     , INVLVD_ID   ");
		query.append("     , MV_ID       ");
		query.append("     , RL          ");
		query.append("     , PRT         ");
		query.append("  FROM FLMMK       ");
		query.append(" WHERE FLMMK_ID = ?");
			List<FlmmkrVO> flmmkrs = this.connector.selectBuilder(FlmmkrVO.class, query)
									     	 	   .setParams(pstmt -> pstmt.setString(1, movie.getMvId()))
											       .selectList();
			movie.setFlmmkrList(flmmkrs);
	    query.delete(0, query.length());
	    query.append("SELECT INVLVD_ID    ");
	    query.append("     , PRFL_URL     ");
	    query.append("     , NM           ");
	    query.append("  FROM INVLVD       ");
	    query.append(" WHERE INVLVD_ID = ?");
	    
	 // Flmmkr has a Invlvd
	    flmmkrs.forEach(flmmkr ->{
	    	InvlvdVO involved = this.connector.selectBuilder(InvlvdVO.class, query)
	    									  .setParams(pstmt -> pstmt.setString(1, flmmkr.getInvlvdId()))
	    									  .selectOne();
	    	flmmkr.setInvlvdVO(involved);
	    });
	}
	
	public static void main(String[] args) {
		MovieInfo movieInfo = new MovieInfo();
		
		MvVO movie = movieInfo.selectMovie("1-spider-man-brand-new-day");
		movieInfo.setGenres(movie);
		movieInfo.setKeywords(movie);
		movieInfo.setVideos(movie);
		movieInfo.setPosters(movie);
		movieInfo.setCasts(movie);
		movieInfo.setFilmmakers(movie);
		
		System.out.println(movie);
		System.out.println("장르명");
		movie.getGnrList().forEach(gnr -> System.out.println(gnr.getNm()));
		
		System.out.println(movie);
		System.out.println("키워드");
		movie.getKwrdList().forEach(kwrd -> System.out.println(kwrd.getKwrdNm()));
		
		System.out.println(movie);
		System.out.println("=".repeat(70));
		System.out.println("비디오");
		movie.getVdList().forEach(vd -> System.out.println(vd.getVdUrl()));
		
		System.out.println(movie);
		System.out.println("=".repeat(70));
		System.out.println("배경");
		movie.getBckgrndList().forEach(bckgrnd -> System.out.println(bckgrnd.getBckgrndUrl()));
		
		System.out.println(movie);
		System.out.println("=".repeat(70));
		System.out.println("포스터");
		movie.getPstrList().forEach(pstr -> System.out.println(pstr.getPstrUrl()));
		
		System.out.println();
		System.out.println("=".repeat(70));
		System.out.println("출연 배우");
		movie.getStrList().forEach(str -> {
			System.out.println(" "+ str.getInvlvdVO().getNm()+ " - " + str.getRlNm());
		});
		
		System.out.println();
		System.out.println("=".repeat(70));
		System.out.println("참여자");
		movie.getStrList().forEach(flmmkr -> {
			System.out.println(" "+ flmmkr.getInvlvdVO().getNm()+ " - " + flmmkr.getRlNm());
		});
		
		// App 종료 직전 모든 Connection을 닫는다.
		movieInfo.connector.close();
	}
}
