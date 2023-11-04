public class Nestedifcondition {
    // the  program that uses nested if statements to determine if a person is eligible to enter a club based on their age and whether they have a valid ID
        public static void main(String[] args) {
            int age = 25;
            boolean hasID = true;
    
            if (age >= 18) {
                if (hasID) {
                    System.out.println("You are eligible to enter the club.");
                } else {
                    System.out.println("You need to show valid ID to enter.");
                }
            } else {
                System.out.println("You are too young to enter the club.");
            }
        }
    }
     

