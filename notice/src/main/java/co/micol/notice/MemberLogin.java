package co.micol.notice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.micol.notice.common.Command;
import co.micol.notice.member.service.MemberService;
import co.micol.notice.member.service.MemberVO;
import co.micol.notice.member.serviceImpl.MemberServiceImpl;

public class MemberLogin implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 로그인 처리
		MemberService ms = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		HttpSession session = request.getSession();

		vo.setMemeberId(request.getParameter("memberId"));
		vo.setMemberPassword(request.getParameter("memberPassword"));

		vo = ms.memberLogin(vo);
		if (vo != null) {
			session.setAttribute("id", vo.getMemeberId());
			session.setAttribute("name", vo.getMemeberName());
			
			request.setAttribute("message", vo.getMemeberName() + "님 환영합니다.");
			
		} else {
			request.setAttribute("message", "아이디 또는 패스워드가 틀렸습니다");
		}
		return "member/memberMessage";
	}

}
