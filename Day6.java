import java.util.*;
class Calculator{

    int num1;
    int num2;

    Calculator(int a,int b){
        
        this.num1=a;
        this.num2=b;

    }


    public int add(){
        
        return num1+num2;

    }

    
    public int sub(){
        
        return num1-num2;

    }

    
    public int mul(){
        
        return num1*num2;

    }
 
    public float div(){
       
        return (float)num2/num1;

    }
    public int pow(){

        return (int)Math.pow(num1,num2);
    
    }
    public float squarert(){
        return (float)Math.sqrt(num1);
    }
    

   
}

public class Day6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Calculator calc=new Calculator(a,b);
        System.out.println("a+b :"+calc.add());
        System.out.println("a/b :"+calc.div());
        System.out.println("a*b :"+calc.mul());
        System.out.println("a^b :"+calc.pow());
        System.out.println("a√b :"+calc.squarert());

        

        
    }
}
