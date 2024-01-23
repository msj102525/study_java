package ncs.test7;

import java.text.SimpleDateFormat;
import java.util.Date;

class Notice {
    private int no;
    private String title;
    private Date date;
    private String writer;
    private String content;

    public Notice() {
    }

    public Notice(int no, String title, Date date, String writer, String content) {
        this.no = no;
        this.title = title;
        this.date = date;
        this.writer = writer;
        this.content = content;
    }

    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return no + " " + title + " " + sdf.format(date) + " " + writer + " " + content;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getNo() {
        return no;
    }

    public String getTitle() {
        return title;
    }

    public Date getDate() {
        return date;
    }

    public String getWriter() {
        return writer;
    }

    public String getContent() {
        return content;
    }
}