import java.util.*;
class calculator{
    public static void sum(int a,int b){
        int c=a+b;
        System.out.println("add of two num is : " + c);
    }
    public static void sub(int a,int b){
        int c=a-b;
        System.out.println("sub of two num is : " + c);
    }
    public static void mul(int a,int b){
        int c=a*b;
        System.out.println("mul of two num is : " + c);
    }
    public static void div(int a,int b){
        int c=a/b;
        System.out.println("div of two num is : " + c);
    }
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the first operands :");
    int a=sc.nextInt();
    System.out.print("enter the second operands :");
    int b=sc.nextInt();
    System.out.print("select the operator + - * / : ");
    char operator=sc.next().charAt(0);
    switch(operator){
        case '+' :
            sum(a,b);
        break ;
        case '-' :
            sub(a,b);
        break ;
        case '*' :
            mul(a,b);
        break ;
        case '/' :
            div(a,b);
        break ;
    }
    }
}