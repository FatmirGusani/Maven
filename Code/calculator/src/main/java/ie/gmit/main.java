package ie.gmit;

public class main {
    public static void main(String[] args) {

        Calculator cal = new Calculator();

        cal.setFirstNum(50);
        cal.setSecondNum(60);
        cal.setResult(cal.getFirstNum() + cal.getSecondNum());

        System.out.println("First Number : " + cal.getFirstNum());
        System.out.println("Second Number : " + cal.getSecondNum());
        System.out.println("First + Second : " + cal.getResult());

    }
}
