package DailyPlanner.DPlanner;

public class RecordXml implements Record{
    @Override
    public <T extends Process> String createString(T process) {
        return String.format("""
                <xml>
                <Text>%s</Text>
                <Author>%s</Author>
                <Adding date>%s</Adding date>
                <Priority>%s</Priority>
                </Process></xml>
                """, process.getText(), process.getAuthor(), process.getDate(), process.getPriority());
    }
}
