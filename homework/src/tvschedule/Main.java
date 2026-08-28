package tvschedule;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		List<Program> schedule = new ArrayList<>();
		
		schedule.add(new Program(LocalTime.of(3, 0), LocalTime.of(5, 0), "프로그램 1"));
		schedule.add(new Program(LocalTime.of(5, 1), LocalTime.of(6, 30), "프로그램 2"));
		schedule.add(new Program(LocalTime.of(6, 31), LocalTime.of(8, 0), "프로그램 3"));
		schedule.add(new Program(LocalTime.of(8, 1), LocalTime.of(9, 0), "프로그램 4"));
		schedule.add(new Program(LocalTime.of(9, 1), LocalTime.of(10, 0), "프로그램 5"));
		schedule.add(new Program(LocalTime.of(10, 1), LocalTime.of(12, 0), "프로그램 6"));
		schedule.add(new Program(LocalTime.of(12, 1), LocalTime.of(13, 30), "프로그램 7"));
		schedule.add(new Program(LocalTime.of(13, 31), LocalTime.of(15, 0), "프로그램 8"));
		schedule.add(new Program(LocalTime.of(15, 1), LocalTime.of(17, 0), "프로그램 9"));
		schedule.add(new Program(LocalTime.of(17, 1), LocalTime.of(18, 0), "프로그램 10"));
		schedule.add(new Program(LocalTime.of(18, 1), LocalTime.of(21, 0), "프로그램 11"));
		schedule.add(new Program(LocalTime.of(21, 1), LocalTime.of(23, 0), "프로그램 12"));
		schedule.add(new Program(LocalTime.of(23, 1), LocalTime.of(23, 59), "프로그램 13"));
		
		// 현재시간 
		LocalTime nowTime = LocalTime.of(10, 34);
		
		// schedule 리스트에 있는 프로그램을 하나씩 꺼내서 확인
		for(Program program : schedule) {
			// 현재 시각이 이 프로그램의 방영 시간(시작~종료) 안에 있는지 확인
			boolean onAir = (nowTime.equals(program.getStartTime()) || nowTime.isAfter(program.getStartTime())) && 
					(nowTime.equals(program.getEndTime()) || nowTime.isBefore(program.getEndTime()));
			
			if(onAir) {
				System.out.println(program.getName());
				return;
			}
		}
		System.out.println("방영중인 시간이 아닙니다.");
	}
}
