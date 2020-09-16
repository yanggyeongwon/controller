package mypkg;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//추상메서드만
//추상메서드 - 정의되지 않는 메소
public interface MemberCommand {
	public void excute(HttpServletRequest request, HttpServletResponse response);
	
}
