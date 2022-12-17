package Day_05;

import java.util.Scanner;

public class Day_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		// 뭘만들거냐 아이디 비밀번호 입력받기
		
		System.out.println("소신에 오신것을 환영합니다.");
		
		String ID ;
		 // ID 생성 단계
			
			// 1. 아이디 생성 + 확인
			System.out.print("생성하실 아이디를 입력해 주세요 : ");
			ID = sc.nextLine();
			
				//확인단계
			System.out.print("\n 입력하신 아이디는 ");
			System.out.print(ID);
			System.out.print(" 입니다 ^^7 \n");
		
		//비밀번호 생성
		String PW ;
			System.out.print("생성하실 비밀번호를 입력해 주세요 : ");
			PW = sc.nextLine();
			
			//확인단계
			System.out.print("\n 입력하신 비밀번호는 : ");
			System.out.print(PW);
			System.out.print(" 입니다 ^^7 \n");
			
		// 아이디 비밀번호 재확인
			String ID2 ;
			System.out.print("아이디를 입력해 주세요 : ");
			ID2 = sc.nextLine();
			
			String PW2 ;
			System.out.print("비밀번호를 입력해 주세요 : ");
			PW2 = sc.nextLine();
			
			if (ID2.equals(ID))
					{
					System.out.println("아이디가 일치합니다.");
					if (PW.equals(PW2))
						{
						System.out.println("비밀번호가 일치합니다.");
						}
					else if (true)
					{
						System.out.println("비밀번호가 일치하지 않습니다. 강제종료");
						System.exit(0);
					}
					
					}
			
			else
			{
				System.out.println("아이디가 불일치합니다. 시스템 강제 종료");
				System.exit(0);
			}
			System.exit(0);
			
			
			
	}

}
