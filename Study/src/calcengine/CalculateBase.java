package calcengine;

/**
 * Created by OYurchuk on 20.07.2018.
 */
public abstract class CalculateBase {

    private double leftVal;

    public double getLeftVal() {return leftVal;}
    public void setLeftVal(double leftVal) {this.leftVal = leftVal;}

    private double rightVal;

    public double getRightVal() {return rightVal;}
    public void setRightVal(double rightVal) {this.rightVal = rightVal;}

    private int opCode;

    public int getOpCode() {return opCode;}
    public void setOpCode(int opCode) {this.opCode = opCode;}


    private double result;

    public double getResult() {return result;}
    public void setResult(double result) {
        this.result = result;
    }


    public CalculateBase() {}

    public CalculateBase(double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public abstract void calculate();
}
