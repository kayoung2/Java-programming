/*
1. ���ڿ��� �Ű������� �޾� ���� ������ ����ϴ� �޼ҵ�
2. ���ڿ��� �Ű������� �޾� ���� ������ ��ȯ�ϴ� �޼ҵ�
3. ���� Ŭ���� �����
   �ʵ� : �ܰ�, private int money; (�ܰ�)
   �޼ҵ� :
    - money�� ���� setter, getter
    - ����()
    - ���()
4. ��� ��ġ ���� �Ǵ��ϴ� �޼ҵ�
   - ����� �޼ҵ� �ȿ� ���ǰ� �Ǿ�����
   - �Ű������� ���ڿ��� �ް�, �� ���ڿ��� ����� ��ġ�ϴ� ���� �Ǵ��ϰ�, �� ����� ��ȯ
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
		System.out.printf("%d���� �����ϼż� ���� �ܾ� %d���Դϴ�. \n",howmany,money);
	}
	
	void spend(int wow){
		money -= wow;
		System.out.printf("%d���� ����ϼż� ���� �ܾ� %d���Դϴ�. \n",wow,money);
	}
}

class AccountTest{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		Account mine = new Account();
		
		
		System.out.print("���� �ܾ� : ");
		mine.setMoney(s.nextInt());
		
		mine.save((int)(Math.random()*100001+10000));
		mine.spend((int)(Math.random()*100001+10000));
		
	}
}