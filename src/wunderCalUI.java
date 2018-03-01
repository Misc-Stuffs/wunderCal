import java.util.HashMap;
import java.util.Scanner;

public class wunderCalUI {

    //User Input for MENUS
    //Main Menu Option
    public static final String MAINMENU_BASICMATH = "1";
        //Sub Menus for MAINMENU_BASICMATH
        public static final String SUBMENU_SIMPLEMATH = "1.1";
            //Options for SUBMENU_SIMPLEMATH
            public static final String BM_SMSM_ADDITION = "1.1A";
            public static final String BM_SMSM_SUBTRACTION = "1.1B";
            public static final String BM_SMSM_MULTIPLICATION = "1.1C";
            public static final String BM_SMSM_DIVISION = "1.1D";
        public static final String SUBMENU_FRACTIONS = "1.2";
            //Options for SUBMENU_FRACTIONS
            public static final String BM_SMFR_ADDFRACS = "1.2A";
            public static final String BM_SMFR_SUBFRACS = "1.2B";
            public static final String BM_SMFR_MULTIFRACS = "1.2C";
            public static final String BM_SMFR_DIVIDEFRACS = "1.2D";
            public static final String BM_SMFR_REDUCEFRAC = "1.2E";
            public static final String BM_SMFR_CONVERTTOMIXED = "1.2F";
            public static final String BM_SMFR_CONVERTTOIMPROPER = "1.2G";
        public static final String SUBMENU_DECIMALS = "1.3";
            //Options for SUBMENU_DECIMALS
            public static final String BM_SMDC_ROUNDUP = "1.3A";
            public static final String BM_SMDC_ROUNDDOWN = "1.3B";
        public static final String SUBMENU_PERCENTS = "1.4";
            //Options for SUBMENU_PERCENTS
            public static final String BM_SMPR_CALCPERCENT = "1.4A";
        public static final String SUBMENU_RADICALS = "1.5";
            //Options for SUBMENU_RADICALS
            public static final String BM_SMRD_SQUAREROOT = "1.5A";
            public static final String BM_SMRD_CUBEROOT = "1.5B";
            public static final String BM_SMRD_CUSTOMROOT = "1.5C";
        public static final String SUBMENU_EXPONENTS = "1.6";
            //Options for SUBMENU_EXPONENTS
            public static final String BM_SMEX_SQUARED = "1.6A";
            public static final String BM_SMEX_CUBED = "1.6B";
            public static final String BM_SMEX_CUSTOMEXPONENT = "1.6C";

    //Main Menu Option
    public static final String MAINMENU_AREA = "2";
        //Options for MAINMENU_AREA
        public static final String AR_SQUARE = "2.1";
        public static final String AR_RECTANGLE = "2.2";
        public static final String AR_TRIANGLE = "2.3";
        public static final String AR_PARALLELOGRAM = "2.4";
        public static final String AR_TRAPEZOID = "2.5";
        public static final String AR_CIRCLE = "2.6";

    //Main Menu Option
    public static final String MAINMENU_VOLUME = "3";
        //Options for MAINMENU_VOLUME
        public static final String VM_CUBE = "3.1";
        public static final String VM_RECTANGULARPRISM = "3.2";
        public static final String VM_PYRAMID = "3.3";
        public static final String VM_CYLINDER = "3.4";
        public static final String VM_CONE = "3.5";
        public static final String VM_SPHERE = "3.6";

    public static final String MAINMENU_EXIT = "X";
    public static final String MENU_BACK = "B";

    //Tracking Current Menu
    public static final int EXITMENU = -1;
    public static final int MAINMENU = 1;
    public static final int BASICMATHMENU = 2;
    public static final int SIMPLEMATHSUBMENU = 3;
    public static final int FRACTIONSSUBMENU = 4;
    public static final int DECIMALSSUBMENU = 5;
    public static final int PERCENTSSUBMENU = 6;
    public static final int RADICALSSUBMENU = 7;
    public static final int EXPONENTSSUBMENU = 8;
    public static final int AREAMENU = 9;
    public static final int VOLUMEMENU = 10;

