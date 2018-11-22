import java.util.Scanner;

class Print{
   public static void main(String[] args){
   
      System.out.println("2,3,5,7의 배수를 제외한 수를 한 행에 5개씩 출력");
      int five=1;
      
      for(int i=1;i<=100;i++){
         
         if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0){
            // 2의 배수도 아니고 3의 배수도, 5, 7의 배수도 아니어야 함
            System.out.print(i+" ");
            five++;
         }
         
         
         if(five%6==0){
            System.out.println();
            five=1;
            /* 5번에 한 번씩 줄바꾸기 위해 1->6->1->6
            만약 5->0->5->0 이면 0도 5의 배수라서 계속 줄바뀜 ㅠ */
         }
      }
      
      System.out.println();
      
      System.out.println("소수를 출력");
   
      for(int i=1;i<=100;i++){
         int k=0;
         
         for(int j=1;j<=i;j++){
         
            if(i%j==0)
               k++;
         }
         
         if(k==2) // 소수는 자기 자신과 1만 약수인 수
            System.out.print(i+" ");
      }
   }
}