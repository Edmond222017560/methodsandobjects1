public class breakstatementwithloop2 {
    // the program that uses the break statement within a while loop. It will print the value of i until i equals 7, at which point it will break out of the loop.  
    public static void main(String[] args) {
                int i = 1;
                while (i <= 10) {
                    if (i == 7) {
                        System.out.println("Breaking the loop at i = 7");
                        break;
                    }
                    System.out.println("i = " + i);
                    i++;
                }
            }
        }
             
    

