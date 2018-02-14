import java.util.HashMap;
import java.util.Scanner;

public class wunderCalUI {

    //User Input for MAINMENU
    public static final String MAINMENU_BASICMATH = "1";
    public static final String MAINMENU_AREA = "2";
    public static final String MAINMENU_VOLUME = "3";
    public static final String MAINMENU_EXPONENT = "4";
    public static final String MAINMENU_EXIT = "X";
    public static final String MENU_BACK = "B";

    //User Input for BASICMATHMENU
    public static final String BASICMATH_ADDITION = "1";
    public static final String BASICMATH_SUBTRACTION = "2";
    public static final String BASICMATH_MULTIPLICATION = "3";
    public static final String BASICMATH_DIVISION = "4";

    //User Input for AREAMENU
    public static final String AREAMENU_SQUARE = "1";
    public static final String AREAMENU_RECTANGLE = "2";
    public static final String AREAMENU_TRIANGLE = "3";
    public static final String AREAMENU_PARALLELOGRAM = "4";
    public static final String AREAMENU_TRAPEZOID = "5";
    public static final String AREAMENU_CIRCLE = "6";

    //User Input for VOLUMEMENU
    public static final String VOLUMEMENU_CUBE = "1";
    public static final String VOLUMEMENU_RECTANGULARPRISM = "2";
    public static final String VOLUMEMENU_PYRAMID = "3";
    public static final String VOLUMEMENU_CYLINDER = "4";
    public static final String VOLUMEMENU_CONE = "5";
    public static final String VOLUMEMENU_SPHERE = "6";

    //User Input for EXPONENTMENU
    public static final String EXPONENTMENU_SQUARED = "1";
    public static final String EXPONENTMENU_CUBED = "2";
    public static final String EXPONENTMENU_CHOOSE = "3";

    //Tracking Current Menu
    public static final int EXITMENU = -1;
    public static final int MAINMENU = 1;
    public static final int BASICMATHMENU = 2;
    public static final int AREAMENU = 3;
    public static final int VOLUMEMENU = 4;
    public static final int EXPONENTMENU = 5;

    public static void runUI() {

        boolean continueRunning = true;

        int currentMenu = MAINMENU;
        String userInput = "";

        while(continueRunning == true) {
            displayMenu(currentMenu);

            userInput = readUserInput();

            currentMenu = processUserInput(currentMenu, userInput);

            if(currentMenu == -1)
                continueRunning = false;
        }

    }

    public static void displayMainMenu() {

        System.out.println("Please choose an option and select the number that corresponds to your selection.");

        System.out.println("1. Basic Math");
        System.out.println("2. Area");
        System.out.println("3. Volume");
        System.out.println("4. Exponent");

        System.out.println("\nX. Exit Application");

    }

    public static void displayBasicMathMenu() {

        System.out.println("Please choose an option and select the number that corresponds to your selection.");

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.println("\nB. Back to previous menu");

    }

    public static void displayAreaMenu() {

        System.out.println("Please choose an option and select the number the corresponds to your selection.");

        System.out.println("1. Area of a Square");
        System.out.println("2. Area of a Rectangle");
        System.out.println("3. Area of a Triangle");
        System.out.println("4. Area of a Parallelogram");
        System.out.println("5. Area of a Trapezoid");
        System.out.println("6. Area of a Circle");

        System.out.println("\nB. Back to previous menu");

    }

    public static void displayVolumeMenu() {

        System.out.println("Please choose an option and select the number that corresponds to your selection.");

        System.out.println("1. Volume of a Cube");
        System.out.println("2. Volume of a Rectangular Prism");
        System.out.println("3. Volume of a Pyramid");
        System.out.println("4. Volume of a Cylinder");
        System.out.println("5. Volume of a Cone");
        System.out.println("6. Volume of a Sphere");

        System.out.println("\nB. Back to previous menu");

    }

