package ex01;

import java.io.*;

// 부모클래스 - 학교
class School{
   //필드
   String status;
   String name;
   int age;
   String major;
   // 생성자
   public School() {
      
   }
   // 메소드 - 정보입력
   public void putInfo() throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("이름:");
      this.name = br.readLine();
      System.out.println("나이:");
      this.age = Integer.parseInt(br.readLine());
   }
   // 메소드 - 정보확인
   public void getInfo() {
      System.out.println("이름:"+name);
       System.out.println("나이:"+age);
   }
}

// 자식클래스 - 선생
class Teacher extends School{
   // 필드 - 상속받음.
   
   // 생성자
   public Teacher() {
      super();
      status = "선생님";
      major= "과목";
   }
   // 메소드 - 정보입력
   @Override
   public void putInfo() throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("=="+status+"정보입력==");
      super.putInfo();
      System.out.println("과목:");
      this.major = br.readLine();

   }
   // 메소드 - 정보확인
   @Override
   public void getInfo() {
      System.out.println("=="+status+"정보확인==");
      super.getInfo();
      System.out.println("과목:"+this.major);
   }
   
}
// 자식클래스 - 학생
class Student extends School{
   // 필드
   
   // 생성자
   public Student() {
      super();
      status = "학생";
      major = "전공";
   }
   // 메소드 - 학생 정보 입력
   @Override
   public void putInfo() throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("=="+status+"정보입력==");
      super.putInfo();
      System.out.println("전공:");
      this.major = br.readLine();

   }
   // 메소드 - 학생 정보 확인
   @Override
   public void getInfo() {
      System.out.println("=="+status+"정보확인==");
      super.getInfo();
      System.out.println("전공:"+major);
   }
}

// 학사 클래스
public class Haksa {
   // 학교 속성
   School[] srr;
   int sum;
   // 학교 생성자
   public Haksa() {
      srr=new School[10];
       sum=0;
   }
   // 메소드 - 학사관리메뉴출력
   static public void startHaksa() {
      System.out.println("================");
      System.out.println("학사관리프로그램 v1.0");
      System.out.println("----------------");
      System.out.println("1. 선생님 정보 입력");
      System.out.println("2. 학생 정보 입력");
      System.out.println("3. 선생님 정보 확인");
      System.out.println("4. 학생 정보 확인");
      System.out.println("5. 모든 정보 확인");
      System.out.println("6. 종료");
      System.out.println("----------------");
      System.out.println("메뉴 입력 >>");
   }
   // 메소드 - 선생 입력
   public void newTeacher() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         if(sum>=10) {
            System.out.println("추가입력 가능 인원 수를 초과하였습니다.");
            return; // while문으로 돌아가기.
         }
         srr[sum] = new Teacher();
         srr[sum].putInfo();
         sum++;
      }
   // 메소드 - 학생 입력
    public void newStudent() throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         if(sum>=10) {
            System.out.println("추가입력 가능 인원 수를 초과하였습니다.");
            return; 
         }
         srr[sum] = new Student();
         srr[sum].putInfo();
         sum++;
      }
   // 메소드 - 선생 정보 출력
    public void getT() {
         for(int i=0; i<sum; i++) { 
            if(srr[i] instanceof Teacher) { 
           //instanceof : 해당 클래스의 객체 타입 비교.
               srr[i].getInfo();
            }
         }
      }
   // 메소드 - 학생 정보 출력
    public void getS() {
       for(int i=0; i<sum; i++) {
          if(srr[i] instanceof Student) {
            srr[i].getInfo();
          }
       }
    }

    
   // 학사관리프로그램 main
   public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      Haksa ha = new Haksa();
      
      // 사용자가 6 입력할 때 까지 계속 반복
      while(true) {
         Haksa.startHaksa(); // 메뉴 출력
         int menuNum = Integer.parseInt(br.readLine());
         
         switch(menuNum) {
         case 1: ha.newTeacher(); break;
         case 2: ha.newStudent(); break;
         case 3: ha.getT(); break;
         case 4: ha.getS(); break;
         case 5: ha.getT(); 
               ha.getS(); break;
         case 6: System.out.println("학사관리 프로그램 종료");
               System.exit(0); break;
         default: System.out.println("잘못된 입력입니다.");
         }
      }
   }
}