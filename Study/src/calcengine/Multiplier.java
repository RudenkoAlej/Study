package calcengine;

import calcengine.CalculateBase;

/**
 * Created by OYurchuk on 20.07.2018.
 */
public class Multiplier extends CalculateBase {

    public Multiplier() {}

    public Multiplier(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public  void calculate() {
        double value = getLeftVal() * getRightVal();
        setResult(value);
    }


}
