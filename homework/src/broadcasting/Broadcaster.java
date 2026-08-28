package broadcasting;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Broadcaster {

    private String name;
    private List<Program> schedule;

    public Broadcaster(String name) {
        this.name = name;
        this.schedule = new ArrayList<>();
    }

    public void addProgram(Program program) {
        schedule.add(program);
    }

    public String getName() {
        return name;
    }

 // 현재 시각에 방영 중인 프로그램을 찾아서 반환
    public Program OnAirProgram(LocalTime nowTime) {
        for (Program program : schedule) {
            boolean onAir = (nowTime.equals(program.getStartTime())  || nowTime.isAfter(program.getStartTime()))
                    && (nowTime.equals(program.getEndTime()) || nowTime.isBefore(program.getEndTime()));
            if (onAir) {
                return program;
            }
        }
        return null;
    }
}
