# heyDoctor

<h1>비대면 사전 진료 서비스 프로젝트 - 'heyDoctor'</h1>


<h2>1. 기획 의도</h2>
<img src="https://github.com/README-wmoon/README-wmoon/assets/129862668/1e80fa56-2e74-45c5-804c-bea7f2d0d7f1" style = "width: 80%; height : 480">

지방 병원은 대체로 밀집도가 낮아 환자들이 병원을 찾기 힘들다, <strong>따라서 환자들이 멀리있는 병원을</strong>가야된다. 이것은 환자들이 진료를 보기위해서 시간이<strong>불필요하게 많이 소요될 떄가 많다.</strong>그래서 우리는 이런 불피요함을 없애기 위해서 이런 프로젝트를 기획하였다.

</div>


<h2>2. 기대 효과</h2>
<img src="https://github.com/README-wmoon/README-wmoon/assets/129862668/cb87f898-46af-4473-9d7c-890ba23cd701" style = "width: 80%; height : 480"><br>
STEP 1. 지방 병원은 병원의 밀집도가 낮기 떄문에 환자들이 병원을 찾기 힘듬<br>
STEP 2. 환자들이 진료를 보기위해서 시간이 불필요하게 많이 소요될 때가 많음<br>
비대면 사전 진료 서비스 프로젝트는 환자들이 멀리 있는 병원을 가는 시간을 낮추기 위해서 쓰인다. 최종적으로는 환자들이 가는 시간을 감소시킬 수 있도록 기획하였다. <br>


<h2>3. 프로젝트 사용 툴</h2>
- Java<br>
- Java Script<br>
- tomcat<br>
- jQuery<br>
- MyBatis<br>
- Spring Boot<br>
- Oracle<br>
- Visual Studio Code<br>
- DBeaver<br>
- Sourcetree<br>
- git, github<br>
- JSON<br>
- Ajax<br>
- JDK 11.0.15<br>

<h2>4. ERD</h2>
<img src="https://github.com/README-wmoon/README-wmoon/assets/129862668/37c091ea-7606-4045-9afc-f9bc74c48964"  style = "width: 80%; height : 480">

  
<h2>5. 담당 업무</h2>
5-1 프론트엔드<br>
<img src="https://github.com/README-wmoon/README-wmoon/assets/129862668/0df87008-c562-409e-b253-2b1fca54c3e3" style = "width: 90%;">

▶ 로그인
- 다른 방법으로 시작하는 법
- 로그인 모달창

▶ 회원가입
- 이메일 등록
- 이메일 발송 완료
- 비밀번호 변경

▶ 이력서 확인 및 수정
- 이력 관리 내역
- 나의 후기
- 이력서 조회
- 내가 쓴 이력서

▶ 오류페이지
- 404 오류(웹)
- 404 오류(모바일) 

<br>
5-2 백엔드<br>
<img src="https://github.com/README-wmoon/README-wmoon/assets/129862668/a18b534b-3e04-4078-b1a0-f14c5f173343" style = "width: 90%;">


▶ 검색창
- 환자 전체 질문 목록 리스트
- 환자 질문 타이틀 검사

 

<h2>6. 느낀점</h2>
<h3>6-1. 어려웠던 부분</h3>
📌MVC도 어려웠지만, Controller부분이 어려웠었다. <br>
✔ 단계가 익숙하지 않아 mapper부터 controller까지 진행하는 것이 어려웠었다, 또한 Controller에서 쓰는 용법들이 어떻게 작용하는지 몰라서 많이 노력을 했었다.<br><br>
<br>


<h3>6-2. 문제를 해결했던 부분</h3>
<h4>📌검색창 클래스</h4>
🌩문제 상황🌩<br>
Spring boot에서 Test를 해봤을때 ibatis라는 에러가 걸려서 test를 할수 가 없었다.<br><br>
🚨문제 원인🚨 <br>
기능 구현에는 문제가 없었으나, test가 안되서 이게 제대로 되는지 안되는지 확인이 불가능 했다. <br><br>
🚀해결 방법🚀<br>
클래스에 @Param("search") Search keyword 라는 것을 넣어놧엇는데, @Param("search") 있는것을 삭제하였더니, 제대로 작동을 하였다. 
<br><br><br>




<h3>5-4. 총평</h3>
<h4>🌟 소통이 답이다. </h4>
항상 소통이 있어야 프로젝트 완성을 가능하게 할 수 있고, 소통이 없으면 모든 프로젝트가 망할 가능성이 있다. 그리고 강의를 듣거나 중요한 문제가 있을떄 혼자 하는것 보다는 함꼐 모여서 이것에 대해
소통을 하면서 찾아 가는것이 더 기억이 나고 중요하게 느낀다. 더 나아가 소통을 하며 하는 경험들이 면접을 조금더 잘 볼수 있는 원동력이 될 수 있다.





