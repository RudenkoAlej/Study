/**
 * Created by OYurchuk on 16.07.2018.
 */
public class MathEquation {

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


     //---------------Constructors--------------------------------
    public MathEquation(char opCode) {
        this.opCode = opCode;
    }

    public MathEquation(char opCode, double leftVal, double rightVal) {
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }
    //---------------End of constructors--------------------------


    public void execute(double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;

        execute();
    }

    public void execute(int leftVal, int rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;

        execute();

        result = (int) result;
    }

    public void execute() {
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            case ('d'):
                if (rightVal == 0) {
                    System.out.println("Trying to delete into 0");
                } else {
                    result = leftVal / rightVal;
                }
                break;
            default:
                System.out.println("opCode value may be invalid");
                break;
        }
    }
}