    //Runs the console UI
    public static void runUI() {

        boolean continueRunning = true;

        int currentMenu = MAINMENU;
        String userInput = "";

        while(continueRunning == true) {
            chooseMenuToDisplayToUser(currentMenu);

            userInput = readUserInput();

            currentMenu = processUserInput(currentMenu, userInput);

            if(currentMenu == -1)
                continueRunning = false;
        }

    }

    //displays the Main Menu in the console for the user
    public static void displayMainMenuToUser() {

        System.out.println("Please choose an option and select the number that corresponds to your selection.");

        System.out.println("1. Basic Math");
        System.out.println("2. Area");
        System.out.println("3. Volume");

        System.out.println("\nX. Exit Application");

    }

    //displays the Basicmath Menu in the console for the user
    public static void displayBasicMathMainMenuToUser() {

        System.out.println("Please choose an option and select the number that corresponds to your selection.");

        System.out.println("1.1 Simple Math");
        System.out.println("1.2 Fractions");
        System.out.println("1.3 Decimals");
        System.out.println("1.4 Percents");
        System.out.println("1.5 Radicals");
        System.out.println("1.6 Exponents");

        System.out.println("\nB. Back to previous menu");

    }

    //displays the Simplemath Sub Menus in the console for the user
    public static void displaySimpleMathSubMenuToUser() {

        System.out.println("Please choose an option and select the number that corresponds to your selection.");

        System.out.println("1.1a Addition");
        System.out.println("1.1b Subtraction");
        System.out.println("1.1c Multiplication");
        System.out.println("1.1d Division");

        System.out.println("\nB. Back to previous menu");

    }

    //displays the Fractions Sub Menus in the console for the user
    public static void displayFractionsSubMenuToUser() {

        System.out.println("Please choose an option and select the number that corresponds to your selection.");

        System.out.println("1.2a Add Fractions");
        System.out.println("1.2b Subtract Fractions");
        System.out.println("1.2c Multiply Fractions");
        System.out.println("1.2d Divide Fractions");
        System.out.println("1.2e Reduce Fraction");
        System.out.println("1.2f Convert to Mixed Number");
        System.out.println("1.2g Convert to Improper Fraction");

        System.out.println("\nB. Back to previous menu");

    }

    //displays the Decimals Sub Menus in the console for the user
    public static void displayDecimalsSubMenuToUser() {

        System.out.println("Please choose an option and select the number that corresponds to your selection.");

        System.out.println("1.3a Round Up");
        System.out.println("1.3b Round Down");

        System.out.println("\nB. Back to previous menu");

    }

    //displays the Percents Sub Menus in the console for the user
    public static void displayPercentsSubMenuToUser() {

        System.out.println("Please choose an option and select the number that corresponds to your selection.");

        System.out.println("1.4a Calculate Percent");

        System.out.println("\nB. Back to previous menu");

    }

    //displays the Radicals Sub Menus in the console for the user
    public static void displayRadicalsSubMenuToUser() {

        System.out.println("Please choose an option and select the number that corresponds to your selection.");

        System.out.println("1.5a Square Root of X");
        System.out.println("1.5b Cube Root of X");
        System.out.println("1.5c Custom Root of X");

        System.out.println("\nB. Back to previous menu");

    }

    //displays the Exponents Sub Menus in the console for the user
    public static void displayExponentsSubMenuToUser() {

        System.out.println("Please choose an option and select the number that corresponds to your selection.");

        System.out.println("1.6a X Squared");
        System.out.println("1.6b X Cubed");
        System.out.println("1.6c X to a Custom Power");

        System.out.println("\nB. Back to previous menu");

    }

    //displays the Area Menu in the console for the user
    public static void displayAreaMenuToUser() {

        System.out.println("Please choose an option and select the number the corresponds to your selection.");

        System.out.println("2.1 Area of a Square");
        System.out.println("2.2 Area of a Rectangle");
        System.out.println("2.3 Area of a Triangle");
        System.out.println("2.4 Area of a Parallelogram");
        System.out.println("2.5 Area of a Trapezoid");
        System.out.println("2.6 Area of a Circle");

        System.out.println("\nB. Back to previous menu");

    }

