package calcengine;

import calcengine.CalculateBase;

/**
 * Created by OYurchuk on 20.07.2018.
 */
public class Divider extends CalculateBase {

    public Divider() {}

    public Divider(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public  void calculate() {
        if (getRightVal() == 0) {
            System.out.println("Trying to delete into 0");
        } else {
            double value = getLeftVal()/ getRightVal();
            setResult(value);
        }
    }

}
