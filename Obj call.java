// calling a function using Object
import java.util.*;
class Main{
    void Disp(int x){
        System.out.println("No is : "+x);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Main n = new Main();
        n.Disp(x);
    }
}

