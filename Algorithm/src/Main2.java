
import java.util.Scanner;

public class Main2 {
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n , m;
      n=sc.nextInt();
      m=sc.nextInt();
      String[] array = new String[n];
      String result ="";
      int hd=0;
      
      for(int i =0; i<n; i++){
         array[i]= sc.next();
      }
      
      for(int i =0; i<m; i++){
         int a =0, t =0, g =0,c=0;
         int distance;
         for(int j =0; j<n;j++){
            switch(array[j].charAt(i)){
            case 'A':
               a++ ; break;
            case 'T':
               t++; break;
            case 'G':
               g++; break;
            case 'C':
               c++; break;
            }
         }
         
      
         distance=Math.max(a,Math.max(t,Math.max(g,c)));
         if(distance == 1||distance==a){
            result+='A';
            
         }else if (distance==c){
            result+='C';
               
         }else if (distance==g){
            result+='G';
               
         }else if (distance==t){
            result+='T';
               
         }
         hd += n-distance;
         
         
         
      }
      System.out.println(result+"\n"+hd);
   }

}