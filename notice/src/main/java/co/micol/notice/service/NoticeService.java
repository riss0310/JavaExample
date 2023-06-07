package co.micol.notice.service;

import java.util.List;

//Model을 구현할 때 사용하는 인터페이스
public interface NoticeService {
	List<NoticeVO> noticeSelectList(); // 전체조회

	NoticeVO noticeSelect(NoticeVO vo); // 한명조회

	int noticeInsert(NoticeVO vo); // 입력

	int noticeUpdate(NoticeVO vo); // 수정

	int noticeDelete(NoticeVO vo); // 삭제

}
//혜련아 
//들어라..
//수업시간에
//줄지
//졸지말걸아
//내가그렇게
//가르쳣나
//이노마