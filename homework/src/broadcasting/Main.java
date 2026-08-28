package broadcasting;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		//현재시간
		LocalTime nowTime = LocalTime.now();
		
		//방송사 
		Broadcaster sbs = new Broadcaster("SBS");
		Broadcaster kbs1 = new Broadcaster("KBS1");
		Broadcaster kbs2 = new Broadcaster("KBS2");
		Broadcaster mbc = new Broadcaster("MBC");
		Broadcaster ebs = new Broadcaster("EBS");
		Broadcaster tvn = new Broadcaster("TVN");
		
		sbs.addProgram(new Program(LocalTime.of(7, 0),LocalTime.of(10, 0), "좋은아침"));
        kbs1.addProgram(new Program(LocalTime.of(8, 0),LocalTime.of(10, 0),"아침마당"));
        kbs2.addProgram(new Program(LocalTime.of(8, 0),LocalTime.of(10, 0),"생생정보"));
        mbc.addProgram(new Program(LocalTime.of(8, 0),LocalTime.of(10, 0),"드라마"));
        ebs.addProgram(new Program(LocalTime.of(8, 0),LocalTime.of(10, 0),"애니메이션"));
        tvn.addProgram(new Program(LocalTime.of(10, 0),LocalTime.of(12, 0),"예능"));

        // 방송사들을 하나의 List에 저장
        List<Broadcaster> broadcasters = new ArrayList<>();
        broadcasters.add(sbs);
        broadcasters.add(kbs1);
        broadcasters.add(kbs2);
        broadcasters.add(mbc);
        broadcasters.add(ebs);
        broadcasters.add(tvn);

        // 현재 방송중인 프로그램 출력
        for (Broadcaster broadcaster : broadcasters) {
            Program program = broadcaster.OnAirProgram(nowTime);
            if (program != null) {
                System.out.println(broadcaster.getName()+ " “"+ program.getName()+ "” 이(가) 방영중입니다.");
            } else {System.out.println(broadcaster.getName()+ " 방영중인 시간이 아닙니다.");
            }
        }
    }
}

