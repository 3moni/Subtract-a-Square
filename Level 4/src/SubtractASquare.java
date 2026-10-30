import java.util.Scanner;

public class SubtractASquare {

    public static final int INITIAL_COINS = 13;
    public static final int HEAP_MIN = 1;
    public static final int HEAP_MAX = 3;
    public static final int NO_COINS = 0;
    public static final int SQUARE_1 = 1;
    public static final int SQUARE_4 = 4;
    public static final int SQUARE_9 = 9;





    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int heapOne = INITIAL_COINS;
        int heapTwo = INITIAL_COINS;
        int heapThree = INITIAL_COINS;


        do { // THE WHOLE PROGRAM


            //had to declare these so theyre visible everywhere
            int playerOneHeap;
            int playerTwoHeap;
            int playerOneSqNum;
            int playerTwoSqNum;



            System.out.print("Remaining coins: " + heapOne + ", " + heapTwo + ", " + heapThree + "\n");

            /* loop to make sure user inputs an integer NOT a string
            For both Heap input AND square number input
             */

            //heap input test if its integer
            while (true) {
                System.out.print("Player 1: choose a heap: ");
                if (in.hasNextInt()) {
                    playerOneHeap = in.nextInt();
                    if (playerOneHeap >= HEAP_MIN && playerOneHeap <= HEAP_MAX) {
                        if ((playerOneHeap == 1 && heapOne > NO_COINS) ||
                                (playerOneHeap == 2 && heapTwo > NO_COINS) ||
                                (playerOneHeap == 3 && heapThree > NO_COINS)) {
                            break; //leave when valid heap is chosen
                        } else {
                            System.out.println("Sorry, that's not a legal heap choice.");
                        }
                    } else {
                        System.out.println("Sorry, that's not a legal heap choice.");
                    } //repeat again for legal but out of range heaps
                } else {
                    System.out.println("Sorry you must enter an integer or skip.");
                    in.next();
                    in.nextLine();
                }
            }

            //test if number of square coins is an integer
            while (true) {
                System.out.print("Now choose a square number of coins: ");

                if (in.hasNextInt()) {
                    playerOneSqNum = in.nextInt();

                    //test if number chosen is actually square
                    if (playerOneSqNum == SQUARE_1 || playerOneSqNum == SQUARE_4 || playerOneSqNum == SQUARE_9) {
                        // algorithm to assign heaps and deduct chosen square number from them
                        if (playerOneHeap == 1 && playerOneSqNum <= heapOne) {
                            heapOne -= playerOneSqNum;
                            break;
                        } else if (playerOneHeap == 2 && playerOneSqNum <= heapTwo) {
                            heapTwo -= playerOneSqNum;
                            break;
                        } else if (playerOneHeap == 3 && playerOneSqNum <= heapThree){
                            heapThree -= playerOneSqNum;
                            break; //used breaks to leave the algorithm when a valid square number is chosen
                        } else {
                            System.out.println("Sorry that's not a legal number of coins for that heap.");
                        }
                    } else {
                        System.out.println("Sorry that's not a legal number of coins for that heap.");
                    } /* it looks repeated but this is so it rules out any non square numbers that
                     are less than number in any heap
                     */
                } else {
                    System.out.println("Sorry you must enter an integer."); // this is for any non integer number
                    in.next();
                    in.nextLine();
                }
            }


            // determine if player 1 wins
            if (heapOne == NO_COINS && heapTwo == NO_COINS && heapThree == NO_COINS) {
                System.out.println("Player 1 wins!");
                break;
            }


            /* PLAYER 1 DONE NOW PLAYER 2!
            i copy pasted algorithms from player 1 to player 2 so the comments inside the algorithms are the same!
             */


            //Repeat the same for player 2
            System.out.print("Remaining coins: " + heapOne + ", " + heapTwo + ", " + heapThree + "\n");

            //same loop again to make sure input is integer not a string + is legal
            while (true) {
                System.out.print("Player 2: choose a heap: ");
                if (in.hasNextInt()) {
                    playerTwoHeap = in.nextInt();
                    if (playerTwoHeap >= HEAP_MIN && playerTwoHeap <= HEAP_MAX) {
                        if ((playerTwoHeap == 1 && heapOne > NO_COINS) ||
                            (playerTwoHeap == 2 && heapTwo > NO_COINS) ||
                            (playerTwoHeap == 3 && heapThree > NO_COINS)) {
                        break; //leave when valid heap is chosen
                        } else {
                            System.out.println("Sorry, that's not a legal heap choice.");
                            }
                    } else {
                        System.out.println("Sorry, that's not a legal heap choice.");
                    } //repeat again for legal but out of range heaps
                } else {
                    System.out.println("Sorry you must enter an integer or skip.");
                    in.next();
                    in.nextLine();
                }
            }


            //same as player 1 again it tests legal number is chosen + makes sure its an integer
            while (true) {
                System.out.print("Now choose a square number of coins: ");

                if (in.hasNextInt()) {
                    playerTwoSqNum = in.nextInt();

                    //test if number chosen is actually square
                    if (playerTwoSqNum == SQUARE_1 || playerTwoSqNum == SQUARE_4 || playerTwoSqNum == SQUARE_9) {
                        // algorithm to assign heaps and deduct chosen square number from them
                        if (playerTwoHeap == 1 && playerTwoSqNum <= heapOne) {
                            heapOne -= playerTwoSqNum;
                            break;
                        } else if (playerTwoHeap == 2 && playerTwoSqNum <= heapTwo) {
                            heapTwo -= playerTwoSqNum;
                            break;
                        } else if (playerTwoHeap == 3 && playerTwoSqNum <= heapThree){
                            heapThree -= playerTwoSqNum;
                            break; //used breaks to leave the algorithm when a valid square number is chosen
                        } else {
                            System.out.println("Sorry that's not a legal number of coins for that heap.");
                        }

                    } else {
                        System.out.println("Sorry that's not a legal number of coins for that heap.");
                    } /*it looks repeated but this is so it rules out any non square numbers that
                     are less than any heap
                     */
                } else {
                    System.out.println("Sorry you must enter an integer.");
                    in.next();
                    in.nextLine();
                }
            }


            // determine if player 2 wins
            if (heapOne == NO_COINS && heapTwo == NO_COINS && heapThree == NO_COINS) {
                System.out.println("Player 2 wins!");
            }



        }
        while (heapOne > NO_COINS || heapTwo > NO_COINS || heapThree > NO_COINS) ; //to keep the loop running until all 3 heaps are = 0


    }

}

