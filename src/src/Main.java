import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        findTranspose();

        findFrequency();
        sortMinToMax(input);
        findRepeatingNumbersInArray();
        printLettesWithMultidimensionalArrays();
        findMinAndMaxArray(input);
        findAverageOfElements();

        //OOP//

        //===== SALARY SYSTEM =====//

        Employee employee1 = new Employee("Kemal", 2000, 45, 1985);
        System.out.println("Adı: " + employee1.name);
        System.out.println("Maaşı: " + employee1.salary);
        System.out.println("Çalışma Saati: " + employee1.workHours);
        System.out.println("Başlangıç Yılı: " + employee1.hireYear);
        System.out.println("Vergi: " + employee1.tax(employee1.salary));
        System.out.println("Bonus: " + employee1.bonus(employee1.workHours));
        System.out.println("Maaş Artışı: " + employee1.raiseSalary(employee1.hireYear, employee1.salary));
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + employee1.totalSalary);
        System.out.println("Toplam Maaş: " + employee1.totalSalaryWithRaise);


        //===== BOKS =====//

        Fighter marc = new Fighter("Marc" , 15 , 100, 90, 0);
        Fighter alex = new Fighter("Alex" , 10 , 95, 100, 0);
        Ring r = new Ring(marc,alex , 90 , 100);
        r.run();
        System.out.println();

        //===== OGRENCI BILGI SISTEMI =====

        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50,20,40);
        s1.addVerbalExamNote(80,90,70);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100,50,40);
        s2.addVerbalExamNote(70,90,80);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50,20,40);
        s3.addVerbalExamNote(90,90,80);
        s3.isPass();
        System.out.println("=============================");

        /////////////////////////////////////////////////////////////////////////////////////////////////

        modifyNumberRecursively(20,20, false);

        System.out.println();

        System.out.print("Enter to check prime number: ");
        int primeNum = input.nextInt();
        primeNumberRecursively(primeNum, 2);
        if (primeNumberRecursively(primeNum, 2)) System.out.println(primeNum + " is a Prime Number");
        else System.out.println(primeNum + " is not a Prime Number");

        System.out.print("Enter base number: ");
        int base = input.nextInt();
        System.out.print("Enter exponent number: ");
        int exponent = input.nextInt();
        int result = calculatePowerRecursively(base, exponent);
        System.out.println("Result: " + result);

        advancedCalculator(input);

        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
        System.out.println();

        isPalindrome(121);
        fibonacci(input);
        findPrimeNumbers();
        reverseTriangle(input);
        perfectNumber(input);
        findMinAndMax(input);
        findEBOBEKOK(input);
        ATM(input);
        makeDiamondFromStars(input);
        makeTriangleFromStars(input);
        findHarmonicNumbers(input);
        calculateTheSumOfTheDigitsOfANumber(input);
        calculateExponentialNumbers(input);
        calculateFactorial(input);
        findPowersOf2LessThanEnteredNumber(input);
        addTheEvenNumbersAndMultiplesOf4FromEnteredNumbers(input);
        findEvenNumbersUpToEnteredNumber(input);
        calculateLeapYear(input);
        calculateChineseZodiac(input);
        calculateFlightTicketPrice(input);
        findingHoroscope(input);
        sortingFromLargestToSmallest(input);
        recommendingActivitiesBasedOnAirTemperature(input);
        calculateClassPassingStatus(input);
        loginUser(input);
        switchCaseCalculator(input);
        calculateGreenGrocerPrice(input);
        calculateBMI(input);
        calculateAreaAndPerimeterOfCircle(input);
        calculateTaximeter(input);
        calculateHypotenuse(input);
        calculateVAT(input);
        calculateGPA(input);

    }

    public static void findTranspose() {
        int[][] arr = new int[2][3];

        arr[0][0] = 2;
        arr[0][1] = 3;
        arr[0][2] = 4;
        arr[1][0] = 5;
        arr[1][1] = 6;
        arr[1][2] = 7;

        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("- Transpose -");

        // Dimensions of the transposed array
        int rows = arr.length;
        int cols = arr[0].length;
        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                transposed[i][j] = arr[j][i];
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void findFrequency() {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] dontRepeat = new int[arr.length];
        int isRepeated = 0;

        for (int i = 0; i < arr.length; i++) {
            int counter = 1;
            boolean alreadyPrinted = false;
            for (int j = 0; j < isRepeated; j++) {
                if (dontRepeat[j] == arr[i]) {
                    alreadyPrinted = true;  // This number has already been printed
                    break;
                }
            }
            if (!alreadyPrinted) {
                dontRepeat[isRepeated] = arr[i];
                isRepeated++;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] == arr[i]) {
                        counter++;
                    }
                }
                System.out.println(arr[i] + " sayisi " + counter + " kere tekrar edildi.");
            }
        }
    }

    public static void sortMinToMax(Scanner input) {
        System.out.print("Dizinin boyutu n: ");
        int length = input.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.print(i + 1 + ". Eleman: ");
            arr[i] = input.nextInt();

        }

        Arrays.sort(arr);

        // Bubble Sort Algorithm
        /*for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap the elements if they are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        } */

        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void findRepeatingNumbersInArray() {
        int[] array = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1};
        int[] repeatingNumbers = new int[array.length];
        int isRepeated = 0;

        for (int i = 0; i < array.length; i++) {
            // Skip the current element if it's already checked
            boolean alreadyPrinted = false;
            for (int j = 0; j < isRepeated; j++) {
                if (repeatingNumbers[j] == array[i]) {
                    alreadyPrinted = true;  // This number has already been printed
                    break;
                }
            }
            if (!alreadyPrinted) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] == array[i]) {
                        repeatingNumbers[isRepeated] = array[i];
                        isRepeated++;
                        break;
                    }
                }
            }
        }
            System.out.print("Repeating numbers: ");
            for (int i = 0; i < isRepeated; i++) {
                System.out.print(repeatingNumbers[i] + " ");
            }
            System.out.println();
    }
    public static void printLettesWithMultidimensionalArrays() {
        String[][] letter = new String[7][5];

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (i == 0 || i == 3 || i == 6) {
                    letter[i][j] = " * ";
                    letter[0][4] = "   ";
                    letter[3][4] = "   ";
                    letter[6][4] = "   ";
                } else if (j == 0 || j == 4) {
                    letter[i][j] = " * ";
                } else {
                    letter[i][j] = "   ";
                }
            }
        }

        for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static void findMinAndMaxArray(Scanner input){
        int[] list = {56, 34, 1, 8, 101, -2, -33};

        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);

        int[] array = {15,12,788,1,-1,-778,2,0};

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        Arrays.sort(array);

        if (num < array[0]) {
            System.out.println("No smaller number found.");
            System.out.println("Closest larger number: " + array[0]);
        } else if (num > array[array.length - 1]) {
            System.out.println("Closest smaller number: " + array[array.length - 1]);
            System.out.println("No larger number found.");
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] > num) {
                    System.out.println("Closest smaller number: " + array[i - 1]);
                    System.out.println("Closest larger number: " + array[i]);
                    break;
                }
            }
        }
    }

    public static void findAverageOfElements() {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int j : array) {
            sum += j;
        }

        System.out.println("AVG: " + sum / array.length);

        double harSum = 0;

        for (int j : array) {
            harSum += (double) 1 / j;
        }
        System.out.println("Harmonic AVG: " + array.length / harSum);
    }

    public static void modifyNumberRecursively(int temp, int original, boolean addingBack) {
        // Print the current value
        System.out.print(temp + " ");

        // Base case: Stop if we've returned to the original value after adding phase
        if (temp == original && addingBack) {
            return;
        }

        // Recursion: Subtract or add based on the current phase
        if (temp > 0 && !addingBack) {
            // Subtract 5 until temp is 0 or negative
            modifyNumberRecursively(temp - 5, original, false);
        } else {
            // Add 5 until reaching the original number
            modifyNumberRecursively(temp + 5, original, true);
        }
    }

    /*
    *   Explanation
        Additional Parameter (addingBack): This parameter tracks whether we’re in the subtracting phase (false) or the adding phase (true).
        Termination Condition: Only stop if temp == original and we are in the adding phase (addingBack == true), which ensures we have completed both the subtraction and addition phases.

        Recursive Steps:

        Subtracting Phase: If temp > 0 and we’re not in the adding phase, we subtract 5.
        Adding Phase: Once temp is 0 or negative, we start adding 5 until we reach the original number.
        * */

    public static int modifyNumberBySubtractingFive(int num) {
        if(num<=0) {
            return modifyNumberBySubtractingFive(num+5);
        }
        return num;
    }

    public static boolean primeNumberRecursively(int num, int divisor) {
        if (num <= 1) {
            return false;
        }
        if (divisor == num) {
            return true;
        }
        if (num % divisor == 0) {
            return false;
        }
        return primeNumberRecursively(num, divisor + 1);
    }

    public static int calculatePowerRecursively(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * calculatePowerRecursively(base, exponent - 1);
    }


    ////////ADVANCED CALCULATOR/////////////////////////////////////////////////////
    static void advancedCalculator(Scanner input) {
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = input.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    area();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);
    }

    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }

    static void mod() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Mod alinacak sayi değeri giriniz :");
        int num = scan.nextInt();
        System.out.print("Mod değeri giriniz :");
        int mod = scan.nextInt();

        int result = num % mod;

        System.out.println("Sonuç : " + result);
    }

    static void area() {
        Scanner scan = new Scanner(System.in);
        System.out.print("1. kenar uzunlugunu giriniz :");
        int firstSide = scan.nextInt();
        System.out.print("2. kenar uzunlugunu giriniz :");
        int secondSide = scan.nextInt();

        int area = firstSide * secondSide;
        int perimeter = 2 * (firstSide + secondSide);

        System.out.println("Alan: " + area);
        System.out.println("Cevre: " + perimeter);
    }

    ////////////////////////////////////////////////////////////////////////////////////

    public static int fibonacciRecursive(int num) {

        if (num <= 1) {
            return num;
        }
        return fibonacciRecursive(num - 1) + fibonacciRecursive(num - 2);

    }

    public static boolean isPalindrome(int number) {
        int temp = number;
        int reverseNumber = 0;

        while (temp != 0) {
            reverseNumber = (reverseNumber * 10) + (temp % 10);
            temp /= 10;
        }

        boolean isPalindrome = (reverseNumber == number);
        System.out.println(number + (isPalindrome ? " is a Palindrome Number" : " is not a Palindrome Number"));
        return isPalindrome;
    }

    public static void fibonacci(Scanner input) {
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int first = 0;
        int second = 1;
        for (int i = 0; i < num; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println("\n----------------");
    }

    public static void findPrimeNumbers() {

        System.out.print("2 ");

        for (int i = 3; i <= 100; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void reverseTriangle(Scanner input) {
        // *************
        // ***********
        // *********
        // *******
        // *****
        // ***
        // *

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        for (int i = 0; i < num; i++) {
            for (int k = 1; k < 2 * num - 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void perfectNumber(Scanner input) {
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) System.out.println(num + " is a perfect number.");
        if (sum != num) System.out.println(num + " is not a perfect number.");
    }

    public static void findMinAndMax(Scanner input) {
        System.out.print("How many number will you enter: ");
        int numCount = input.nextInt();

        System.out.print("Enter 1. Number: ");
        int num = input.nextInt();
        int min = num;
        int max = num;

        for (int i = 2; i <= numCount; i++) {
            System.out.print("Enter " + i + ". Number: ");
            num = input.nextInt();
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("MIN: " + min);
        System.out.println("MAX: " + max);
    }

    public static void findEBOBEKOK(Scanner input) {
        System.out.print("Enter a number 1: ");
        int num1 = input.nextInt();

        System.out.print("Enter a number 2: ");
        int num2 = input.nextInt();

        int i = 2;
        int ebob = 0;

        while (i <= num1) {
            if (num1 % i == 0 && num2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        System.out.println("EBOB: " + ebob);
        int ekok = (num1 * num2) / ebob;
        System.out.println("EKOK: " + ekok);
    }

    //ATM
    public static void ATM(Scanner input) {
        String userName, password;
        int right = 3;
        int balance = 1500;
        int select = 0;
        while (right > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");

                while (select != 4) {
                    System.out.println("""
                            1-Para yatırma
                            2-Para Çekme
                            3-Bakiye Sorgula
                            4-Çıkış Yap""");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Para miktarı : ");
                            int depositedMoney = input.nextInt();
                            balance += depositedMoney;
                            break;
                        case 2:
                            System.out.print("Para miktarı : ");
                            int withdrawMoney = input.nextInt();
                            if (withdrawMoney > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= withdrawMoney;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case 4:
                            System.out.println("Tekrar görüşmek üzere.");
                            break;
                    }
                }
                break;
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);

                }
            }
        }
    }

    //Make Triangle from stars
    public static void makeTriangleFromStars(Scanner input) {
        System.out.print("Enter a number :");
        int num = input.nextInt();

        for (int i = 0; i <= num; i++) {
            for (int j = 0; j < (num - i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= (2 * i); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }

    //Make a Diamond from stars
    public static void makeDiamondFromStars(Scanner input) {
        //       *
        //      ***
        //     *****
        //    *******
        //   *********
        //  ***********
        // *************
        //  ***********
        //   *********
        //    *******
        //     *****
        //      ***
        //       *

        System.out.print("Enter a number :");
        int num = input.nextInt();

        // Upper part of the diamond
        for (int i = 0; i < num; i++) {
            // Print spaces for the upper part
            for (int j = 0; j < (num - i - 1); j++) {
                System.out.print(" ");
            }
            // Print stars for the upper part
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();  // Move to the next line
        }

        // Lower part of the diamond
        for (int i = num - 2; i >= 0; i--) {
            // Print spaces for the lower part
            for (int j = 0; j < (num - i - 1); j++) {
                System.out.print(" ");
            }
            // Print stars for the lower part
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();  // Move to the next line
        }

    }

    //Program to Find Harmonic Numbers
    public static void findHarmonicNumbers(Scanner input) {
        System.out.println("- Program to Find Harmonic Numbers - ");

        System.out.print("Enter the number: ");
        int num = input.nextInt();
        double sum = 0;

        for (int i = 1; i <= num; i++) {
            if (i == num) {
                System.out.print("1/" + i);
            } else if (i == 1) {
                System.out.print(i + " + ");
            } else {
                System.out.print("1/" + i + " + ");
            }
            sum += ((double) 1 / i);
        }
        System.out.println("\nSum: " + sum);
    }

    //Program to calculate the sum of the digits of a number
    public static void calculateTheSumOfTheDigitsOfANumber(Scanner input) {
        System.out.println("- Calculate the sum of the digits of a number Program - ");

        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int sum = 0;

        while (num != 0) {
            sum = sum + num % 10;
            num = num / 10;
        }

        System.out.println(sum);
    }

    //Calculate Exponential Numbers Program
    public static void calculateExponentialNumbers(Scanner input) {
        System.out.println("- Calculate Exponential Numbers Program - ");

        System.out.print("Enter the value of number: ");
        int num = input.nextInt();
        System.out.print("Enter the value of exponent: ");
        int exp = input.nextInt();

        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result = result * num;
        }
        System.out.println(result);
    }

    //Program to Calculate Factorial
    public static void calculateFactorial(Scanner input) {
        System.out.println("- Calculate Factorial Program - ");

        System.out.print("Enter the value of n (total elements): ");
        int n = input.nextInt();
        System.out.print("Enter the value of r (size of the group): ");
        int r = input.nextInt();

        //C(n,r) = n! / (r! * (n-r)!)

        int result = 1;
        // Calculate n! / (r! * (n - r)!)
        for (int i = 1; i <= r; i++) {
            result *= n--;
            result /= i;
        }
        System.out.println("C(" + n + ", " + r + ") = " + result);
    }

    //Program to Find Powers of 2 Less Than Entered Number
    public static void findPowersOf2LessThanEnteredNumber(Scanner input) {
        System.out.println("- Program to Find Powers of 2 Less Than Entered Number - ");

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        for (int i = 1; i < num; i *= 2) {
            System.out.println("Power of 2: " + i);
        }

        for (int i = 1, j = 1; i < num && j < num; i *= 4, j *= 5) {
            System.out.println("Power of 4: " + i);
            System.out.println("Power of 5: " + j);
        }
    }

    //Program to adds the numbers that are even and multiples of 4 from the entered values
    public static void addTheEvenNumbersAndMultiplesOf4FromEnteredNumbers(Scanner input) {
        System.out.println("- Program to adds the numbers that are even and multiples of 4 from the entered values - ");

        int sum = 0;
        while (true) {
            System.out.println("Enter number (for exit enter 0): ");
            int num = input.nextInt();
            if (num % 4 == 0) sum += num;
            if (num == 0) break;
        }
        System.out.println("Result: " + sum);
    }

    //Program to Find Even Numbers Up to Entered Number
    public static void findEvenNumbersUpToEnteredNumber(Scanner input) {
        System.out.println("- Program to Find Even Numbers Up to Entered Number - ");

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int sum = 0, count = 0;

        System.out.print("Even numbers: ");

        for (int i = 0; i <= num; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i <= num; i += 12) {
            sum = sum + i;
            count++;
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average of numbers divisible by 3 and 4: " + (int) average);
        } else {
            System.out.println("No number found that is divisible by 3 and 4.");
        }

    }

    public static void calculateLeapYear(Scanner input) {
        System.out.println("- Welcome to Leap Year Calculation Program - ");

        System.out.print("Enter the year: ");
        int year = input.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year!");
        } else {
            System.out.println(year + " is not a leap year!");
        }
    }

    public static void calculateChineseZodiac(Scanner input){
        System.out.println("- Welcome to Chinese Zodiac Calculation Program - ");

        System.out.print("Enter your birth year: ");
        int birthYear = input.nextInt();

        birthYear = birthYear % 12;
        System.out.print("Your Chinese Zodiac Sign: ");

        switch (birthYear) {
            case 0:
                System.out.println("Monkey");
                break;
            case 1:
                System.out.println("Rooster");
                break;
            case 2:
                System.out.println("Dog");
                break;
            case 3:
                System.out.println("Pig");
                break;
            case 4:
                System.out.println("Rat");
                break;
            case 5:
                System.out.println("Ox");
                break;
            case 6:
                System.out.println("Tiger");
                break;
            case 7:
                System.out.println("Rabbit");
                break;
            case 8:
                System.out.println("Dragon");
                break;
            case 9:
                System.out.println("Snake");
                break;
            case 10:
                System.out.println("Horse");
                break;
            case 11:
                System.out.println("Goat");
                break;
        }
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