    //displays the Volume Menu in the console for the user
    public static void displayVolumeMenuToUser() {

        System.out.println("Please choose an option and select the number that corresponds to your selection.");

        System.out.println("3.1 Volume of a Cube");
        System.out.println("3.2 Volume of a Rectangular Prism");
        System.out.println("3.3 Volume of a Pyramid");
        System.out.println("3.4 Volume of a Cylinder");
        System.out.println("3.5 Volume of a Cone");
        System.out.println("3.6 Volume of a Sphere");

        System.out.println("\nB. Back to previous menu");

    }

    //takes in the currentMenu variable from runUI and uses that number to select and display the menu that corresponds to the selected number
    public static void chooseMenuToDisplayToUser(int currentMenu) {

        switch(currentMenu) {
            case MAINMENU:
                displayMainMenuToUser();
                break;
            case BASICMATHMENU:
                displayBasicMathMainMenuToUser();
                break;
            case SIMPLEMATHSUBMENU:
                displaySimpleMathSubMenuToUser();
                break;
            case FRACTIONSSUBMENU:
                displayFractionsSubMenuToUser();
                break;
            case DECIMALSSUBMENU:
                displayDecimalsSubMenuToUser();
                break;
            case PERCENTSSUBMENU:
                displayPercentsSubMenuToUser();
                break;
            case RADICALSSUBMENU:
                displayRadicalsSubMenuToUser();
                break;
            case EXPONENTSSUBMENU:
                displayExponentsSubMenuToUser();
                break;
            case AREAMENU:
                displayAreaMenuToUser();
                break;
            case VOLUMEMENU:
                displayVolumeMenuToUser();
                break;
        }

    }

    //reads the users input, stores it in a String userInput and returns it (always capitalized)
    public static String readUserInput() {

        Scanner input = new Scanner(System.in);
        String userInput;

        userInput = input.next();

        return userInput.toUpperCase();

    }

    //converts the strings (numbers) entered by the user into doubles so that the math functions work properly
    public static double userInputStringToDouble() {

        String userinput = readUserInput();
        double usersNumber = Double.parseDouble(userinput);

        return usersNumber;

    }

    //stores the formula that corresponds to the function on the left and gets the last formula used for the user when called
    public static void showCurrentFormula(String key) {

        HashMap<String, String> formulas = new HashMap<String, String>();

        //SUBMENU_SIMPLEMATH formulas
        formulas.put(BM_SMSM_ADDITION, "x + y");
        formulas.put(BM_SMSM_SUBTRACTION, "x - y");
        formulas.put(BM_SMSM_MULTIPLICATION, "x * y");
        formulas.put(BM_SMSM_DIVISION, "x / y");

        //SUBMENU_FRACTIONS

        //SUBMENU_DECIMALS

        //SUBMENU_PERCENTS

        //SUBMENU_RADICALS

        //SUBMENU_EXPONENTS

        //AREA formulas
        formulas.put(AR_SQUARE, "s^2");
        formulas.put(AR_RECTANGLE, "b * h");
        formulas.put(AR_TRIANGLE, "(b * h) / 2");
        formulas.put(AR_PARALLELOGRAM, "b * h");
        formulas.put(AR_TRAPEZOID, "((b1 + b2) * h) / 2");
        formulas.put(AR_CIRCLE, "(r^2) * PI");

        //VOLUME formulas
        formulas.put(VM_CUBE, "s^3");
        formulas.put(VM_RECTANGULARPRISM, "l * w * h");
        formulas.put(VM_PYRAMID, "(b * h) /3");
        formulas.put(VM_CYLINDER, "((r^2) * h) * PI");
        formulas.put(VM_CONE, "(((r^2) * h) * PI) / 3");
        formulas.put(VM_SPHERE, "((r^3) * PI) * (4/3)");

        /* EXPONENT formulas
        formulas.put(EXPONENTMENU_SQUARED, "x^2");
        formulas.put(EXPONENTMENU_CUBED, "x^3");
        formulas.put(EXPONENTMENU_CHOOSE, "x^x"); */

        System.out.println(formulas.get(key) + "\n");

    }

