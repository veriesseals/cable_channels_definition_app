import java.util.Scanner;

public class CableChannels {

    public static void main(String[] args) {
        System.out.println("Hello, Welcome to the Detecting Cable Channels App!");

        try(Scanner scnr = new Scanner(System.in)) {

            int userChannel;
            char channelType;

            System.out.println("Please enter a channel number (2-499 for standard, 1002-1499 for high definition, or any other number for error):");
            userChannel = scnr.nextInt();

            if ((userChannel >= 2) && (userChannel <= 499)) {
                channelType = 's';
                System.out.println("Standard Definition Channel Detected!");
            }
            else if ((userChannel >= 1002) && (userChannel <= 1499)) {
                channelType = 'h';
                System.out.println("High Definition Channel Detected!");
            }
            else {
                channelType = 'e';
                System.out.println("Error: Invalid Channel Number!");
            }

            System.out.println("Channel type: " + channelType);

        }

    }
}
