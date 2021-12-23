public class Main {

    public static void main(String[] args) {
        double value1 = 100.0d;
        double value2 = 50.0d;
        double result = 0.0d;
        char newCode = 'a';


        if(newCode == 'a')
            result = value1 + value2;
        else if(newCode == 's')
            result = value1 - value2;
        else if(newCode == 'm')
            result = value1 * value2;
        else if (newCode == 'd')
            result = value1 / value2;
        else
            result = 0.0d;

        System.out.println(result);
    }
}
