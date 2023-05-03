package quiz;

import java.lang.reflect.Array;
import java.util.*;

class Student{
	private String name;
	private int kor,math,eng,stNumder;
	private char grade;
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getKor() {return kor;}
	public void setKor(int kor) {this.kor = kor;}
	public int getMath() {return math;}
	public void setMath(int math) {this.math = math;}
	public int getEng() {return eng;}
	public void setEng(int eng) {this.eng = eng;}
	public int getStNumder() {return stNumder;}
	public void setStNumder(int stNumder) {this.stNumder = stNumder;}
	public char getGrade() {return grade;}
	public void setGrade(char grade) {this.grade = grade;}
	
	
}

public class MainClass {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	ArrayList<Student> list = new ArrayList<>();
	Student st = new Student();
	int num, stnum, kor,math,eng;
	String name;
	char grade;
	double avg;
	
	while(true) {
		System.out.println("1.학생 등록");
		System.out.println("2.학생 검색");
		System.out.println("3.모든 학생 보기");
		System.out.println("4.종료");
		System.out.print(">>> ");
		num = input.nextInt();
		
		switch(num) {
		case 1:
			System.out.print("학번 입력: ");
			stnum = input.nextInt();
			st.setStNumder(stnum);
			System.out.print("이름 입력: ");
			name = input.next();
			st.setName(name);
			System.out.print("국어 점수 입력: ");
			kor = input.nextInt();
			st.setKor(kor);
			System.out.print("수학 점수 입력: ");
			math = input.nextInt();
			st.setMath(math);
			System.out.print("영어 점수 입력: ");
			eng = input.nextInt();
			st.setEng(eng);
			
			avg = (kor+math+eng)/3.0;
			switch((int)avg/10) {
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default:
				grade = 'F';
				
			}
			st.setGrade(grade);
			
			list.add(st);
			System.out.println("가입되셨습니다!!!");
			break;
		case 2:
			System.out.print("찾을 학생 학번 입력: ");
			stnum = input.nextInt();
			
			if(list.contains(stnum)) {
				System.out.println(st.getName());
			}
			else {
				System.out.println("존재하지 않는 학생입니다");
			}
			
			break;
		case 3:
			
			for(int i =0;i<list.size();i++) {
//				for(Student str : list) {
//					System.out.println(str.getStNumder());
//				}
				Student s = list.get(i);
				System.out.println(s.getStNumder());
				System.out.println(s.getName());
				System.out.println(s.getKor());
				System.out.println(s.getEng());
				System.out.println(s.getMath());
				System.out.println(s.getGrade());
			}
			break;
		case 4: 
			System.out.println("프로그램 종료");
			System.exit(1);
		}
	}
	
	
}
}
