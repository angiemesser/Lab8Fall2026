import java.util.Scanner;
/**
 * Driver class that prompts the user for room dimensions and carpet cost,
 * Then displays the formatted area and total cost for each room.
 *
 * @author Angie Messer
 * @version v1.0
 * @since 11/24/2026
 */
public class CarpetClassDemo
{
    public static void main (String[] args){
        //Enter Room Name: Master Room
        // Enter room length: 8.3
        // Enter room width: 10.5
        // Enter cost per square foot: 6.97
        // Room Name: Master Room
        // Length: 8.3
        // Width: 10.5
        // Area: 87.15
        // The cost per sq ft is: $6.97
        // The total cost is: $607.44

        //vars
        String name, clear;
        double length, width, cost; 

        //Input 
        Scanner keyboard = new Scanner(System.in);

        //Room1
        System.out.print("Enter Room Name: ");
        name = keyboard.nextLine();
        System.out.print("Enter Room length: ");
        length = keyboard.nextDouble();
        System.out.print("Enter Room Width: ");
        width = keyboard.nextDouble();
        System.out.print("Enter cost per square foot: ");
        cost = keyboard.nextDouble();
        RoomSize room = new RoomSize(name, length, width);
        CarpetCost masterRoom = new CarpetCost(room, cost);
        System.out.println(masterRoom);
        clear = keyboard.nextLine(); //consumes carriage for cost nextDouble()
        
        //Room2
        System.out.print("Enter Room Name: ");
        name = keyboard.nextLine();
        System.out.print("Enter Room length: ");
        length = keyboard.nextDouble();
        System.out.print("Enter Room Width: ");
        width = keyboard.nextDouble();
        System.out.print("Enter cost per square foot: ");
        cost = keyboard.nextDouble();
        CarpetCost livingRoom = new CarpetCost(new RoomSize(name, length, width), cost);
        System.out.println(livingRoom);
        
    }
}