package ex01;

import java.io.*;

// �θ�Ŭ���� - �б�
class School{
   //�ʵ�
   String status;
   String name;
   int age;
   String major;
   // ������
   public School() {
      
   }
   // �޼ҵ� - �����Է�
   public void putInfo() throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("�̸�:");
      this.name = br.readLine();
      System.out.println("����:");
      this.age = Integer.parseInt(br.readLine());
   }
   // �޼ҵ� - ����Ȯ��
   public void getInfo() {
      System.out.println("�̸�:"+name);
       System.out.println("����:"+age);
   }
}

// �ڽ�Ŭ���� - ����
class Teacher extends School{
   // �ʵ� - ��ӹ���.
   
   // ������
   public Teacher() {
      super();
      status = "������";
      major= "����";
   }
   // �޼ҵ� - �����Է�
   @Override
   public void putInfo() throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("=="+status+"�����Է�==");
      super.putInfo();
      System.out.println("����:");
      this.major = br.readLine();

   }
   // �޼ҵ� - ����Ȯ��
   @Override
   public void getInfo() {
      System.out.println("=="+status+"����Ȯ��==");
      super.getInfo();
      System.out.println("����:"+this.major);
   }
   
}
// �ڽ�Ŭ���� - �л�
class Student extends School{
   // �ʵ�
   
   // ������
   public Student() {
      super();
      status = "�л�";
      major = "����";
   }
   // �޼ҵ� - �л� ���� �Է�
   @Override
   public void putInfo() throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("=="+status+"�����Է�==");
      super.putInfo();
      System.out.println("����:");
      this.major = br.readLine();

   }
   // �޼ҵ� - �л� ���� Ȯ��
   @Override
   public void getInfo() {
      System.out.println("=="+status+"����Ȯ��==");
      super.getInfo();
      System.out.println("����:"+major);
   }
}

// �л� Ŭ����
public class Haksa {
   // �б� �Ӽ�
   School[] srr;
   int sum;
   // �б� ������
   public Haksa() {
      srr=new School[10];
       sum=0;
   }
   // �޼ҵ� - �л�����޴����
   static public void startHaksa() {
      System.out.println("================");
      System.out.println("�л�������α׷� v1.0");
      System.out.println("----------------");
      System.out.println("1. ������ ���� �Է�");
      System.out.println("2. �л� ���� �Է�");
      System.out.println("3. ������ ���� Ȯ��");
      System.out.println("4. �л� ���� Ȯ��");
      System.out.println("5. ��� ���� Ȯ��");
      System.out.println("6. ����");
      System.out.println("----------------");
      System.out.println("�޴� �Է� >>");
   }
   // �޼ҵ� - ���� �Է�
   public void newTeacher() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         if(sum>=10) {
            System.out.println("�߰��Է� ���� �ο� ���� �ʰ��Ͽ����ϴ�.");
            return; // while������ ���ư���.
         }
         srr[sum] = new Teacher();
         srr[sum].putInfo();
         sum++;
      }
   // �޼ҵ� - �л� �Է�
    public void newStudent() throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         if(sum>=10) {
            System.out.println("�߰��Է� ���� �ο� ���� �ʰ��Ͽ����ϴ�.");
            return; 
         }
         srr[sum] = new Student();
         srr[sum].putInfo();
         sum++;
      }
   // �޼ҵ� - ���� ���� ���
    public void getT() {
         for(int i=0; i<sum; i++) { 
            if(srr[i] instanceof Teacher) { 
           //instanceof : �ش� Ŭ������ ��ü Ÿ�� ��.
               srr[i].getInfo();
            }
         }
      }
   // �޼ҵ� - �л� ���� ���
    public void getS() {
       for(int i=0; i<sum; i++) {
          if(srr[i] instanceof Student) {
            srr[i].getInfo();
          }
       }
    }

    
   // �л�������α׷� main
   public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      Haksa ha = new Haksa();
      
      // ����ڰ� 6 �Է��� �� ���� ��� �ݺ�
      while(true) {
         Haksa.startHaksa(); // �޴� ���
         int menuNum = Integer.parseInt(br.readLine());
         
         switch(menuNum) {
         case 1: ha.newTeacher(); break;
         case 2: ha.newStudent(); break;
         case 3: ha.getT(); break;
         case 4: ha.getS(); break;
         case 5: ha.getT(); 
               ha.getS(); break;
         case 6: System.out.println("�л���� ���α׷� ����");
               System.exit(0); break;
         default: System.out.println("�߸��� �Է��Դϴ�.");
         }
      }
   }
}