    //this method processes the user input by taking current menu, using that value, and selecting the corresponding case to process the current menu the user is on
    public static Integer processUserInput(Integer currentMenu, String userInput) {

        //Debugging statements, tracks the userInput and currentMenu throughout the execution of the program
        System.out.println("currentMenu = [" + currentMenu + "]");
        System.out.println("userInput = [" + userInput + "]");

        switch(currentMenu) {
            case MAINMENU:
                currentMenu = processMainMenuSelection(userInput);
                break;
            case BASICMATHMENU:
                currentMenu = processBasicMathMenuSelections(userInput);
                break;
            case SIMPLEMATHSUBMENU:
                currentMenu = processSimpleMathSubMenuFunctions(userInput);
                break;
            case FRACTIONSSUBMENU:
                currentMenu = processFractionsSubMenuFunctions(userInput);
                break;
            case DECIMALSSUBMENU:
                currentMenu = processDecimalsSubMenuFunctions(userInput);
                break;
            case PERCENTSSUBMENU:
                currentMenu = processPercentsSubMenuFunctions(userInput);
                break;
            case RADICALSSUBMENU:
                currentMenu = processRadicalsSubMenuFunctions(userInput);
                break;
            case AREAMENU:
                currentMenu = processAreaMenuFunctions(userInput);
                break;
            case VOLUMEMENU:
                currentMenu = processVolumeMenuFunctions(userInput);
                break;
        }

        return currentMenu;

    }

    //takes the userInput and uses that to select the menu that corresponds to their selection and sets nextMenu to that selection, and returns nextMenu
    public static Integer processMainMenuSelection(String userInput) {

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
            case MAINMENU_EXIT:
                nextMenu = EXITMENU;
                break;
        }

