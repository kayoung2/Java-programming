import java.util.Scanner;

class Print{
   public static void main(String[] args){
   
      System.out.println("2,3,5,7�� ����� ������ ���� �� �࿡ 5���� ���");
      int five=1;
      
      for(int i=1;i<=100;i++){
         
         if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0){
            // 2�� ����� �ƴϰ� 3�� �����, 5, 7�� ����� �ƴϾ�� ��
            System.out.print(i+" ");
            five++;
         }
         
         
         if(five%6==0){
            System.out.println();
            five=1;
            /* 5���� �� ���� �ٹٲٱ� ���� 1->6->1->6
            ���� 5->0->5->0 �̸� 0�� 5�� ����� ��� �ٹٲ� �� */
         }
      }
      
      System.out.println();
      
      System.out.println("�Ҽ��� ���");
   
      for(int i=1;i<=100;i++){
         int k=0;
         
         for(int j=1;j<=i;j++){
         
            if(i%j==0)
               k++;
         }
         
         if(k==2) // �Ҽ��� �ڱ� �ڽŰ� 1�� ����� ��
            System.out.print(i+" ");
      }
   }
}