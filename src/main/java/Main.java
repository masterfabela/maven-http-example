import services.ApiEuskadi;

import java.util.Calendar;

public class Main {
    public static void main(String[] args){
        System.out.println("Executing");
        ApiEuskadi.getIncidencesByDate(Calendar.getInstance()).thenAccept(result -> {
            System.out.println(result);
        }).join();
    }
}
