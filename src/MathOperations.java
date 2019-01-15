public class MathOperations {

    boolean isEven (int num){
        if (num%2 ==1){
            return false;
        }
        else
            return true;
    }

    boolean isOdd (int num){
        if (num%2 ==1){
            return true;
        }
        else
            return false;
    }

    double circleField (double radius){
        return Math.PI*Math.pow(radius,2.0);
    }

    int power (int num){
        return num*num;
    }

}
