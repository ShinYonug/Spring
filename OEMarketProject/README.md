
*<새 작업 진행하실 때는 항상 변경사항을 README에 작성해주세요.>

***************************************************
0722 - 정빈<작성 중>

DGVO 작성
CrawlingMapper.java 작성
CrawlingMapper.xml 작성

CrawlingMapperTests.java 작성 후 테스트 성공

- C Read U D 파트
CrawlingMapper.java 코드 추가 -> public DGVO read(int no);

CrawlingMapper.xml에 아래 코드 추가
<select id="read" resultType="com.oe.domain.DGVO">
  	select * from crawlingTest where no = #{no}
</select>

CrawlingMapperTests.java 읽기 테스트 성공

pom.xml에 jsoup 추가
CrawlingTestController.java 작성

****************************************************
0722 - 정빈

views/includes 폴더에 header.jsp와 footer.jsp 따로 나눠뒀습니다.
<%@ include file="../includes/header.jsp" %> -> header와 footer가 필요하신 페이지에
<%@ include file="../includes/footer.jsp" %> -> 이 코드들을 복붙해주시면 됩니다.

****************************************************

0722 - 기욱<작성 중>
MarketUserController 클래스 작성
MarketUserVO 클래스 작성
MarketUserMapper 인터페이스 작성
MarketUserService 인터페이스 작성
MarketUserServiceImpl 클래스 작성

MarketUserMapper.xml 작성 중

20220721 작업 결과 
	userjoin 성공 데이터베이스 등록 확인.
	인터페이스 서비스 작성
	서비스임플 구현
	컨트롤러 어노테이션 등록
	컨트롤러에서 서비스임플 사용
	매퍼.xml 에서 insert sql문 작성
	실행 오류 => 어드레스1,2,3 VO에서 수정안함. 오류잡기 성공. 디비에 넣기 성공. 집에감.


join.jsp 작성

****************************************************


0722 - 진아 - 마이페이지 유저 정보 수정 확인 중

update.jsp 작성


****************************************************

0722 - 정빈, 수정 - 보드리스트카테고리 정렬

20220722 작업결과 
	디비에서 가져와서 jsp 화면에 크롤링한 데이타 뿌리기
	크롤링하기 전에 디비 딜리트하기 (카테고리를 널값으로 넣어줌)

<해야될 것>
인기상품순 select * from MarketBoard order by heart_count desc;
최신등록순 select * from MarketBoard order by regidate desc;
낮은가격순 select * from MarketBoard order by price;
높은가격순 select * from MarketBoard order by price desc;

오른쪽 네비게이션 바 bookshop에서 참고해서 구현하기
보드리스 pagging처리
상세페이지에서 작성자가 판매자가 판매완료 눌렀을 시 페이지에 판매완료 뜨게 하기
검색페이지 
상품등록페이지만들기



******************************************************

0722 - 정빈, 기욱

메인 페이지 jsp 입력 및 수정. 검색 아이콘 옆 메뉴 바는 카테고리 검색을 위한 부분입니다.(아직 동작 x)


메인 페이지에서 다른 페이지로 넘어가는 부분을 추가했습니다.
WEB-INF 폴더가 브라우저에서 직접적으로 접근 불가능한 폴더이므로 각 컨트롤러에 Mapping을 해줘서
넘어가는 부분을 구현했고,
[다른 페이지에 넘어간 이후에 특정 페이지에 들어가려하면 예를 들어 boardList.jsp에서 login.jsp를
요청하면 경로에 문제가 생겨서 차후에 수정하고자 합니다.]


*******************************************************

0722 - 기욱, 진아

join.jsp 작성
join.jsp 주소 api 추가(시군구 동 만 입력)
MarketUserVO 클래스 수정
address3 삭제

userupdate 성공 데이터베이스 수정 확인.
   한글 깨짐 현상 발생.
   web.xml 에 필터 추가
   <filter>
      <filter-name>encoding</filter-name>
      <filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>
      <init-param>
         <param-name>encoding</param-name>
         <param-value>UTF-8</param-value>
      </init-param>
   </filter>
   <filter-mapping>
      <filter-name>encoding</filter-name>
      <servlet-name>appServlet</servlet-name>
   </filter-mapping>
   한글 깨짐 현상 조치 완료
   
********************************************


0723 - 수연
▶페이지 디자인 폴더에 회원탈퇴 페이지.jpg & 회원탈퇴 확인 알림창.jpg 추가
▶OEMarketProject에서 생성 및 수정한 파일 목록 (VO 제외)
   ▷MyPageMapper.xml, MyPageMapper.java
   ▷MyPageService.java, MyPageServiceImpl.java, MyPageController.java
   ▷MyPageMapperTests.java, MyPageControllerTests.java
   ▷mypage.jsp, withdrawal.jsp(회원탈퇴 페이지. 비어있음.)
   ▷HeartBoardMapper.java, HeartBoardService.java

**********************************************************************

0725 - 수연
      ▶참조 및 진행 흔적 폴더에 클래스 다이어그램 폴더(발표한 ppt + 이미지 원본) 추가
      ▶마이페이지 로직 수정(프로필 변경 시 이미지, 닉네임, 자기소개가 동시에 업데이트 되도록 변경)
      ▼프로필 변경, 개인정보 페이지 이동, 회원탈퇴 페이지 이동이 잘 동작하도록 파일 수정 후 확인 완료.
         ▼변경한 파일 목록
            ▶MyPageMapper.java, MyPageMapper.xml, Service.java, ServiceImpl.java
            ▶MyPageController.java, mypage.jsp


0725 - 진아

회원가입 시 Mypage테이블에도 등록 되도록 추가
->  MarketUserMapper.xml , MarketUserMapper.java => joinMypage 추가
   MarketUserService.java , MarketUserServiceImpl.java => MyRegister 추가
   MarketUserController.java => (@Post)joinUser에 추가

마이페이지 - 회원탈퇴 기능 구현 완성
비밀번호 확인 후 넘어가도록 구현
마이페이지 테이블에서만 삭제 되고 유저 테이블에는 남아있게 구현
->  MyPageMapper.xml , MyPageMapper.java => getUserPass 추가
   MyPageService.java , MyPageServiceImpl.java => checkPass 추가
   MyPageController.java => (@Get)get에 checkPass추가, (@Post)withdrawal에    withdrawal 추가
   withdrawal.jsp 작성 & 실행 확인 

**********************************************************************

0725 - 기욱 

findId, findPass.jsp 폼 추가 (실행은 안됨;;)
login.jsp, 진아, 수연 작업 하나로 통합















