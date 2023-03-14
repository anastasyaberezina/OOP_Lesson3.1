package DailyPlanner.DPlanner;

public class RecordJson implements Record{
    @Override
    public <T extends Process> String createString(T process) {
        return String.format("""
                {"Text":%s, "author":"%s", "adding date":"%s", "priority":"%s"}"""
                , process.getText(), process.getAuthor(), process.getDate(), process.getPriority());
    }
}
