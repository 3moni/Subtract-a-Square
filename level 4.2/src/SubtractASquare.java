import java.util.Scanner;

public class SubtractASquare {

    public static final int INITIAL_COINS = 13;
    public static final int HEAP_MIN = 1;
    public static final int HEAP_TWO = 2;
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
        boolean gameOver = false;

        do { // THE WHOLE PROGRAM


            //had to declare these so there visible everywhere
            int playerOneHeap = 0;
            int playerTwoHeap = 0;
            int playerOneSqNum;
            int playerTwoSqNum;



            System.out.print("Remaining coins: " + heapOne + ", "
                    + heapTwo + ", " + heapThree + "\n");

            /* loop to make sure user inputs an integer NOT a string
            For both Heap input AND square number input
             */

            boolean heapChosen = false;
            while (!heapChosen) {
                System.out.print("Player 1: choose a heap: ");
                if (in.hasNextInt()) {
                    playerOneHeap = in.nextInt();
                    if (playerOneHeap >= HEAP_MIN && playerOneHeap <= HEAP_MAX) {
                        if ((playerOneHeap == HEAP_MIN && heapOne > NO_COINS)
                                || (playerOneHeap == HEAP_TWO && heapTwo > NO_COINS)
                                || (playerOneHeap == HEAP_MAX && heapThree > NO_COINS)) {
                            heapChosen = true; //leave when valid heap is chosen
                        } else {
                            System.out.println("Sorry, that's not a legal heap choice.");
                        }
                    } else {
                        System.out.println("Sorry, that's not a legal heap choice.");
                    } //repeat for legal but out of range heaps
                } else {
                    System.out.println("Sorry you must enter an integer or skip.");
                    in.next();
                    in.nextLine();
                }
            }

            boolean squareChosen = false;
            while (!squareChosen) {
                System.out.print("Now choose a square number of coins: ");

                if (in.hasNextInt()) {
                    playerOneSqNum = in.nextInt();

                    if (playerOneSqNum == SQUARE_1 || playerOneSqNum
                            == SQUARE_4 || playerOneSqNum == SQUARE_9) {
                        // algorithm to assign heaps and deduct chosen square number from them
                        if (playerOneHeap == HEAP_MIN && playerOneSqNum <= heapOne) {
                            heapOne -= playerOneSqNum;
                            squareChosen = true;
                        } else if (playerOneHeap == HEAP_TWO && playerOneSqNum <= heapTwo) {
                            heapTwo -= playerOneSqNum;
                            squareChosen = true;
                        } else if (playerOneHeap == HEAP_MAX && playerOneSqNum <= heapThree){
                            heapThree -= playerOneSqNum;
                            squareChosen = true;
                        } else {
                            System.out.println("Sorry that's not a legal number "
                                    + "of coins for that heap.");
                        }
                    } else {
                        System.out.println("Sorry that's not a legal number of "
                                + "coins for that heap.");
                    } /* it looks repeated but this is so it rules out any non-square numbers that
                     are less than number in any heap
                     */
                } else {
                    System.out.println("Sorry you must enter an integer.");
                    // this is for any non integer number
                    in.next();
                    in.nextLine();
                }
            }


            // determine if player 1 wins
            if (heapOne == NO_COINS && heapTwo == NO_COINS && heapThree == NO_COINS) {
                System.out.println("Player 1 wins!");
                gameOver = true;
            }




            if (!gameOver) {
                //Repeat the same for player 2
                System.out.print("Remaining coins: " + heapOne + ", "
                        + heapTwo + ", " + heapThree + "\n");

                //same loop again to make sure input is integer not a string + is legal
                heapChosen = false;
                while (!heapChosen) {
                    System.out.print("Player 2: choose a heap: ");
                    if (in.hasNextInt()) {
                        playerTwoHeap = in.nextInt();
                        if (playerTwoHeap >= HEAP_MIN && playerTwoHeap <= HEAP_MAX) {
                            if ((playerTwoHeap == HEAP_MIN && heapOne > NO_COINS)
                                    || (playerTwoHeap == HEAP_TWO && heapTwo > NO_COINS)
                                    || (playerTwoHeap == HEAP_MAX && heapThree > NO_COINS)) {
                                heapChosen = true; //leave when valid heap is chosen
                            } else {
                                System.out.println("Sorry, that's not a legal heap choice.");
                            }
                        } else {
                            System.out.println("Sorry, that's not a legal heap choice.");
                        } //repeat for legal but out of range heaps
                    } else {
                        System.out.println("Sorry you must enter an integer or skip.");
                        in.next();
                        in.nextLine();
                    }
                }


                //same as player 1 again it tests legal number is chosen +
                // makes sure it's an integer
                squareChosen = false;
                while (!squareChosen) {
                    System.out.print("Now choose a square number of coins: ");

                    if (in.hasNextInt()) {
                        playerTwoSqNum = in.nextInt();

                        if (playerTwoSqNum == SQUARE_1 || playerTwoSqNum == SQUARE_4
                                || playerTwoSqNum == SQUARE_9) {
                            // algorithm to assign heaps and deduct chosen square number from them
                            if (playerTwoHeap == HEAP_MIN && playerTwoSqNum <= heapOne) {
                                heapOne -= playerTwoSqNum;
                                squareChosen = true;
                            } else if (playerTwoHeap == HEAP_TWO && playerTwoSqNum <= heapTwo) {
                                heapTwo -= playerTwoSqNum;
                                squareChosen = true;
                            } else if (playerTwoHeap == HEAP_MAX && playerTwoSqNum <= heapThree) {
                                heapThree -= playerTwoSqNum;
                                squareChosen = true;
                            } else {
                                System.out.println("Sorry that's not a legal number "
                                        + "of coins for that heap.");
                            }

                        } else {
                            System.out.println("Sorry that's not a legal number "
                                    + "of coins for that heap.");
                        } /* it looks repeated but this is so it rules out
                        any non-square numbers that
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


        }
        while ((heapOne > NO_COINS || heapTwo > NO_COINS || heapThree > NO_COINS) && !gameOver);
        //to keep the loop running until all 3 heaps are = 0


    }

}

