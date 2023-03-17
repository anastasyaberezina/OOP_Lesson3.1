package DailyPlanner.DPlanner;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Process implements Compare<Process> {
    private String text;
    private String author;
    private final String date;
    private int priority;
    private static int count;

    public Process(String text, String author, String date, int priority) {
        this.text = text;
        this.author = author;
        this.date = LocalDate.now().format(DateTimeFormatter.ofPattern("dd:MM:yyyy"));
        this.priority = priority;
    }
    public Process(String text) {
        this.text = text;
        this.date = LocalDate.now().format(DateTimeFormatter.ofPattern("dd:MM:yyyy"));
        this.author = "новый автор";
        this.priority = 0;
    }
    public Process() {
        this.date = LocalDate.now().format(DateTimeFormatter.ofPattern("dd:MM:yyyy"));
        this.text = "Новая запись: ";
        this.author = "новый автор";
        this.priority = 0;

    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getDate() {
        return date;
    }

    public String getPriority() {
        return switch (priority) {
            case 1 -> "приоритет низкий";
            case 2 -> "средний приоритет";
            case 3 -> "наивысший приоритет";
        };
    }

    public int getPriorCode() {
        return priority;
    }
    public void setPriority(int priority) {
        this.priority = priority;
    }
    @Override
    public String toString() {
        return getText() + ", автор: " + getAuthor() +
                ", дата добавления: " + date +
                ", важность: " + getPriority();
    }
}
