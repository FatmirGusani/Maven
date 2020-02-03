package ie.gmit;

//test//
public class Calculator {

    private int firstNum;
    private int secondNum;
    private int result;


    public Calculator() {
    }

    public Calculator(int firstNum,int secondNum)
    {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.result = result;
    }

    public int getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public int getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }


    @Override
    public String toString()
    {
        return "Calulator(" +
                "first Number" + firstNum +
                "second Number" + secondNum +
                ") : " + result;
    }
}
