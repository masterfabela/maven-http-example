import API.EuskadiTraffic.EuskadiTraffic;

import java.util.Calendar;

public class Main {
    public static void main(String[] args){
        System.out.println("Executing");
        // Print the names of the cities where having incidences
        EuskadiTraffic.getIncidencesByDate(Calendar.getInstance()).thenAccept(incidencesResponse -> {
            incidencesResponse.getIncidences().forEach(incidence -> {
                System.out.println(incidence.getCityTown());
            });
        }).join();
    }
}
