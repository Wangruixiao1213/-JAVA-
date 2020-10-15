import java.util.Scanner;
public class Triangle {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("输入三个数:");
        double a = myScanner.nextDouble();
        double b = myScanner.nextDouble();
        double c = myScanner.nextDouble();
        if((a>0)&&(b>0)&&(c>0)&&(a+b>c)&&(a+c>b)&&(b+c>a)){
            double p = (a + b + c)/2;
            double square = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.println("是三角形,且面积为:"+ square);
        }
        else{
            System.out.println("不是三角形");
        }
    }

}