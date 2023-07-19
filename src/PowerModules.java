import java.util.Scanner;

public class PowerModules {
    public static void main(String[] args) {

                Scanner sc=new Scanner(System.in);
                int number=sc.nextInt();
                int power=sc.nextInt();
                int modulo=sc.nextInt();
                System.out.println(findPowerModulo(number,power,modulo));
    }
    public static int findPowerModulo(int number,int power,int modulo)
    {
        int result=1;
        for(int i=0;i<power;i++)
        {
            result=number%modulo;
        }
        return result;
    }
}
