public class Exercises {
    public static void main(String[] args) {

        System.out.println("Hello World");
        String var = "Hello World";
        System.out.println(var);

        Exercises.print("RiRi");
        Exercises.returntype("Hello World");

        System.out.println(Exercises.twoints(5 , 2, true));
    }
    public static void print(String input)
{
    System.out.println(input);
}


    public static String returntype(String input)
    {
        System.out.println(input);
        return (input);

    }

    public static int twoints(int a, int b, boolean c) {
        if (c == true) {
            return a + b;

        } else
            return a * b;
        if (a||b = 0){
            System.out.println("a = [" + a + "], b = [" + b + "], c = [" + c + "]");
        }
    }

}
