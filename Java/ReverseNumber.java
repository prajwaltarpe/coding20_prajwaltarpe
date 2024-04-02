import java.util.Scanner;
class ReverseNumber
{
    public static void main(String[]args){
        int n,r;
        System.out.print("Enter any Number");
        Scanner ref = new Scanner (System.in);
        n=ref.nextInt();

        while (n>0)
        {
            r = n%10;
            System.out.print(r);
            n = n/10;
        }  

    }
}
