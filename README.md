# java_5week
쌍용교육센터 자바교육 5주차




-------------------------------------------------------------------------------------------------------------------------------------
<20260608 월요일 수업자료><br>
https://thebook.io/080212/0018/<br>
- 깃설치 및 교육<br>
Committed란 데이터가 로컬 데이터베이스에 안전하게 저장됐다는 것을 의미한다.<br>
Modified는 수정한 파일을 아직 로컬 데이터베이스에 커밋하지 않은 것을 말한다.<br>
Staged란 현재 수정한 파일을 곧 커밋할 것이라고 표시한 상태를 의미한다.<br>
<img width="1115" height="727" alt="화면 캡처 2026-06-08 110804" src="https://github.com/user-attachments/assets/4a0511e7-7947-4fe6-ab35-745ad3712878" />
<명령어><br>
git config --list    << 설정내용 확인 변경<br>
git config --system  << 관리자 권한 설정 변경가능<br>
git config --global  << 특정 사용자의 모든 저장소 설정<br>
git config --local   << Git 디렉토리에 있고 특정 저장소(혹은 현재 작업 중인 프로젝트)에만 적용<br>
git help config  << 도움말<br>
git init    << git 폴더 생성<br>
git remote -v  << 깃 설치되었는지 확인<br>
git status   << 깃 상태확인<br>
<img width="700" height="338" alt="화면 캡처 2026-06-08 112541" src="https://github.com/user-attachments/assets/c810b7f9-b84b-4841-a0ff-94ee36f54aec" /><br>
git add << 추가 후  깃상태확인 메세지 출력하면 아래이미지처럼됨<br>
<img width="718" height="387" alt="화면 캡처 2026-06-08 112946" src="https://github.com/user-attachments/assets/b2949a5e-e66a-4f76-a901-3097034b2df0" /><br>
<img width="689" height="289" alt="화면 캡처 2026-06-08 113141" src="https://github.com/user-attachments/assets/e5624608-bd7f-4705-ac08-3f34a3173223" /><br>
<img width="679" height="379" alt="화면 캡처 2026-06-08 113255" src="https://github.com/user-attachments/assets/16f1e0b7-df6d-4a70-830c-0f63502cd6c0" /><br>
<img width="744" height="762" alt="화면 캡처 2026-06-08 113556" src="https://github.com/user-attachments/assets/bbc77bd1-0521-4e8e-8144-30eabe3feb5c" /><br>






code .   << vs코드열림
Q << 창나가기
clear << 깔끔한 창으로 만들기

<사용자 정보 설정> = 문자열사이에 공백있으면 "" 해두기<br>
git config --global user.name "John Doe" <br>
git config --global user.email johndoe@example.com<br>
<br>
<원격저장소><br>


echo "# javaPro" >> README.md<br>
/*or create a new repository on the command line*/
git init<br>
git add README.md<br>
git commit -m "first commit"<br>
git branch -M main<br>
git remote add origin https://github.com/dlstjr702/javaPro.git<br>
git push -u origin main<br>

<br>

/*or push an existing repository from the command line*/
git remote add origin https://github.com/dlstjr702/javaPro.git<br>
git branch -M main<br>
git push -u origin main<br>

-------------------------------------------------------------------------------------------------------------------------------------
<20260609 화요일 수업자료><br>

-------------------------------------------------------------------------------------------------------------------------------------
<20260610 수요일 수업자료><br>

-------------------------------------------------------------------------------------------------------------------------------------
<20260611 목요일 수업자료><br>

-------------------------------------------------------------------------------------------------------------------------------------
<20260612 금요일 수업자료><br>
