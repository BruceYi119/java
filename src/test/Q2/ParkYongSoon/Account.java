package test.q2.ParkYongSoon;

import java.util.ArrayList;
import java.util.Scanner;

//comment : Account클래스의 용도는 계좌에 대한 정보(데이터)를 담고, 필요시 데이터를 제공하거나 세팅하는 용도입니다
//comment : 그외의 기능은
//comment : 이번 과제에서는 BankApplication.java에서 기술하시는 것을 권해요

public class Account {

	//comment : 필드가 많아질 경우   해당 필드가 무엇을 다루기 위한 것인지 주석을 달아주셔요
	//comment : 아래 코드를 보면  id만 모아서 list로 관리
	//comment : name만 보아서 list로 관리
	//comment : money만 보아서 list로 관리로  하고 있네요
	
	//comment : 이 Account클래스는  DB와 연동시에는
	//comment : DB의 account테이블에서  데이터를 받거나 입력할 때
	//comment : 프로그램에서 사용하기위해서 만드는 클래스가 되어집니다
	//comment : 그렇게 되면 id는 id컬럼, name은 name컬럼으로, money는 money컬럼과 대칭되어질 수 있어요
	//comment : 계좌조회시  select id컬럼,name컬럼,money컬럼 으로  
	//comment : 쿼리결과를 받게되면
	//comment : 우리는  행(row,record)단위로 받아서(ResultSet) 처리하게 되므로
	//comment : DB연동시에는  아래 코드형태가 불편해질 수 있어요
	ArrayList<String> id = new ArrayList();
	ArrayList<String> name = new ArrayList();
	ArrayList<Integer> money = new ArrayList();
	
	 int opt;
	
	 String fadeId;
	 String fadeName;
	 int fadeMoney;
	
	 String check_id;
	int changeMoney;
	//private int resultMoney;
	
	//comment : 메서드에도 메서드 기능을 주석으로 적어주세요
	void startScreen()
	{
		//resultMoney = 0;
		
		System.out.print("1.계좌생성 | ");
		System.out.print("2.계좌목록 | ");
		System.out.print("3.예금 | ");
		System.out.print("4.출금 | ");
		System.out.println("5.종료");
		System.out.println("--------------------------------------------------");
	    option();
	}
	
	
	void option()
	{
	   System.out.print("선택 > ");
	   Scanner sc = new Scanner(System.in);
	   opt = sc.nextInt();
	   System.out.println("--------------------------------------------------");
	 
	   if(opt == 1)
	      {
		   System.out.println("계좌생성");
		   System.out.println("------------------------------------");
		   System.out.print("계좌번호 : ");
		   fadeId = sc.next(); 
		   id.add(fadeId);
		   
		   //System.out.println();
		   System.out.print("계좌주 : ");
		   fadeName = sc.next();
		   name.add(fadeName);
		   
		   
		   //System.out.println("");
		   System.out.print("초기입금액 : ");
		   fadeMoney = sc.nextInt();
		   money.add(fadeMoney);
		   
		   
		   System.out.println();
		   System.out.println("결과 : 계좌가 생성되었습니다.");
		   
		   startScreen();
	      }
	   
	   else if(opt==2)
	      {
		    System.out.println("계좌목록");
		    System.out.println("--------------------------------------------------");
		    for(int i = 0; i<id.size();i++)
		      {
		    	  System.out.print(id.get(i)+"\t");
		    	  System.out.print(name.get(i)+"\t");
		    	  System.out.print(money.get(i)+"\n");
		      }
		    startScreen();
	      }
	      
	   else if(opt==3)
	      {
		   System.out.println("예금");
		   System.out.println("--------------------------------------------------");
		   
		   System.out.print("계좌번호 : ");
		   check_id= sc.next();
		   System.out.println();
		   
		   System.out.print("예금액 : ");
		   changeMoney= sc.nextInt();
		   
		   for(int i = 0; i<id.size(); i++)
		    {
			   if(id.get(i).equals(check_id) )
			   {
				   money.set(i,money.get(i) + changeMoney);
				   System.out.println("예금이 성공되었습니다.");
			   }
			   else
			   {
				   //System.out.println("계좌번호 오류");
			   }
		    }
		   startScreen();
	      }
	   
	   else if(opt==4)
	      {
		   System.out.println("출금");
		   System.out.println("--------------------------------------------------");
		   
		   System.out.print("계좌번호 : ");
		   check_id= sc.next();
		   System.out.println();
		   
		   System.out.print("출금액 : ");
		   changeMoney= sc.nextInt();
		   
		   for(int i = 0; i<id.size(); i++)
		    {
			   if(id.get(i).equals(check_id) )
			   {
				   money.set(i,money.get(i) - changeMoney);
				   System.out.println("출금이 성공되었습니다.");
			   }
			   else
			   {
				   //System.out.println("계좌번호 오류");
			   }
		    }
		    startScreen();
		    //System.out.println();
	      }
		
	   else if(opt ==5)
	   {
		   System.out.println("프로그램 종료");
		   return;
	   }
	   
	   
	   
	}
}

