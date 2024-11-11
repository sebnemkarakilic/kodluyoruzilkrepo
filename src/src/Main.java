import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        calculateGPA(input);
        calculateVAT(input);
        calculateHypotenuse(input);
        calculateTaximeter(input);
        calculateAreaAndPerimeterOfCircle(input);
        calculateBMI(input);
        calculateGreenGrocerPrice(input);
        switchCaseCalculator(input);
    }

    public static void switchCaseCalculator(Scanner input){
        System.out.println("- Welcome to Switch Case Calculator -");

        int result;
        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = input.nextInt();

        System.out.println("1. Addition\n2. Deletion\n3. Division\n4. Multiplication");
        System.out.print("Select: ");
        int select = input.nextInt();

        switch (select) {
            case 1: result = firstNumber+secondNumber;
                System.out.print("Result of addition: " + result);
                break;
            case 2: result = firstNumber-secondNumber;
                System.out.print("Result of deletion: " + result);
                break;
            case 3: result = firstNumber/secondNumber;
                System.out.print("Result of division: " + result);
                break;
            case 4: result = firstNumber*secondNumber;
                System.out.print("Result of multiplication: " + result);
                break;
            default: System.out.print("Invalid choice!");
        }
    }

    public static void calculateGreenGrocerPrice(Scanner input) {
        System.out.println("- Hello -");

        System.out.print("How Many Kilos Pear: ");
        double pearPrice = input.nextDouble() * 2.14;

        System.out.print("How Many Kilos Apple: ");
        double applePrice = input.nextDouble() * 3.67;

        System.out.print("How Many Kilos Tomato: ");
        double tomatoPrice = input.nextDouble() * 1.11;

        System.out.print("How Many Kilos Banana: ");
        double bananaPrice = input.nextDouble() * 0.95;

        System.out.print("How Many Kilos Eggplant: ");
        double eggplantPrice = input.nextDouble() * 5;

        double totalPrice = pearPrice + applePrice + tomatoPrice + bananaPrice + eggplantPrice;

        System.out.println("Total Price: " + totalPrice);

    }

    public static void calculateBMI(Scanner input) {
        System.out.println("- Hello -");
        System.out.print("Please enter your height (in meters): ");
        double height = input.nextDouble();
        System.out.print("Please enter your weight: ");
        double weight = input.nextDouble();

        double BMI = weight / (height * height);

        System.out.println("BMI: " + BMI);
    }

    public static void calculateAreaAndPerimeterOfCircle(Scanner input) {
        System.out.println("- Hello -");
        System.out.print("Radius of Circle: ");
        double radius = input.nextDouble();

        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;

        System.out.println("Area of the Circle: " + area);
        System.out.println("Perimeter of the Circle: " + perimeter);

        System.out.print("Angle of Circle Slice: ");
        double angle = input.nextDouble();

        double areaOfCircleSlice = area * angle / 360;

        System.out.println("Area of the slice: " + areaOfCircleSlice);

    }

    public static void calculateTaximeter(Scanner input) {
        System.out.println("- Hello -");
        System.out.print("How many kilometers did you travel: ");
        double km = input.nextDouble();
        double price = 10 + km * 2.20;
        price = price < 20 ? 20 : price;

        System.out.println("Total Price: " + price);
    }

    public static void calculateHypotenuse(Scanner input) {
        System.out.println("- Hello -");
        System.out.print("Enter 1. Side of triangle: ");
        double firstSide = input.nextDouble();
        System.out.print("Enter 2. Side of triangle: ");
        double secondSide = input.nextDouble();

        double hypotenuse = Math.sqrt((firstSide * firstSide) + (secondSide * secondSide));
        System.out.println("Hypotenuses = " + hypotenuse);

    }

    public static void calculateVAT(Scanner input) {
        System.out.println("- Hello -");
        boolean success = false;
        while (!success) {
            try {
                System.out.print("Enter price of your product: ");
                double price = input.nextDouble();
                double vat = price > 1000 ? price * 0.8 : price * 0.18;
                double totalPrice = price + vat;

                System.out.println("VAT: " + vat);
                System.out.println("PRICE WITH VAT: " + totalPrice);
                success = true;
            } catch (Exception e) {
                System.out.println("Please enter a valid price!");
                input.nextLine(); // Clear the invalid input
            }
        }
    }

    public static void calculateGPA(Scanner input) {

        System.out.println("- Hello -\nTo calculate your GPA, enter your grades from the courses below ↴");

        boolean success = false;

        while (!success) {
            try {
                System.out.print("Math Grade: ");
                int math = input.nextInt();

                System.out.print("Physics Grade: ");
                int physics = input.nextInt();

                System.out.print("Chemistry Grade: ");
                int chemistry = input.nextInt();

                System.out.print("Turkish Grade: ");
                int turkish = input.nextInt();

                System.out.print("History Grade: ");
                int history = input.nextInt();

                System.out.print("Music Grade: ");
                int music = input.nextInt();

                int GPA = (math + physics + chemistry + turkish + history + music) / 6;

                System.out.println("-- GPA: " + GPA + " --");
                success = true;
            } catch (Exception e) {
                System.out.println("Please enter a valid note!");
                input.nextLine(); // Clear the invalid input
            }
        }
    }
}