/*
1. 문자열을 매개변수로 받아 역순 문장을 출력하는 메소드
2. 문자열을 매개변수로 받아 역순 문장을 반환하는 메소드
3. 통장 클래스 만들기
   필드 : 잔고, private int money; (잔고)
   메소드 :
    - money에 대한 setter, getter
    - 저금()
    - 출금()
4. 비번 일치 여부 판단하는 메소드
   - 비번은 메소드 안에 정의가 되어있음
   - 매개변수로 문자열을 받고, 그 문자열이 비번과 일치하는 지를 판단하고, 그 결과를 반환
*/

import java.util.Scanner;


class Account{
	private int money;
	
	void setMoney(int m){
		if(m<0) money = -m;
		else money = m;
	}
	
	int getMoney(){
		return money;
	}
	
	void save(int howmany){
		money += howmany;
		System.out.printf("%d원을 저금하셔서 현재 잔액 %d원입니다. \n",howmany,money);
	}
	
	void spend(int wow){
		money -= wow;
		System.out.printf("%d원을 출금하셔서 현재 잔액 %d원입니다. \n",wow,money);
	}
}

class AccountTest{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		Account mine = new Account();
		
		
		System.out.print("현재 잔액 : ");
		mine.setMoney(s.nextInt());
		
		mine.save((int)(Math.random()*100001+10000));
		mine.spend((int)(Math.random()*100001+10000));
		
	}
}