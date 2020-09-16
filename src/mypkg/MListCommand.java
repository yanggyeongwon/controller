package mypkg;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MListCommand implements MemberCommand {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) {
		
		MemberDAO dao = MemberDAO.getInstance();
		ArrayList<MemberDTO> lists =  dao.getSelectAll();
		
		request.setAttribute("lists", lists);
	}

}
