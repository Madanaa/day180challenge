import java.util.Scanner;

public class MirthulPartha {
      static int time(int R, int P) {
            return (P*(P+1)/2) * R;
      }
      static boolean mintym(int P,int cooks,int ranks[],int M){
            int mintime,j=0,tm=0,i=1;
            while(P--> 0)
            {
                  if(time(ranks[j],i)<M) {
                        i++;
                        M--;

                  }
                  else {
                        j++;
                        if(j==cooks)
                        return false;
                        i=1; tm=0;
                  }
            }
            return true;
      }
      static int calc(int par,int cooks,int ranks[]){
            int s=time(ranks[0],1),e=time(ranks[cooks-1],par),m,ans = 0;
            while(s<=e){
                  m=(s+e)/2;
                  if(mintym(par,cooks,ranks,m)) {
                        ans=m; e=m-1;
                  }
                  else s=m+1;
            }
            return ans-1;
      }

      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int p = scanner.nextInt();
            int c = scanner.nextInt();
            int [] rank = new int[c];
            for (int i = 0; i < c; i++) {
                  rank[i] = scanner.nextInt();
            }
            System.out.println(calc(p,c,rank));
      }
}
