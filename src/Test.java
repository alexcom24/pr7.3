import java.util.LinkedList;
import java.util.Deque;
import java.util.Scanner;
    public class Test {
        public static void main(String[] args) {
            Scanner a1 = new Scanner(System.in);
            int a;
            Deque<Integer> player1 = new LinkedList<>();
            Deque<Integer> player2 = new LinkedList<>();
            int k = 0;
            System.out.print("Введите 5 карт первого игрока: ");
            for (int i = 1; i <= 5; i++) {
                a = a1.nextInt();
                player1.addLast(a);
            }
            System.out.println("");
            System.out.print("Введите 5 карт второго игрока: ");
            for (int i = 1; i <= 5; i++) {
                a = a1.nextInt();
                player2.addLast(a);
            }
            System.out.println("");
            GameDrunk Drunk=new GameDrunk();
            Drunk.setPlayer1(player1);
            Drunk.setPlayer2(player2);
            while (k!=106) {
                k=k+1;
                Drunk.Step(player1,player2,k);
                if ((player1.peekFirst()==null) || (player2.peekFirst()==null)) break;
                if (k==106) System.out.println("botva");
            }
        }
    }
