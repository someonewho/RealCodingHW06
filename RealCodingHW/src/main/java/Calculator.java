public class Calculator {
    private int result = 0;
    public int getResult()  {
        return result;
    }
    public void add(int a, int b) {
        this.result = a+b;
    }
//==================================  Money  ========================================

    public int won,dollar,pound,yen ;

    public int getWon() { return this.won; }
    public int getDollar(){ return this.dollar; }
    public int getPound() { return this.pound; }
    public int getYen() { return this.yen; }

    public void wonToDollar() { dollar = getWon() / 1200; }
    public void wonToPound() { pound = getWon() / 1500; }
    public void wonToYen() { yen = getWon() / 10; }


    public int unSignedSub(int a, int b) {
        if(a >= b) {
            return result = a - b;
        }
        else{
            return result = b - a;
        }
    }

    public int sub(int a, int b) {
        return result = a - b ;
    }
    public int mul(int a, int b) {
        return result = a * b;
    }

    public int divQuo(int a, int b) {
        return result = ((int) a/b);
    }

    public int divRmi(int a, int b) {
        int quo = divQuo(a, b);
        return result = (a- (quo * b));
    }


    public double circle(int a){
        return a*a*3.14;
    }
    public int square(int a){
        return a*a;
    }
    public double triangle(int a, int b){
        return a*b/2;
    }

}
