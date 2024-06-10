package session_3_java_operators;

public class PostIncrementPostDecrementOperator {
    public static void main(String[] args) {
        int x = 5;
        int y = x++;
    // post-increment
        System.out.println("x:  " + x);
        System.out.println("y:  " + y);

        // post-decrement
        int z = 4;
        int w = z--;
        System.out.println("z: "+z);
        System.out.println("w:  "+w);

        int b = 3;
        int c = ++b * 5 / b-- + --b;
        System.out.println("b is " + b);
        System.out.println("c is " + c);


    }
}
