package Algorlism;

public class StackExample {
    static int evaluate(String p){
        int A, B;
        ArrayStack as = new ArrayStack();

        boolean digitPreviously = false;
        for(int i = 0; i<p.length(); i++){
            char ch = p.charAt(i);
            if(Character.isDigit(ch)){
                if(digitPreviously){
                    int temp = as.pop();
                    temp = 10 * temp + (ch - '0');
                    as.push(temp);
                } else as.push(ch - '0');
                digitPreviously = true;
            } else if(isOperator(ch)){
                A = as.pop();
                B = as.pop();
                int val = operation(A,B,ch);
                as.push(val);
                digitPreviously =false;
            } else digitPreviously = false;
        }
        return as.pop();
    }

    private static int operation(int a, int b, char ch){
        int val = 0;
        switch (ch){
            case '+': val = b + a; break;
            case '-': val = b - a; break;
            case '*': val = b * a; break;
            case '/': val = b / a; break;
            case '^': val = (int)Math.pow(b, a); break;
        }
        return val;
    }

    private static boolean isOperator(char ch){
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
    }
    public static void main(String[] args) {
        String postfix = "4 3 2 ^ + 3 -";
        int answer = evaluate(postfix);
        System.out.println(answer);
    }

}
