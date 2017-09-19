package com.zhiyou100.util.db;

import java.util.Date;

public class News {

	private Integer nid;
	private String title;
	private Date pubdate;
	private String note;

	public Integer getNid() {
		return nid;
	}

	public void setNid(Integer nid) {
		this.nid = nid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getPubdate() {
		return pubdate;
	}

	public void setPubdate(Date pubdate) {
		this.pubdate = pubdate;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "News [nid=" + nid + ", title=" + title + ", pubdate=" + pubdate + ", note=" + note + "]";
	}

}