    public static void displayExponentMenu() {

        System.out.println("Please choose an option and select the number that corresponds to your selection.");

        System.out.println("1. Squared");
        System.out.println("2. Cubed");
        System.out.println("3. Choose your own power");

        System.out.println("\nB. Back to previous menu");

    }

    public static void displayMenu(int currentMenu) {

        switch(currentMenu) {
            case MAINMENU:
                displayMainMenu();
                break;
            case BASICMATHMENU:
                displayBasicMathMenu();
                break;
            case AREAMENU:
                displayAreaMenu();
                break;
            case VOLUMEMENU:
                displayVolumeMenu();
                break;
            case EXPONENTMENU:
                displayExponentMenu();
                break;
        }

    }

    public static String readUserInput() {

        Scanner input = new Scanner(System.in);
        String userInput;

        userInput = input.next();

        return userInput.toUpperCase();

    }

    public static double userInputStringToDouble() {

        String userinput = readUserInput();
        double usersNumber = Double.parseDouble(userinput);

        return usersNumber;

    }

    public static void showCurrentFormula() {

        HashMap<String, String> formulas = new HashMap<String, String>();

        //BASICMATH formulas
        formulas.put(BASICMATH_ADDITION, "x + y");
        formulas.put(BASICMATH_SUBTRACTION, "x - y");
        formulas.put(BASICMATH_MULTIPLICATION, "x * y");
        formulas.put(BASICMATH_DIVISION, "x / y");

        //AREA formulas
        formulas.put(AREAMENU_SQUARE, "s^2");
        formulas.put(AREAMENU_RECTANGLE, "b * h");
        formulas.put(AREAMENU_TRIANGLE, "(b * h) / 2");
        formulas.put(AREAMENU_PARALLELOGRAM, "b * h");
        formulas.put(AREAMENU_TRAPEZOID, "((b1 + b2) * h) / 2");
        formulas.put(AREAMENU_CIRCLE, "(r^2) * PI");

        //VOLUME formulas
        formulas.put(VOLUMEMENU_CUBE, "s^3");
        formulas.put(VOLUMEMENU_RECTANGULARPRISM, "l * w * h");
        formulas.put(VOLUMEMENU_PYRAMID, "(b * h) /3");
        formulas.put(VOLUMEMENU_CYLINDER, "((r^2) * h) * PI");
        formulas.put(VOLUMEMENU_CONE, "(((r^2) * h) * PI) / 3");
        formulas.put(VOLUMEMENU_SPHERE, "((r^3) * PI) * (4/3)");

    }

    public static Integer processUserInput(Integer currentMenu, String userInput) {

        System.out.println("currentMenu = [" + currentMenu + "]");
        System.out.println("userInput = [" + userInput + "]");

        switch(currentMenu) {
            case MAINMENU:
                currentMenu = processMainMenu(userInput);
                break;
            case BASICMATHMENU:
                currentMenu = processBasicMathMenu(userInput);
                break;
            case AREAMENU:
                currentMenu = processAreaMenu(userInput);
                break;
            case VOLUMEMENU:
                currentMenu = processVolumeMenu(userInput);
                break;
            case EXPONENTMENU:
                currentMenu = processExponentMenu(userInput);
                break;
        }

        return currentMenu;

    }

    public static Integer processMainMenu(String userInput) {

        int nextMenu = MAINMENU;

        switch(userInput) {
            case MAINMENU_BASICMATH:
                nextMenu = BASICMATHMENU;
                break;
            case MAINMENU_AREA:
                nextMenu = AREAMENU;
                break;
            case MAINMENU_VOLUME:
                nextMenu = VOLUMEMENU;
                break;
            case MAINMENU_EXPONENT:
                nextMenu = EXPONENTMENU;
                break;
            case MAINMENU_EXIT:
                nextMenu = EXITMENU;
                break;
        }

        return nextMenu;

    }

