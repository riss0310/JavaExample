package co.micol.notice.main.command;

import java.net.Authenticator.RequestorType;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.notice.common.Command;
import co.micol.notice.member.service.MemberService;
import co.micol.notice.member.service.MemberVO;
import co.micol.notice.member.serviceImpl.MemberServiceImpl;

public class memberInsert implements Command {

	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 회원가입을 수행한다
		MemberService ms = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		vo.setMemeberId(request.getParameter("memberId"));
		vo.setMemberPassword(request.getParameter("memberPassword"));
		vo.setMemeberName(request.getParameter("memberName"));
		vo.setMemberAge(Integer.valueOf(request.getParameter("memberAge")));
		vo.setMemberTel(request.getParameter("memberTel"));
		vo.setMemberGender(request.getParameter("memberGender"));

		int n = ms.memberInsert(vo);
		if (n != 0) {
			request.setAttribute("message", "회원가입이 정상적으로 처리되었습니다.");
			System.out.println("입력성공");
		} else {
			request.setAttribute("message", "회원가입에 실패했습니다.");
			System.out.println("입력실패");
		}
		return "member/memberMessage";

	}

}
