package lesson_1;

// Upper Camel-Case
// First word subs
public class DataTypes {
    public static void main(String[] args){
        // Data Types
        // CPU -> registers, the fastest accessible memory, ROM - read-only memory

        // RAM - stack (стэк) & heap (куча)
        // Стэк и Куча есть своя память
        // Стэк - краткосрочная память в RAM, primitive data types - примитивные типы данных
        // Куча - хранятся объекты

        // Integer: byte, short, int, long
        byte counter = 127; // -
        short shortCounter = -31345;
        int intCounter = 1_000_000; // _ -> для лучшей читаемости
        long longCounter = 2_456_345L; // Компилятор знает, что надо обязательно создать long

        // Char
        // ASCII, extended
        char charLetter = 'a'; // 97
        System.out.println((int) charLetter); // явное приведение типов

        // Decimal: float, double
        float floatValue = 12.9F; // float -> F, by default, double
        double doubleValue = 123.45678892;

        // Logical: boolean
        boolean isAlive = true;
        boolean isActive = false;

        System.out.println(counter);
        System.out.println(intCounter);
        System.out.println(doubleValue);
        System.out.println(isActive);

        // boolean = 0 & 1
        // C/C++ == 0 (false), != 0 (true)
        System.out.println("More then needed: " + counter);
        // counter = counter + 1;

        short shortValueOne = 100;
        short shortValueTwo = 259;
        int sum = shortValueOne + shortValueTwo;

        int intValueOne = 100;
        byte intInject = (byte) intValueOne;

        double doubleValueCalc = 24.5;
        int doubleInject = (int) doubleValueCalc;
        System.out.println(doubleInject);

        // Operators +, -, /, *, %, ++, --
        int x = 1;
        int y = 2;
        int sumXY = x + y;

        System.out.println(sumXY);
        sumXY = sumXY - x;
        System.out.println(sumXY);
        sumXY = sumXY / 2;
        System.out.println(sumXY);
        sumXY = sumXY * 100;
        System.out.println(sumXY);

        int sumValue = 100;
        int modulus = 4;

        // Остаток
        System.out.println(100 % 4); // 25 * 4 = 0
        System.out.println(101 % 4); // 25 * 4 = 100, 101 - 100 = 1

        // post-инкремент и post-дикремент
        int xPost = 1;
        xPost++; // xPost = xPost + 1
        xPost--; // xPost = xPost - 1

        System.out.println("xPost: " + xPost + " value...");
        System.out.println("xPost: " + (xPost++)); // increment/decrement post, gives value then increases/decreases

        // 1 + 3 * 5 / 5 + 4 + (4 * 5)
        // x + x ? x += x;
        // x / ? - x /= ?
        // x * ? - x *= 5
        int multiply = 10;
        multiply = multiply * 5;
        multiply *= 9;
        multiply = multiply + 1;
        multiply += 1;
        multiply++;

        // ternary operator (condition) ? _ : _
        // if (x == y) -> then...
        // else ...
        int minor = 19;
        int major = 21;
        int theHighest = (minor > major) ? minor : major;
        // (minor > major) ? minor : (x != zum) ? _ : _;
        System.out.println(theHighest);

        // >, <, ==, >=, <=, !=, ! (no)

        // Module -> Payment System
    }
}
