
class Calculator
{
    int a;

    public int add (int n1, int n2)
    {
        int r = n1 + n2;
        return r;
    }
}

class democlass {
    public static void main (String []args) {

        int a = 10;
        int b = 20;

            Calculator calc = new Calculator();
            int result = calc.add(a, b);
            System.out.println("The result is: " + result);
    }
}