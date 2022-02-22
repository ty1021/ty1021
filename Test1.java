import java.util.Scanner;

public class Test1 {
    Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        Test1 test1=new Test1();
        test1.Ssout();
    }
    public void Ssout(){
        System.out.println("请输入学生姓名");
      String name=   scanner.next();
      int sum =0;
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入5门课程中"+(i+1)+"门的成绩");
            int su=scanner.nextInt();
            sum=sum+su;
        }
        System.out.println(name+"平均成绩是"+sum/5);
    }
}

