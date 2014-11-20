package ua.artcode.week1.day2;

public class MyNumber {

    private double val;

    public MyNumber(double val) {
        this.val = val;
    }

    public MyNumber add(MyNumber other){
        double res = this.val + other.val;
        return new MyNumber(res);
    }

    public MyNumber minus(MyNumber other){
        return new MyNumber(val - other.val);
    }

    public MyNumber multiplication (MyNumber other){
        return new MyNumber(val*other.val);
    }

    public MyNumber division (MyNumber other){
        return new MyNumber(val/other.val);
    }

    public MyNumber degree (double i){
        double res = val;
        if (i==0){
            return new MyNumber (val/val);
        }
        else {
            for (double a=i;a>1;a--){
                res *= val;
            }return new MyNumber(res);
        }
    }

    public MyNumber factorial (){
        double res = 1;
        if (val==1){
            return new MyNumber (val);
        }
        else {
            for (double a=val;a>1;a--){
                res *= a;
            }return new MyNumber(res);
        }
    }


    public MyNumber rest (MyNumber other){
        return new MyNumber(val%other.val);
    }

    public MyNumber max (MyNumber other){
        MyNumber a = new MyNumber(val/other.val);
        if (val>other.val) return new MyNumber (val);
        else return new MyNumber (other.val);
    }

    public double getVal(){
        return val;
    }

}
