/**
 * Solve the FizzBuzz challenge.
 */

// interesting that this is a 'class' - it doesn't have any attributes etc. - in Python would just be a function?
class FizzBuzz {

    // lots of info here. Specifies something about the class I think, but what?
    public static void main(String[] args) {

        int i = 1;

        while (i < 100) {
            i = getI(i);
        }
    }

    private static int getI(int i) {
        // private marks this method as only usable within the class

        // for comments instead of #

        // for loop syntax:
        // for (items to iterate through) {
        //  do this stuff}

        // for (int i = 1; i < 100; i++) in python would be:
        // for i in range(1, 100, 1):
        // i++ must mean we add one to i at each iteration
        // ';' used to separate rather than commas

        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // i % 3 is i mod 3

        // new variables need their type to be explicitly specified
        // use ';' to end a variable assignment
        // == is same as in python


        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            // similar syntax for if statements:
            //
            // if (logical statement) {
            //      do this stuff
            // } else if (another logical statement) {
            //      do this stuff instead
            // } else {
            //      do this stuff
            // }

            // && == python and


            // need to start with System to access: what exactly?
            // guessing that out means output, would one ever type 'in' instead?
            // println("   ") prints and then does a new line?
            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }

        i++;
        return i;
    }
}


