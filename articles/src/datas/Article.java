package datas;

import java.util.ArrayList;
import java.util.List;

public class Article {

	private String title;          // 게시글 제목
	private String writer;         // 게시글 작성자
	private String writeDate;      // 게시글 작성 날짜
	private int viewCount;         // 게시글 조회수
	private String content;        // 게시글 내용
	private List<Reply> replies;   // 게시글에 달린 댓글 목록

    public Article(String title, String writer, String writeDate, String content) {
    	this.title = title;
        this.writer = writer;
        this.writeDate = writeDate;
        this.content = content;

        this.viewCount = 0;
        this.replies = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void changeTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public String getWriteDate() {
        return writeDate;
    }

    public int getViewCount() {
        return viewCount;
    }

    // 조회수 1 증가
    public void increaseViewCount() {
        this.viewCount++;
    }

    public String getContent() {
        return content;
    }


    public void changeContent(String content) {
        this.content = content;
    }

    public List<Reply> getReplies() {
        return replies;
    }
}
