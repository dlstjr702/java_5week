

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
git init    << git 폴더(directory) 생성<br>
git remote -v  << 원격저장소 깃이 설치되었는지 확인<br>
git remote add origin   << 깃 원격저장소 추가(등록)하는명령<br>
(git remote add origin https://github.com/dlstjr702/javaPro.git) << origin은 옆에 주소를 담아둔다 별칭<br>
<img width="573" height="233" alt="화면 캡처 2026-06-08 114546" src="https://github.com/user-attachments/assets/af1f18aa-3089-48ea-b9f9-a1cc0da580d9" /><br>
git push -u origin main  << 원격저장소에 올리기 (PUSH)


git status   << 깃 상태확인<br>
<img width="700" height="338" alt="화면 캡처 2026-06-08 112541" src="https://github.com/user-attachments/assets/c810b7f9-b84b-4841-a0ff-94ee36f54aec" /><br>
git add << 추가 후  깃상태확인 메세지 출력하면 아래이미지처럼됨(git add .) .<은 모든것 <br>
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


 <img width="1136" height="648" alt="화면 캡처 2026-06-08 115156" src="https://github.com/user-attachments/assets/aa12e49a-be33-42a3-91e0-f053355dff38" /><br>




( 집이라는 가정<집이나 개인 노트북에서 할경우> )<br>
1. 원격저장소를 복제(Clone)<br>
(깃설치 > 사용자 등록 > 원격저장소등록 순서해야함)<br>
<img width="598" height="387" alt="화면 캡처 2026-06-08 121600" src="https://github.com/user-attachments/assets/cb6bb27d-9242-4e50-bed9-be1fbf2bc2c6" /><br>
<br>
add > status > commit (메세지와 함께입력 > push(로컬저장소에 등록)<br>
<img width="909" height="915" alt="화면 캡처 2026-06-08 122212" src="https://github.com/user-attachments/assets/e5085bc0-2482-4c16-a840-cb9dc8d00c02" /><br>



이클립스에서 하는법 
리스트창에서 마우스 오른쪽 > import > <br>
리스트창에서 마우스 오른쪽 > team 메뉴> pull/push origin으로 올리고 내리고 하기<br>
<img width="1842" height="971" alt="화면 캡처 2026-06-08 141519" src="https://github.com/user-attachments/assets/43b99434-42f8-470f-af8b-432c231d0e4c" /><br>
상단 window메뉴 > show view > other<br>
<img width="336" height="448" alt="화면 캡처 2026-06-08 152814" src="https://github.com/user-attachments/assets/0d366cf4-fe1e-41b0-8315-c87f3009bf56" /><br>




<깃 브렌치><br>
git branch << 브랜치 확인법<br>
git branch -D 지울파일명 << 삭제<br>
<img width="762" height="623" alt="화면 캡처 2026-06-08 150334" src="https://github.com/user-attachments/assets/fa7eef64-b157-4780-a2c9-5c8cbbc2693e" /><br>
<br>
git log << 로그확인<br>
git merge << 병합하기<br>
git checkout 이동할명 << 이동<br>
echo  >> README.md  << README.md라는 파일 만들어<br>

리스트창에서 마우스 오른쪽 > team > switch to >new <<브랜치 생성  <br>
리스트창에서 마우스 오른쪽 > merge <<Merge  <br>




-------------------------------------------------------------------------------------------------------------------------------------
<20260609 화요일 수업자료><br>
- IO (input /output)
- 


-------------------------------------------------------------------------------------------------------------------------------------
<20260610 수요일 수업자료><br>

-------------------------------------------------------------------------------------------------------------------------------------
<20260611 목요일 수업자료><br>

-------------------------------------------------------------------------------------------------------------------------------------
<20260612 금요일 수업자료><br>
