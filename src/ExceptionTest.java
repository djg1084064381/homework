import java.util.Scanner;

public class ExceptionTest
{
    public static void main(String[] args) {
           int age = 190;
//要求范围在 18 – 120 之间，否则抛出一个自定义异常
         if(age >= 20 && age <= 120) {
//这里我们可以通过构造器，设置信息
 System.out.println(age);
            }else {
             try {
                 throw new AgeException("年龄需要在 18~120 之间");

             } catch (AgeException e) {

                 System.out.println( e.getMessage());
             }


         }
        }




    }

class AgeException extends Exception {
    public AgeException(String message) {//构造器
        super(message);
    }
}
