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
        loginUser(input);
        calculateClassPassingStatus(input);
        recommendingActivitiesBasedOnAirTemperature(input);
        sortingFromLargestToSmallest(input);
        findingHoroscope(input);
        calculateFlightTicketPrice(input);

    }

    public static void calculateFlightTicketPrice(Scanner input) {
        System.out.println("- Welcome to Flight Ticket Price Calculation Program - ");

        System.out.print("Enter the distance in km: ");
        int km = input.nextInt();
        while (km <= 0) {
            System.out.println("Invalid value...");
            System.out.print("Enter the distance in km: ");
            km = input.nextInt();
        }

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        while (age <= 0) {
            System.out.println("Invalid value...");
            System.out.print("Enter your age: ");
            age = input.nextInt();
        }

        System.out.print("Enter the type of trip (1 => One Way, 2 => Round Trip): ");
        int tripType = input.nextInt();
        while (tripType != 1 && tripType != 2) {
            System.out.println("Invalid value...");
            System.out.print("Enter the type of trip (1 => One Way, 2 => Round Trip): ");
            tripType = input.nextInt();
        }

        double flightPrice = km * 0.10;

        if (age < 12) {
            flightPrice = flightPrice - (flightPrice / 2);
        } else if (age <= 24) {
            flightPrice = flightPrice - (flightPrice * 0.10);
        } else if (age >= 65) {
            flightPrice = flightPrice - (flightPrice * 0.30);
        }
        if (tripType == 2) {
            flightPrice = (flightPrice - (flightPrice * 0.20)) * 2;
        }

        System.out.println("Total Amount: " + flightPrice);
    }

    public static void findingHoroscope(Scanner input) {
        System.out.println("- Welcome to Horoscope Finding Program - ");

        System.out.print("Month you born: ");
        int month = input.nextInt();

        System.out.print("Day you born: ");
        int day = input.nextInt();

        if ((day >= 21 && day <= 31 && month == 3) || (day >= 1 && day <= 20 && month == 4)) {
            System.out.println("Aries");
        } else if ((day >= 21 && day <= 30 && month == 4) || (day >= 1 && day <= 21 && month == 5)) {
            System.out.println("Taurus");
        } else if ((day >= 22 && day <= 31 && month == 5) || (day >= 1 && day <= 22 && month == 6)) {
            System.out.println("Gemini");
        } else if ((day >= 23 && day <= 30 && month == 6) || (day >= 1 && day <= 22 && month == 7)) {
            System.out.println("Cancer");
        } else if ((day >= 23 && day <= 31 && month == 7) || (day >= 1 && day <= 22 && month == 8)) {
            System.out.println("Leo");
        } else if ((day >= 23 && day <= 31 && month == 8) || (day >= 1 && day <= 22 && month == 9)) {
            System.out.println("Virgo");
        } else if ((day >= 23 && day <= 30 && month == 9) || (day >= 1 && day <= 22 && month == 10)) {
            System.out.println("Libra");
        } else if ((day >= 23 && day <= 31 && month == 10) || (day >= 1 && day <= 21 && month == 11)) {
            System.out.println("Scorpio");
        } else if ((day >= 22 && day <= 30 && month == 11) || (day >= 1 && day <= 21 && month == 12)) {
            System.out.println("Sagittarius");
        } else if ((day >= 22 && day <= 30 && month == 12) || (day >= 1 && day <= 21 && month == 1)) {
            System.out.println("Capricorn");
        } else if ((day >= 22 && day <= 30 && month == 1) || (day >= 1 && day <= 19 && month == 2)) {
            System.out.println("Aquarius");
        } else if ((day >= 20 && day <= 30 && month == 2) || (day >= 1 && day <= 20 && month == 3)) {
            System.out.println("Pisces");
        } else {
            System.out.println("Not a valid date...");
        }
    }

    public static void sortingFromLargestToSmallest(Scanner input){
        System.out.println("- Sorting from Largest to Smallest System -");

        int temp;

        System.out.print("Enter 1. Number: ");
        int number1 = input.nextInt();

        System.out.print("Enter 2. Number: ");
        int number2 = input.nextInt();

        System.out.print("Enter 3. Number: ");
        int number3 = input.nextInt();

        if (number1 < number2) {
            temp = number1;
            number1 = number2;
            number2 = temp;
        }

        if (number1 < number3) {
            temp = number1;
            number1 = number3;
            number3 = temp;
        }

        if (number2 < number3) {
            temp = number2;
            number2 = number3;
            number3 = temp;
        }

        System.out.println("SORTED NUMBERS: " + number1 + ", " + number2 + ", " + number3);
    }

    public static void recommendingActivitiesBasedOnAirTemperature(Scanner input) {
        System.out.println("- Recommending Activities Based on Air Temperature System -");

        System.out.print("Enter the Heat: ");
        int heat = input.nextInt();

        if (heat < 5) System.out.println("SKI");
        if (heat >= 5 && heat < 15) System.out.println("CINEMA");
        if (heat >= 15 && heat < 25) System.out.println("PICNIC");
        if (heat >= 25) System.out.println("SWIMMING");

    }

    public static void calculateClassPassingStatus(Scanner input) {
        System.out.println("- Calculating Class Passing Status System -");

        int validLessonCount = 0;
        int total = 0;

        System.out.print("Math Grade: ");
        int math = input.nextInt();
        if (math > 0 && math < 100) {
            validLessonCount++;
            total += math;
        }

        System.out.print("Physics Grade: ");
        int physics = input.nextInt();
        if (physics > 0 && physics < 100) {
            validLessonCount++;
            total += physics;
        }

        System.out.print("Turkish Grade: ");
        int turkish = input.nextInt();
        if (turkish > 0 && turkish < 100) {
            validLessonCount++;
            total += turkish;
        }

        System.out.print("Chemistry Grade: ");
        int chemistry = input.nextInt();
        if (chemistry > 0 && chemistry < 100) {
            validLessonCount++;
            total += chemistry;
        }

        System.out.print("Music Grade: ");
        int music = input.nextInt();
        if (music > 0 && music < 100) {
            validLessonCount++;
            total += music;
        }

        double avg = (double) total / validLessonCount;

        if (avg >= 55) {
            System.out.println("You passed the class!\nYour GPA: " + avg);
        } else {
            System.out.println("You failed the class!\nYour GPA: " + avg);
        }


    }

    public static void loginUser(Scanner scanner) {
        System.out.println("- Welcome to User Login System -");

        // Create profile
        System.out.println("- Create Your Profile -");
        System.out.print("Enter a username: ");
        String username = scanner.nextLine().trim();
        System.out.print("Enter a password: ");
        String password = scanner.nextLine().trim();

        // Login attempt
        System.out.println("\n- Login to Your Profile -");
        System.out.print("Username: ");
        String enteredUsername = scanner.nextLine().trim();
        System.out.print("Password: ");
        String enteredPassword = scanner.nextLine().trim();

        // Check credentials
        if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
            System.out.println("Login successful! Welcome to your profile.");
        } else {
            System.out.println("Incorrect username or password.");
            System.out.println("Forgot password?\n1. YES\n2. NO");

            try {
                int choice = Integer.parseInt(scanner.nextLine().trim());
                if (choice == 1) {
                    System.out.print("Enter a new password: ");
                    String newPassword = scanner.nextLine().trim();

                    while (newPassword.equals(password)) {
                        System.out.println("You cannot use your old password. Choose a different one:");
                        newPassword = scanner.nextLine().trim();
                    }

                    System.out.println("Password reset successful! Welcome to your profile.");
                } else {
                    System.out.println("Exiting. See you!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Exiting.");
            }
        }
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