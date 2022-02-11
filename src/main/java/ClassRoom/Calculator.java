package ClassRoom;


import lombok.AllArgsConstructor;
import lombok.Getter;
@AllArgsConstructor
@Getter

public class Calculator {
    public Calculator(String v2022) {

    }

    //public String ModelName() {
    //}

    public int sum(int x, int y) {
        //int result = x+y;
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public int divide(int x, int y) {
        return x / y;
    }

    public int squared(int x) {
        return x * x;
    }
}
