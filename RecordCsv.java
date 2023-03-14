package DailyPlanner.DPlanner;

public class RecordCsv implements Record {
        @Override
        public <T extends Process> String createString(T process) {
            return String.format("%s,%s,%d,%d\n", process.getText(), process.getAuthor(),process.getDate(), process.getPriority());
        }
    }
}
