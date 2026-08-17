package broadcasting;

import java.time.LocalTime;

public class Program {

    private LocalTime startTime;
    private LocalTime endTime;
    private String name;

    public Program(LocalTime startTime, LocalTime endTime, String name) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.name = name;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public String getName() {
        return name;
    }
}
