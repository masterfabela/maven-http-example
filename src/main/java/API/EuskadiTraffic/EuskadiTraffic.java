package API.EuskadiTraffic;

import API.EuskadiTraffic.Incidences.models.IncidencesResponse;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Calendar;
import java.util.concurrent.CompletableFuture;

public class EuskadiTraffic {

    private static final String API_GATEWAY = "https://api.euskadi.eus/traffic";
    private static final String INICIDENCES_ENDPOINT = "/v1.0/incidences";
    private static final String DATE_INCIDENCES = "/byDate/%s/%s/%s";

    public static CompletableFuture<IncidencesResponse> getIncidencesByDate(Calendar date){
        String[] dateParams = {
                Integer.toString(date.get(Calendar.YEAR)),
                Integer.toString(date.get(Calendar.MONTH)),
                Integer.toString(date.get(Calendar.DAY_OF_MONTH))
        };
        return makeGetHttpRequest(URI.create(API_GATEWAY + INICIDENCES_ENDPOINT + DATE_INCIDENCES
                .formatted(dateParams))).thenApply((data) -> {
                    return new Gson().fromJson(data.body().toString(), IncidencesResponse.class);
                });
    }

    private static CompletableFuture<HttpResponse<String>>makeGetHttpRequest(URI url){
        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .GET().build();
        return HttpClient.newHttpClient().sendAsync(request, HttpResponse.BodyHandlers.ofString());
    }

}
