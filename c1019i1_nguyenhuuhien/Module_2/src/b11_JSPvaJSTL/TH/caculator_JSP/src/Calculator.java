public class Calculator {
    public static float calculate(float fistOperand, float secondoperand, char operator) {
        switch (operator) {
            case '+':
                return fistOperand + secondoperand;
            case '-':
                return fistOperand - secondoperand;
            case '*':
                return fistOperand * secondoperand;
            case '/':
                if (secondoperand != 0) {
                    return fistOperand / secondoperand;
                } else {
                    throw new RuntimeException("không thể chia cho zero!");
                }
            default:
                throw new RuntimeException("Invalid operation");
        }
    }
}
