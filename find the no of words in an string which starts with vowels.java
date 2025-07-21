// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        String s;
        Scanner sc =new Scanner(System.in);
        s=sc.nextLine();
        String []w=s.split(" ");
        int c=0;
        for(int i=0;i<w.length;i++){
            char a =w[i].charAt(0);
            if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
                c++;
            }
        }
        System.out.println(c);
    }
}
