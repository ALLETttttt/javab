package encapsulation.task_1_2;

public class Book {
    private String title;
    private String author;
    private int pageCount;

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int page_count) {
        if (page_count > 0) {
            this.pageCount = page_count;
            System.out.println("Page count was set.");
        } else {
            System.out.println("Error: page count can not be negative!");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
