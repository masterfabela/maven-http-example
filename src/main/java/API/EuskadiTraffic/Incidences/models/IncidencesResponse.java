
package API.EuskadiTraffic.Incidences.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IncidencesResponse implements Serializable
{

    @SerializedName("totalItems")
    @Expose
    private Integer totalItems;
    @SerializedName("totalPages")
    @Expose
    private Integer totalPages;
    @SerializedName("currentPage")
    @Expose
    private Integer currentPage;
    @SerializedName("incidences")
    @Expose
    private List<Incidence> incidences = new ArrayList<Incidence>();
    private final static long serialVersionUID = 6354887741403537255L;


    public IncidencesResponse() {
    }

    public IncidencesResponse(Integer totalItems, Integer totalPages, Integer currentPage, List<Incidence> incidences) {
        super();
        this.totalItems = totalItems;
        this.totalPages = totalPages;
        this.currentPage = currentPage;
        this.incidences = incidences;
    }

    public Integer getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public List<Incidence> getIncidences() {
        return incidences;
    }

    public void setIncidences(List<Incidence> incidences) {
        this.incidences = incidences;
    }

}
