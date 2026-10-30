import java.util.Scanner;

public class SubtractASquare {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int heapOne = 13;
        int heapTwo = 13;
        int heapThree = 13;

        do {
            System.out.print("Remaining coins: " + heapOne +", "+ heapTwo +", "+ heapThree + "\n");
            System.out.print("Player 1: choose a heap: ");
            int playerOneHeap = in.nextInt();

            //algorithm to assign heaps and deduct chosen square number from them
            System.out.print("Now choose a square number of coins: ");
            int playerOneSqNum = in.nextInt();
            if (playerOneHeap == 1) {
                heapOne -= playerOneSqNum;
            } else if (playerOneHeap == 2) {
                heapTwo -= playerOneSqNum;
            } else heapThree -= playerOneSqNum;

            // determine if player 1 wins
            if (heapOne == 0 && heapTwo == 0 && heapThree ==0) {
            System.out.println("Player 1 wins!");
            break;
            }


            //Repeat the same for player 2
            System.out.print("Remaining coins: " + heapOne +", "+ heapTwo +", "+ heapThree + "\n");
            System.out.print("Player 2: choose a heap: ");
            int playerTwoHeap = in.nextInt();

            System.out.print("Now choose a square number of coins: ");
            int playerTwoSqNum = in.nextInt();

            //algorithm to assign heaps and deduct chosen square number from them
            if (playerTwoHeap == 1) {
                heapOne -= playerTwoSqNum;
            } else if (playerTwoHeap == 2) {
                heapTwo -= playerTwoSqNum;
            } else heapThree -= playerTwoSqNum;

            // determine if player 2 wins
            if (heapOne == 0 && heapTwo == 0 && heapThree ==0) {
                System.out.println("Player 2 wins!");
            }

            //to keep the loop running until all 3 heaps are = 0
        } while (heapOne > 0 || heapTwo > 0 || heapThree > 0);



    }

}