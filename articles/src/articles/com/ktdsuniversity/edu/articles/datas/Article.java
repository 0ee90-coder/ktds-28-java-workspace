package articles.com.ktdsuniversity.edu.articles.datas;

import java.util.List;

public class Article {

	private String title;          // 게시글 제목
	private String writer;         // 게시글 작성자
	private String writeDate;      // 게시글 작성 날짜
	private int viewCount;         // 게시글 조회수
	private String content;        // 게시글 내용
	private List<Reply> replies;   // 게시글에 달린 댓글 목록

	public Article(String title, String writer, String writeDate, int viewCount, String content, List<Reply> replies) {
		super();
		this.title = title;
		this.writer = writer;
		this.writeDate = writeDate;
		this.viewCount = viewCount;
		this.content = content;
		this.replies = replies;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return this.writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getWriteDate() {
		return this.writeDate;
	}

	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}

	public int getViewCount() {
		return this.viewCount;
	}

	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public List<Reply> getReplies() {
		return this.replies;
	}

	public void setReplies(List<Reply> replies) {
		this.replies = replies;
	}

   
}
