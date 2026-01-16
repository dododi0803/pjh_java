package dto;

import able.Attendance;

public class CardAttend implements Attendance  {

	private boolean persent = false; //처음에는 퇴실상태
	
	@Override
	public void checkIn() {
		persent=true; //출석했다
		System.out.println("카드 출석 완료");
		
	}

	@Override
	public void checkOut() {
		persent=false; //퇴실했다
		System.out.println("카드 퇴실 완료");
		
	}

	@Override
	public boolean isPresent() {//현재 상태
		return persent;
	}

}
