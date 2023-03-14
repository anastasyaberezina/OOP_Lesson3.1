package DailyPlanner.DPlanner;

public interface Record {
    <T extends Process> String createString(T process);
}
