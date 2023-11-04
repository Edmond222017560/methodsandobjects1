public class breakstatementwithloop {
    //program that uses breakstatement with loop  to enter 10 numbers and stop the loop when it reachs the number 5
    public static void main(String[] args) {
                for (int i = 1; i <= 10; i++) {
                    if (i == 5) {
                        System.out.println("Breaking the loop at i = 5");
                        break;
                    }
                    System.out.println("i = " + i);
                }
            }
        }
           
    

