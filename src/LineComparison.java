import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        LengthProduce input = new LengthProduce();
        input.lengthproduce();
        LengthCalculate cal = new LengthCalculate();
        cal.Lengthcal();
        CompareLength compare = new CompareLength();
        compare.checkEquality();
    }
}
class LengthProduce{
    public static int x1,x2,y1,y2,x3,x4,y3,y4;
    public  void lengthproduce() {
        Scanner sc = new Scanner(System.in);
        System.out.println("For given line");
        System.out.println("Enter co-ordinates of x1 and y1");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.println("Enter co-ordinates of x2 and y2");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        System.out.println("For second line");
        System.out.println("Enter co-ordinates of x3 and y3");
        x3 = sc.nextInt();
        y3 = sc.nextInt();
        System.out.println("Enter co-ordinates of x4 and y4");
        x4 = sc.nextInt();
        y4 = sc.nextInt();
    }
}
class LengthCalculate{
    static Double length1,length2;
    public void Lengthcal() {
        length1 = Math.sqrt((LengthProduce.x2 - LengthProduce.x1) * (LengthProduce.x2 - LengthProduce.x1) + (LengthProduce.y2 - LengthProduce.y1) * (LengthProduce.y2 - LengthProduce.y1));
        System.out.println("Length of first line = "+length1+" units");
        length2 = Math.sqrt((LengthProduce.x4 - LengthProduce.x3) * (LengthProduce.x4 - LengthProduce.x3) + (LengthProduce.y4 - LengthProduce.y3) * (LengthProduce.y4 - LengthProduce.y3));
        System.out.println("Length of second line = "+length2+" units");
    }
}
class CompareLength{
    public  void checkEquality() {
        if(LengthCalculate.length1.compareTo(LengthCalculate.length2) == 1) {
            System.out.println("Line1 is greater than line2 in length");
        }
        else if (LengthCalculate.length1.compareTo(LengthCalculate.length2) == -1) {
            System.out.println("Line1 is less than line2 in length");
        }
        else {
            System.out.println("Both lines are EQUAL in length");
        }
    }
}
    