        return nextMenu;

    }

    //takes the userInput and carries out the corresponding function, then returns the users result and puts them back on the sub-menu they were previously on
    public static Integer processBasicMathMenuSelections(String userInput) {

        int nextMenu = BASICMATHMENU;

        switch(userInput) {
            case MENU_BACK:
                nextMenu = MAINMENU;
                break;
            case SUBMENU_SIMPLEMATH:
                nextMenu = SIMPLEMATHSUBMENU;
                break;
            case SUBMENU_FRACTIONS:
                nextMenu = FRACTIONSSUBMENU;
                break;
            case SUBMENU_DECIMALS:
                nextMenu = DECIMALSSUBMENU;
                break;
            case SUBMENU_PERCENTS:
                nextMenu = PERCENTSSUBMENU;
                break;
            case SUBMENU_RADICALS:
                nextMenu = RADICALSSUBMENU;
                break;
            case SUBMENU_EXPONENTS:
                nextMenu = EXPONENTSSUBMENU;
                break;
        }

        return nextMenu;

    }

    //takes the userInput and carries out the corresponding function, then returns the users result and puts them back on the sub-menu they were previously on
    public static Integer processSimpleMathSubMenuFunctions(String userInput) {

        int nextMenu = SIMPLEMATHSUBMENU;
        double num1, num2, result;

        switch(userInput) {
            case MENU_BACK:
                nextMenu = MAINMENU;
                break;
            case BM_SMSM_ADDITION:
                System.out.print("First number: ");
                num1 = userInputStringToDouble();
                System.out.print("Second number: ");
                num2 = userInputStringToDouble();
                result = wunderCalLogic.additionFunction(num1, num2);
                System.out.println("Result: " + result + "\n");
                break;
            case BM_SMSM_SUBTRACTION:
                System.out.print("First number: ");
                num1 = userInputStringToDouble();
                System.out.print("Second number: ");
                num2 = userInputStringToDouble();
                result = wunderCalLogic.subtractionFunction(num1, num2);
                System.out.println("Result: " + result + "\n");
                break;
            case BM_SMSM_MULTIPLICATION:
                System.out.print("First number: ");
                num1 = userInputStringToDouble();
                System.out.print("Second number: ");
                num2 = userInputStringToDouble();
                result = wunderCalLogic.multiplicationFunction(num1, num2);
                System.out.println("Result: " + result + "\n");
                break;
            case BM_SMSM_DIVISION:
                System.out.print("First number: ");
                num1 = userInputStringToDouble();
                System.out.print("Second number: ");
                num2 = userInputStringToDouble();
                result = wunderCalLogic.divisionFunction(num1, num2);
                System.out.println("Result: " + result + "\n");
                break;
        }

        if (!userInput.equals(MENU_BACK)) {
            System.out.print("Would you like to see the formula for the previous function? (Y/N): ");
            String userAnswer = readUserInput();
            System.out.print("\n");

            if (userAnswer.equals("Y")) {
                showCurrentFormula(userInput);
            }
        }

        return nextMenu;

    }

    //OUTLINED ONLY! takes the userInput and carries out the corresponding function, then returns the users result and puts them back on the sub-menu they were previously on
    public static Integer processFractionsSubMenuFunctions(String userInput) {

        int nextMenu = FRACTIONSSUBMENU;
        double num1, num2, result;

        switch(userInput) {
            case MENU_BACK:
                nextMenu = MAINMENU;
                break;
            case BM_SMFR_ADDFRACS:
                break;
            case BM_SMFR_SUBFRACS:
                break;
            case BM_SMFR_MULTIFRACS:
                break;
            case BM_SMFR_DIVIDEFRACS:
                break;
            case BM_SMFR_REDUCEFRAC:
                break;
            case BM_SMFR_CONVERTTOMIXED:
                break;
            case BM_SMFR_CONVERTTOIMPROPER:
                break;
        }

        if (!userInput.equals(MENU_BACK)) {
            System.out.print("Would you like to see the formula for the previous function? (Y/N): ");
            String userAnswer = readUserInput();
            System.out.print("\n");

            if (userAnswer.equals("Y")) {
                showCurrentFormula(userInput);
            }
        }

        return nextMenu;

    }

    //OUTLINED ONLY! takes the userInput and carries out the corresponding function, then returns the users result and puts them back on the sub-menu they were previously on
    public static Integer processDecimalsSubMenuFunctions(String userInput) {

        int nextMenu = DECIMALSSUBMENU;
        double num1, num2, result;

        switch(userInput) {
            case MENU_BACK:
                nextMenu = MAINMENU;
                break;
            case BM_SMDC_ROUNDUP:
                break;
            case BM_SMDC_ROUNDDOWN:
                break;
        }

        if (!userInput.equals(MENU_BACK)) {
            System.out.print("Would you like to see the formula for the previous function? (Y/N): ");
            String userAnswer = readUserInput();
            System.out.print("\n");

            if (userAnswer.equals("Y")) {
                showCurrentFormula(userInput);
            }
        }

        return nextMenu;

    }

    //OUTLINED ONLY! takes the userInput and carries out the corresponding function, then returns the users result and puts them back on the sub-menu they were previously on
    public static Integer processPercentsSubMenuFunctions(String userInput) {

        int nextMenu = PERCENTSSUBMENU;
        double num1, num2, result;

        switch(userInput) {
            case MENU_BACK:
                nextMenu = MAINMENU;
                break;
            case BM_SMPR_CALCPERCENT:
                break;
        }

        if (!userInput.equals(MENU_BACK)) {
            System.out.print("Would you like to see the formula for the previous function? (Y/N): ");
            String userAnswer = readUserInput();
            System.out.print("\n");

            if (userAnswer.equals("Y")) {
                showCurrentFormula(userInput);
            }
        }

        return nextMenu;

    }

    //OUTLINED ONLY! takes the userInput and carries out the corresponding function, then returns the users result and puts them back on the sub-menu they were previously on
    public static Integer processRadicalsSubMenuFunctions(String userInput) {

        int nextMenu = RADICALSSUBMENU;
        double num1, num2, result;

        switch(userInput) {
            case MENU_BACK:
                nextMenu = MAINMENU;
                break;
            case BM_SMRD_SQUAREROOT:
                break;
            case BM_SMRD_CUBEROOT:
                break;
            case BM_SMRD_CUSTOMROOT:
                break;
        }

        if (!userInput.equals(MENU_BACK)) {
            System.out.print("Would you like to see the formula for the previous function? (Y/N): ");
            String userAnswer = readUserInput();
            System.out.print("\n");

            if (userAnswer.equals("Y")) {
                showCurrentFormula(userInput);
            }
        }

        return nextMenu;

    }

    //takes the userInput and carries out the corresponding function, then returns the users result and puts them back on the sub-menu they were previously on
    public static Integer processAreaMenuFunctions(String userInput) {

        int nextMenu = AREAMENU;
        double side, base, base2, height, radius, result;

        switch(userInput) {
            case MENU_BACK:
                nextMenu = MAINMENU;
                break;
            case AR_SQUARE:
                System.out.print("Side length: ");
                side = userInputStringToDouble();
                result = wunderCalLogic.squareAreaFunction(side);
                System.out.println("Result: " + result + "\n");
                break;
            case AR_RECTANGLE:
                System.out.print("Base: ");
                base = userInputStringToDouble();
                System.out.print("Height: ");
                height = userInputStringToDouble();
                result = wunderCalLogic.rectangleAreaFunction(base, height);
                System.out.println("Result: " + result + "\n");
                break;
            case AR_TRIANGLE:
                System.out.print("Base: ");
                base = userInputStringToDouble();
                System.out.print("Height: ");
                height = userInputStringToDouble();
                result = wunderCalLogic.triangleAreaFunction(base, height);
                System.out.println("Result: " + result + "\n");
                break;
            case AR_PARALLELOGRAM:
                System.out.print("Base: ");
                base = userInputStringToDouble();
                System.out.print("Height: ");
                height = userInputStringToDouble();
                result = wunderCalLogic.parallelogramAreaFunction(base, height);
                System.out.println("Result: " + result + "\n");
                break;
            case AR_TRAPEZOID:
                System.out.print("Height: ");
                height = userInputStringToDouble();
                System.out.print("Base 1: ");
                base = userInputStringToDouble();
                System.out.print("Base 2: ");
                base2 = userInputStringToDouble();
                result = wunderCalLogic.trapezoidAreaFunction(height, base, base2);
                System.out.println("Result: " + result + "\n");
                break;
            case AR_CIRCLE:
                System.out.print("Radius: ");
                radius = userInputStringToDouble();
                result = wunderCalLogic.circleAreaFunction(radius);
                System.out.println("Result: " + result + "\n");
                break;
        }

        if (!userInput.equals(MENU_BACK)) {
            System.out.print("Would you like to see the formula for the previous function? (Y/N): ");
            String userAnswer = readUserInput();
            System.out.print("\n");

            if (userAnswer.equals("Y")) {
                showCurrentFormula(userInput);
            }
        }

        return nextMenu;

    }

    //takes the userInput and carries out the corresponding function, then returns the users result and puts them back on the sub-menu they were previously on
    public static Integer processVolumeMenuFunctions(String userInput) {

        int nextMenu = VOLUMEMENU;
        double side, length, width, height, base, radius, result;
        String baseAnswer;

        switch(userInput) {
            case MENU_BACK:
                nextMenu = MAINMENU;
                break;
            case VM_CUBE:
                System.out.print("Side length: ");
                side = userInputStringToDouble();
                result = wunderCalLogic.cubeVolume(side);
                System.out.println("Result: " + result + "\n");
                break;
            case VM_RECTANGULARPRISM:
                System.out.print("Length: ");
                length = userInputStringToDouble();
                System.out.print("Width: ");
                width = userInputStringToDouble();
                System.out.print("Height: ");
                height = userInputStringToDouble();
                result = wunderCalLogic.rectangularPrismVolume(length, width, height);
                System.out.println("Result: " + result + "\n");
                break;
            case VM_PYRAMID:
                System.out.print("Base: ");
                base = userInputStringToDouble();
                System.out.print("Height: ");
                height = userInputStringToDouble();
                result = wunderCalLogic.pyramidVolume(base, height);
                System.out.println("Result: " + result + "\n");
                break;
            case VM_CYLINDER:
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
            case VM_CONE:
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
            case VM_SPHERE:
                System.out.print("Radius: ");
                radius = userInputStringToDouble();
                result = wunderCalLogic.sphereVolume(radius);
                System.out.println("Result: " + result + "\n");
                break;
        }

        if (!userInput.equals(MENU_BACK)) {
            System.out.print("Would you like to see the formula for the previous function? (Y/N): ");
            String userAnswer = readUserInput();
            System.out.print("\n");

            if (userAnswer.equals("Y")) {
                showCurrentFormula(userInput);
            }
        }

        return nextMenu;

    }

}