    public static Integer processBasicMathMenu(String userInput) {

        int nextMenu = BASICMATHMENU;
        double num1, num2, result;

        switch(userInput) {
            case MENU_BACK:
                nextMenu = MAINMENU;
                break;
            case BASICMATH_ADDITION:
                System.out.print("First number: ");
                num1 = userInputStringToDouble();
                System.out.print("Second number: ");
                num2 = userInputStringToDouble();
                result = wunderCalLogic.additionFunction(num1, num2);
                System.out.println("Result: " + result + "\n");
                break;
            case BASICMATH_SUBTRACTION:
                System.out.print("First number: ");
                num1 = userInputStringToDouble();
                System.out.print("Second number: ");
                num2 = userInputStringToDouble();
                result = wunderCalLogic.subtractionFunction(num1, num2);
                System.out.println("Result: " + result + "\n");
                break;
            case BASICMATH_MULTIPLICATION:
                System.out.print("First number: ");
                num1 = userInputStringToDouble();
                System.out.print("Second number: ");
                num2 = userInputStringToDouble();
                result = wunderCalLogic.multiplicationFunction(num1, num2);
                System.out.println("Result: " + result + "\n");
                break;
            case BASICMATH_DIVISION:
                System.out.print("First number: ");
                num1 = userInputStringToDouble();
                System.out.print("Second number: ");
                num2 = userInputStringToDouble();
                result = wunderCalLogic.divisionFunction(num1, num2);
                System.out.println("Result: " + result + "\n");
                break;
        }

        return nextMenu;

    }

    public static Integer processAreaMenu(String userInput) {

        int nextMenu = AREAMENU;
        double side, base, base2, height, radius, result;

        switch(userInput) {
            case MENU_BACK:
                nextMenu = MAINMENU;
                break;
            case AREAMENU_SQUARE:
                System.out.print("Side length: ");
                side = userInputStringToDouble();
                result = wunderCalLogic.squareAreaFunction(side);
                System.out.println("Result: " + result + "\n");
                break;
            case AREAMENU_RECTANGLE:
                System.out.print("Base: ");
                base = userInputStringToDouble();
                System.out.print("Height: ");
                height = userInputStringToDouble();
                result = wunderCalLogic.rectangleAreaFunction(base, height);
                System.out.println("Result: " + result + "\n");
                break;
            case AREAMENU_TRIANGLE:
                System.out.print("Base: ");
                base = userInputStringToDouble();
                System.out.print("Height: ");
                height = userInputStringToDouble();
                result = wunderCalLogic.triangleAreaFunction(base, height);
                System.out.println("Result: " + result + "\n");
                break;
            case AREAMENU_PARALLELOGRAM:
                System.out.print("Base: ");
                base = userInputStringToDouble();
                System.out.print("Height: ");
                height = userInputStringToDouble();
                result = wunderCalLogic.parallelogramAreaFunction(base, height);
                System.out.println("Result: " + result + "\n");
                break;
            case AREAMENU_TRAPEZOID:
                System.out.print("Height: ");
                height = userInputStringToDouble();
                System.out.print("Base 1: ");
                base = userInputStringToDouble();
                System.out.print("Base 2: ");
                base2 = userInputStringToDouble();
                result = wunderCalLogic.trapezoidAreaFunction(height, base, base2);
                System.out.println("Result: " + result + "\n");
                break;
            case AREAMENU_CIRCLE:
                System.out.print("Radius: ");
                radius = userInputStringToDouble();
                result = wunderCalLogic.circleAreaFunction(radius);
                System.out.println("Result: " + result + "\n");
                break;
        }

        return nextMenu;

    }

