package datas;

public class Reply {

    private String content;    // 댓글 내용
    private String writer;     // 댓글 작성자 이름
    private String writeDate;  // 댓글 작성 날짜
    private int recommendCount; // 댓글 추천 수

    public Reply(String content, String writer, String writeDate) {

        this.content = content;
        this.writer = writer;
        this.writeDate = writeDate;

        this.recommendCount = 0;
    }

    public String getContent() {
        return content;
    }

    public String getWriter() {
        return writer;
    }

    public String getWriteDate() {
        return writeDate;
    }

    public int getRecommendCount() {
        return recommendCount;
    }

    public void increaseRecommendCount() {
        this.recommendCount++;
    }
}
