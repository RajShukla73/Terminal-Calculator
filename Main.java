import java.util.*;
class Main{
    public static void main(String[] args){
        //Calculator menu
        String[] menu = {
            "Addition",
            "Subtraction",
            "Multiplication",
            "Division",
            "Exit"
        };
        
        Scanner sc = new Scanner(System.in);

        //Keep the calculator running until user selects Exit
        while (true){
            //Display menu
            System.out.println("\n==== Calculator ====");
            for(int i = 0; i < menu.length; i++){
                System.out.println((i + 1)+"."+menu[i]);
            }
            
            //Take user's chice
            System.out.print("Enter your choice:");
            int choice = sc.nextInt();
            
            //Clear the leftover newline
            sc.nextLine();
            //Perform operation according to user's choice    
            switch(choice){
                case 1:{
                    System.out.println("You Selected Additon");
                    double[] numbers = getNumbers(sc);
                    CalAddition add = new CalAddition();
                    double result = add.calculate(numbers);
                    System.out.println("Result: "+result);
                    break;
                }
            
                case 2:{
                    System.out.println("You Selected Subtraction");
                    double[] numbers = getNumbers(sc);
                    CalSubtraction sub = new CalSubtraction();
                    double result = sub.calculate(numbers);
                    System.out.println("Result: "+result);
                    break;
                }
                case 3:{
                    System.out.println("You Selected Multiplication");
                    double[] numbers = getNumbers(sc);
                    CalMultiplication mul = new CalMultiplication();
                    double result = mul.calculate(numbers);
                    System.out.println("Result "+result);
                    break;
                }
                case 4:{
                    System.out.println("You Selected Division");
                    double[] numbers = getNumbers(sc);
                    CalDivision div = new CalDivision();
                    double result = div.calculate(numbers);
                    break;
                }
                case 5:{
                    System.out.println("Exiting Calculator...");
                    sc.close();
                    return;
                }
                default:
                    System.out.println("Invalid choice! Please choose 1-5.");
            }
        }
    }
    //Takes comma-separeted numbers and converts them into a double array
    public static double[] getNumbers(Scanner sc){
        System.out.print("Enter the Numbers Separated by Comma:");
        String input = sc.nextLine();

        //Split input using comma
        String[] num = input.split(".");
        double[] numbers = new double[num.length];

        //Convert each value from String to double
        for(int i = 0; i < num.length; i++){
            numbers[i] = Double.parseDouble(num[i].trim());
        }
        return numbers;
    }
}