    public static Integer processVolumeMenu(String userInput) {

        int nextMenu = VOLUMEMENU;
        double side, length, width, height, base, radius, result;
        String baseAnswer;

        switch(userInput) {
            case MENU_BACK:
                nextMenu = MAINMENU;
                break;
            case VOLUMEMENU_CUBE:
                System.out.print("Side length: ");
                side = userInputStringToDouble();
                result = wunderCalLogic.cubeVolume(side);
                System.out.println("Result: " + result + "\n");
                break;
            case VOLUMEMENU_RECTANGULARPRISM:
                System.out.print("Length: ");
                length = userInputStringToDouble();
                System.out.print("Width: ");
                width = userInputStringToDouble();
                System.out.print("Height: ");
                height = userInputStringToDouble();
                result = wunderCalLogic.rectangularPrismVolume(length, width, height);
                System.out.println("Result: " + result + "\n");
                break;
            case VOLUMEMENU_PYRAMID:
                System.out.print("Base: ");
                base = userInputStringToDouble();
                System.out.print("Height: ");
                height = userInputStringToDouble();
                result = wunderCalLogic.pyramidVolume(base, height);
                System.out.println("Result: " + result + "\n");
                break;
            case VOLUMEMENU_CYLINDER:
                System.out.print("Do you have the base of the Cylinder calculated? (Y/N): ");
                baseAnswer = readUserInput();

                if(baseAnswer.equals("Y")) {
                    System.out.print("Base: ");
                    base = userInputStringToDouble();
                    System.out.print("Height: ");
                    height = userInputStringToDouble();
                    result = wunderCalLogic.cylinderVolumeWithBase(base, height);
                    System.out.println("Result: " + result + "\n");
                } else {
                    System.out.print("Radius: ");
                    radius = userInputStringToDouble();
                    System.out.print("Height: ");
                    height = userInputStringToDouble();
                    result = wunderCalLogic.cylinderVolumeWithoutBase(radius, height);
                    System.out.println("Result: " + result + "\n");
                }

                break;
            case VOLUMEMENU_CONE:
                System.out.print("Do you have the base of the Cone calculated (Y/N): ");
                baseAnswer = readUserInput();

                if(baseAnswer.equals("Y")) {
                    System.out.print("Base: ");
                    base = userInputStringToDouble();
                    System.out.print("Height: ");
                    height = userInputStringToDouble();
                    result = wunderCalLogic.coneVolumeWithBase(base, height);
                    System.out.println("Result: " + result + "\n");
                } else {
                    System.out.print("Radius: ");
                    radius = userInputStringToDouble();
                    System.out.print("Height: ");
                    height = userInputStringToDouble();
                    result = wunderCalLogic.coneVolumeWithoutBase(radius, height);
                    System.out.println("Result: " + result + "\n");
                }

                break;
            case VOLUMEMENU_SPHERE:
                System.out.print("Radius: ");
                radius = userInputStringToDouble();
                result = wunderCalLogic.sphereVolume(radius);
                System.out.println("Result: " + result + "\n");
                break;
        }

        return nextMenu;

    }

    public static Integer processExponentMenu(String userInput) {

        int nextMenu = EXPONENTMENU;
        double num, customPower, result;

        switch(userInput) {
            case MENU_BACK:
                nextMenu = MAINMENU;
                break;
            case EXPONENTMENU_SQUARED:
                System.out.print("Number: ");
                num = userInputStringToDouble();
                result = wunderCalLogic.numberSquared(num);
                System.out.println("Result: " + result + "\n");
                break;
            case EXPONENTMENU_CUBED:
                System.out.print("Number: ");
                num = userInputStringToDouble();
                result = wunderCalLogic.numberCubed(num);
                System.out.println("Result: " + result + "\n");
                break;
            case EXPONENTMENU_CHOOSE:
                System.out.print("Number: ");
                num = userInputStringToDouble();
                System.out.print("Custom Power: ");
                customPower = userInputStringToDouble();
                result = wunderCalLogic.numberWithCustomPower(num, customPower);
                System.out.println("Result: " + result + "\n");
                break;
        }

        return nextMenu;

    }

}
