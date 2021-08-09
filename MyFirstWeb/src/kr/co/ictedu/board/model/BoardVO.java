package kr.co.ictedu.board.model;

import java.sql.Timestamp;

public class BoardVO {
	
	private String bid;
	private String bname;
	private String btitle;
	private String bcontent;
	// Timestamp는 시 분 초까지 표기, Date는 년 월 일만 표기합니다.
	private Timestamp bdate;
	private String bhit;
	
	public BoardVO() {
	
	}
	
	public BoardVO(String bid, String bname, String btitle, 
					String bcontent, Timestamp bdate, String bhit) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bdate = bdate;
		this.bhit = bhit;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public String getBcontent() {
		return bcontent;
	}

	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}

	public Timestamp getBdate() {
		return bdate;
	}

	public void setBdate(Timestamp bdate) {
		this.bdate = bdate;
	}

	public String getBhit() {
		return bhit;
	}

	public void setBhit(String bhit) {
		this.bhit = bhit;
	}

	@Override
	public String toString() {
		return "BoardVO [bid=" + bid + ", bname=" + bname + 
				", btitle=" + btitle + ", bcontent=" + bcontent + 
				", bdate=" + bdate + ", bhit=" + bhit + "]";
	}
}


