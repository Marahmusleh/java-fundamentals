import java.time.LocalDateTime;


public class Main {

    public static void main(String[] args) {
        String greeting = "Welcome to my Java program.";
        System.out.println(greeting);
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
        flipNHead(2);
        clock();

    }

    public static String pluralize(String word, int number) {
        if (number == 0 || number > 1) {
            return word + "s";
        } else {
            return word;
        }
    }

    public static void flipNHead(int num) {
        int AllOfFlips = 0;
        int flippedInRow = 0;
        while (true) {
            double randomNum = Math.random();
            if (randomNum <= 0.5) {
                System.out.println("tails");
                flippedInRow = 0;
                AllOfFlips++;
            } else {
                flippedInRow++;
                System.out.println("heads");
                if (flippedInRow == num) {
                    System.out.println("It took " + AllOfFlips + " flips to flip " + num + " head in a row.");
                    break;
                } else {
                    AllOfFlips++; // keep counting flips ,if it reach the number of heads stop counting
                }
            }
        }

    }
    public static void clock () {
        LocalDateTime now = LocalDateTime.now();

        while (true) {
            LocalDateTime currentTime = LocalDateTime.now();
            if (now.getSecond() != currentTime.getSecond()) {
                now = currentTime;
                int hour = now.getHour();
                int minute = now.getMinute();
                int second = now.getSecond();
                System.out.println(hour + ":" + minute + ":" + second);
            }
        }
    }
}