package dto;

import able.Attendance;

public class AppAttend implements Attendance {
	private boolean persent = false; //처음에는 퇴실상태
	
	@Override
	public void checkIn() {
		persent=true; //출석했다
		System.out.println("앱 출석 완료");
		
	}

	
	@Override
	public void checkOut() {
		persent=false; //출석했다
		System.out.println("앱 퇴실 완료");
	}

	@Override
	public boolean isPresent() {
		return persent;
		
	}

}
