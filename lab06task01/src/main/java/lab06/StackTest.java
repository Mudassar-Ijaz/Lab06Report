package lab06;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack;
        stack = new ArrayStack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30); 

        int result = stack.pop();
        System.out.println("Popped value: " + result);

        if (result == 30) {
            System.out.println("Test Passed: pop() returned 30 as expected");
        } else {
            System.out.println("Test Failed");
        }
    }
}