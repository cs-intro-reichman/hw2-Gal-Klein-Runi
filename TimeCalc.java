public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        String inputTime = args[0];
		int totalAddMin = Integer.parseInt(args[1]);
        
        String[] parts = inputTime.split(":");
        int hours = Integer.parseInt(parts[0]); 
        int minutes = Integer.parseInt(parts[1]); 


        int newTotalMin = minutes+totalAddMin; //sum of old minutes and all the new ones
        int newMin = newTotalMin%60;
        int addHours = newTotalMin/60;

        int newHours = hours+addHours;

        if (newHours>=24) {
            newHours = newHours%24;
        }

        //fix from int to string
        String finalHours = Integer.toString(newHours);
        String finalMin = Integer.toString(newMin);
        if (newHours<10) {
            finalHours = "0"+newHours;
        } 

        if (newMin<10) {
            finalMin = "0"+newMin;
        } 
        System.out.println(finalHours+":"+finalMin);







    }
}
