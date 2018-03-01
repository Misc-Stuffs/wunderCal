public class wunderCalLogic {

    //BASICMATH functions

    //SIMPLEMATHSUBMENU functions
    public static double additionFunction(double num1, double num2) {

        return num1 + num2;

    }

    public static double subtractionFunction(double num1, double num2) {

        return num1 - num2;

    }

    public static double multiplicationFunction(double num1, double num2) {

        return num1 * num2;

    }

    public static double divisionFunction(double num1, double num2) {

        return num1 / num2;

    }

    //FRACTIONSSUBMENU functions

    //OUTLINED ONLY!
    public static double addFractions() {

        return 0; //added for compiling

    }

    //OUTLINED ONLY!
    public static double subtractFractions() {

        return 0; //added for compiling

    }

    //OUTLINED ONLY!
    public static double multiplyFractions() {

        return 0; //added for compiling

    }

    //OUTLINED ONLY!
    public static double divideFractions() {

        return 0; //added for compiling

    }

    //OUTLINED ONLY!
    public static double reduceFraction() {

        return 0; //added for compiling

    }

    //OUTLINED ONLY!
    public static double convertToMixedFraction() {

        return 0; //added for compiling

    }

    //OUTLINED ONLY
    public static double convertToImproperFraction() {

        return 0; //added for compiling

    }

    //DECIMALSSUBMENU functions

    //OUTLINED ONLY!
    public static double roundDecimalUp() {

        return 0; //added for compiling

    }

    //OUTLINED ONLY!
    public static double roundDecimalDown() {

        return 0; //added for compiling

    }

    //PERCENTSUBMENU functions

    //OUTLINED ONLY!
    public static double calculatePercent() {

        return 0; //added for compiling

    }

    //RADICALSSUBMENU functions

    //OUTLINED ONLY!
    public static double squareRoot() {

        return 0; //added for compiling

    }

    //OUTLINED ONLY!
    public static double cubeRoot() {

        return 0; //added for compiling

    }

    //OUTLINED ONLY!
    public static double customRoot() {

        return 0; //added for compiling

    }

    //AREA functions
    public static double squareAreaFunction(double side) {

        return Math.pow(side, 2);

    }

    public static double rectangleAreaFunction(double base, double height) {

        return base * height;

    }

    public static double triangleAreaFunction(double base, double height) {

        return (base * height) / 2;

    }

    public static double parallelogramAreaFunction(double base, double height) {

        return base * height;

    }

    public static double trapezoidAreaFunction(double height, double base1, double base2) {

        return((base1 + base2) * height) / 2;

    }

    public static double circleAreaFunction(double radius) {

        return Math.pow(radius, 2) * Math.PI;

    }

    //VOLUME functions
    public static double cubeVolume(double side) {

        return Math.pow(side, 3);

    }

    public static double rectangularPrismVolume(double length, double width, double height) {

        return length * width * height;

    }

    public static double pyramidVolume(double base, double height) {

        return (base * height) / 3;

    }

    public static double cylinderVolumeWithBase(double base, double height) {

        return base * height;

    }

    public static double cylinderVolumeWithoutBase(double radius, double height) {

        return (Math.pow(radius, 2) * height) * Math.PI;

    }

    public static double coneVolumeWithBase(double base, double height) {

        return (base * height) / 3;

    }

    public static double coneVolumeWithoutBase(double radius, double height) {

        return ((Math.pow(radius, 2) * height) * Math.PI) / 3;

    }

    public static double sphereVolume(double radius) {

        return (Math.pow(radius, 3) * Math.PI) * (4 / 3);

    }

    //EXPONENT functions
    public static double numberSquared(double num) {

        return Math.pow(num, 2);

    }

    public static double numberCubed(double num) {

        return Math.pow(num, 3);

    }

    public static double numberWithCustomPower(double num, double customPower) {

        return Math.pow(num, customPower);

    }

}