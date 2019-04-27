public class Calculator {
    private int result = 0;
    public int getResult()  {
        return result;
    }
    public void add(int a, int b) {
        this.result = a+b;
    }
//==================================Money========================================
    public int won,dollar ;

    public int getWon() { return this.won; }
    public int getDollar(){ return this.dollar; }


    public void wonToDollar() { dollar = getWon() / 1200; }

}
