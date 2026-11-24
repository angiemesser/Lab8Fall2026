
/**
 * Represents a rectangular room with a name, length, and width,
 * and provides methods to calculate its area and format its details.
 *
 * @author Angie Messer
 * @version v1.0
 * @since 11/21/2026
 */
public class RoomSize
{
    private String name; //name of the room
    private double length; //room length
    private double width; //room width
    
    /**
     * Constructs a RoomSize object with name, length, and width
     * @param inName name of the room
     * @param inLen length of the room
     * @param width width of the room
     */
    public RoomSize(String inName, double inLen,double width){
        name = inName;
        length = inLen;
        this.width = width;
    }

    /**
     * Copy constructor for RoomSize objects
     * @param object2 the RoomSize object to copy
     */
    public RoomSize(RoomSize object2){
        name = object2.name;
        length = object2.length;
        width = object2.width;
    }

    /**
     * Calculates and returns the area of the room.
     * @return room area
     */
    public double getArea(){
        return length*width;
    }

    /**
     * Returns a formatted string with room details and area. 
     * @return formatted room string
     */
    public String toString(){
        String output = String.format("Room Name: %s\nLength: %.1f\nWidth: %.1f\nArea: %.2f\n",
        name,length, width, getArea());
        return output; 
    }
}