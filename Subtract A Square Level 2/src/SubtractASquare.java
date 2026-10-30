import java.util.Scanner;

public class SubtractASquare {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int heapOne = 13;
        int heapTwo = 13;
        int heapThree = 13;

        int playerOneHeap = 0; //had to declare it so its visible everywhere
        int playerTwoHeap = 0; //same thing here
        int playerOneSqNum = 0;
        int playerTwoSqNum = 0; //same here

        do { // THE WHOLE PROGRAM
            System.out.print("Remaining coins: " + heapOne + ", " + heapTwo + ", " + heapThree + "\n");







            /* loop to make sure user inputs an integer NOT a string
            For both Heap input AND square number input
             */

            //heap input test if its integer
            while (true) {
                System.out.print("Player 1: choose a heap: ");
                if (in.hasNextInt()) {
                    playerOneHeap = in.nextInt();
                    if (playerOneHeap == 1 || playerOneHeap == 2 || playerOneHeap == 3) {
                        break; //leave when valid heap is chosen
                    } else {
                        System.out.println("Sorry, that's not a legal heap choice.");
                    }
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
                        if (playerOneSqNum == 1 || playerOneSqNum == 4 || playerOneSqNum == 9) {
                            // algorithm to assign heaps and deduct chosen square number from them
                            if (playerOneHeap == 1) {
                                heapOne -= playerOneSqNum;
                            } else if (playerOneHeap == 2) {
                                heapTwo -= playerOneSqNum;
                            } else {
                                heapThree -= playerOneSqNum;
                            }
                            break; // leave the if algorithm when a valid square is chosen
                        } else {
                            System.out.println("Sorry that's not a legal number of coins for that heap.");
                            // no break here so the loop restarts again
                        }
                    } else {
                        System.out.println("Sorry you must enter an integer.");
                        in.next();
                        in.nextLine();
                    }
                }


                // determine if player 1 wins
                if (heapOne == 0 && heapTwo == 0 && heapThree == 0) {
                    System.out.println("Player 1 wins!");
                    break;
                }


                // PLAYER 1 DONE NOW PLAYER 2!

                // i copy pasted algorithms from player 1 to player 2 so the comments inside the algorithms are the same!


                //Repeat the same for player 2
                System.out.print("Remaining coins: " + heapOne + ", " + heapTwo + ", " + heapThree + "\n");

                //same loop again to make sure input is integer not a string + is legal
                while (true) {
                    System.out.print("Player 2: choose a heap: ");
                    if (in.hasNextInt()) {
                        playerTwoHeap = in.nextInt();
                        if (playerTwoHeap == 1 || playerTwoHeap == 2 || playerTwoHeap == 3) {
                            break; //leave when valid heap is chosen
                        } else {
                            System.out.println("Sorry, that's not a legal heap choice.");
                        }
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
                            if (playerTwoSqNum == 1 || playerTwoSqNum == 4 || playerTwoSqNum == 9) {
                                // algorithm to assign heaps and deduct chosen square number from them
                                if (playerTwoHeap == 1) {
                                    heapOne -= playerTwoSqNum;
                                } else if (playerTwoHeap == 2) {
                                    heapTwo -= playerTwoSqNum;
                                } else {
                                    heapThree -= playerTwoSqNum;
                                }
                                break; // leave the if algorithm when a valid square is chosen
                            } else {
                                System.out.println("Sorry that's not a legal number of coins for that heap.");
                                // no break here so the loop restarts again
                            }
                        } else {
                            System.out.println("Sorry you must enter an integer.");
                            in.next();
                            in.nextLine();
                        }
                    }


                    // determine if player 2 wins
                    if (heapOne == 0 && heapTwo == 0 && heapThree == 0) {
                        System.out.println("Player 2 wins!");
                    }



                }
                while (heapOne > 0 || heapTwo > 0 || heapThree > 0) ; //to keep the loop running until all 3 heaps are = 0


            }

        }

