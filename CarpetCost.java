
/**
 * Calculates the total cost to carpet a room based on its RoomSize 
 * and the price per square foot.
 *
 * @author Angie Messer
 * @version v1.0
 * @since 11/21/2026
 */
public class CarpetCost
{
    //vars
    private RoomSize size;
    private double costPerSqFt;
    
    /**
     * Constructs a CarpetCost object with a copy of the given RoomSize and cost per sq ft.
     * @param area the RoomSize of the room to carpet
     * @param cost the cost per square foot
     */
    public CarpetCost (RoomSize area, double cost){
        size = new RoomSize(area);
        costPerSqFt = cost;
    }
    /**
     * Calculates and returns the total carpet cost.
     * @return carpet cost
     */
    public double getCost(){ 
        return size.getArea()*costPerSqFt;
         }
         /**
          * Returns formatted room details along with cost per sq ft and total cost
          * @return formatted carpet cost summary
          */
         public String toString(){
             //The cost per sq ft is: $6.97
             //The total cost is: $607.44
             double totalCost = size.getArea()*costPerSqFt;
             
             String output = size + String.format("The cost per sq ft is: $%,.2f\nThe total cost is: $%,.2f\n",
             costPerSqFt, totalCost);
             return output;
         }
}