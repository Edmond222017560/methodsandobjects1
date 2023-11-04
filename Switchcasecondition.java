public class Switchcasecondition {
// the program that uses a switch-case statement to evaluate the value of a character variable grade and provide different responses based on the value
        public static void main(String[] args) {
            char grade = 'B';
    
            switch (grade) {
                case 'A':
                    System.out.println("Excellent!");
                    break;
                case 'B':
                    System.out.println("Good job!");
                    break;
                case 'C':
                    System.out.println("Satisfactory.");
                    break;
                default:
                    System.out.println("Need improvement.");
            }
        }
    }
      

