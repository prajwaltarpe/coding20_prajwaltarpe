import java.util.Scanner;
/**
 * PalindromeNumber
 */
 class PalindromeNumber {
    
    public static void main(String[] args) {
        
        int n,s=0,c,r;
        System.out.println("Enetr any number");
        Scanner ref = new Scanner(System.in);
        n = ref.nextInt();
        c=n;

        while(n>0){

            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        if (c==s) 
            System.out.print(" Pallandrome Number ");
            else
            System.out.print(" Not Pallandrome Number ");
            
        
    }
    
}
