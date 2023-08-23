  import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) throws Exception {


        String[] z = {"+", "-", "/", "*"};
        String[] Zn = {"\\+", "-", "/", "\\*"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ввод:");

        String ex = scanner.nextLine();

        int index = -1;
        for (int i = 0; i < z.length; i++) {

            if (ex.contains(z[i])) {
                index = i;
                break;}
        }

            if (index == -1){
            throw new Exception();
        }

        String[] num = ex.split(Zn[index]);
            if (num.length > 2){
            throw new Exception();
        }
        int a,b;
        a = Integer.parseInt(num[0]);
            if (a > 10 | a < 0){
            throw new Exception();
        }
        b = Integer.parseInt(num[1]);
            if (b > 10 | b < 0){
            throw new Exception();
        }
            if (ex.length() > 5){
            throw new Exception();
        }
            if (ex.length() == 5 && a != 10 | b != 10){
            throw new Exception();
        }
            if (ex.length() == 4 && a < 10 && b < 10){
            throw new Exception();
        }

        int c;

        switch (z[index]){
            case "+":
                c = a+b;
                break;
            
            case "-":
                c = a-b;
                break;
            
            case "/":
                c = a/b;
                break;
            
            case "*":
                c = a*b;
                break;
            
            default:
            
                throw new Exception();
        }
        System.out.print("Вывод:\n"+c);
    }
}
