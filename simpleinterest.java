public class simpleinterest {
    // program that claculates simple interest using methods and objects
   public static void main(String[] args) {
    simpleInterest1 calc = new simpleInterest1();
    calc.principal=100000;
    calc.rate=5;
    calc.time=5;
    calc.SI=calc.simpleInterest();

    System.out.println("Simplem interest :"+calc.SI);





   }
   static class simpleInterest1{
    double principal;
    double rate;
    int time;
    double SI;
    public double simpleInterest(){
        double SI;
        SI =(rate*principal*time)/100;
        return SI;
    }
   }
}
