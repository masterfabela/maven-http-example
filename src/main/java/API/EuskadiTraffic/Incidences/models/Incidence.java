
package API.EuskadiTraffic.Incidences.models;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Incidence implements Serializable
{

    @SerializedName("incidenceId")
    @Expose
    private String incidenceId;
    @SerializedName("sourceId")
    @Expose
    private String sourceId;
    @SerializedName("incidenceType")
    @Expose
    private String incidenceType;
    @SerializedName("autonomousRegion")
    @Expose
    private String autonomousRegion;
    @SerializedName("province")
    @Expose
    private String province;
    @SerializedName("carRegistration")
    @Expose
    private String carRegistration;
    @SerializedName("cause")
    @Expose
    private String cause;
    @SerializedName("cityTown")
    @Expose
    private String cityTown;
    @SerializedName("startDate")
    @Expose
    private String startDate;
    @SerializedName("incidenceLevel")
    @Expose
    private String incidenceLevel;
    @SerializedName("road")
    @Expose
    private String road;
    @SerializedName("pkStart")
    @Expose
    private String pkStart;
    @SerializedName("pkEnd")
    @Expose
    private String pkEnd;
    @SerializedName("direction")
    @Expose
    private String direction;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    private final static long serialVersionUID = -7484557276079382646L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Incidence() {
    }

    public Incidence(String incidenceId, String sourceId, String incidenceType, String autonomousRegion, String province, String carRegistration, String cause, String cityTown, String startDate, String incidenceLevel, String road, String pkStart, String pkEnd, String direction, String latitude, String longitude) {
        super();
        this.incidenceId = incidenceId;
        this.sourceId = sourceId;
        this.incidenceType = incidenceType;
        this.autonomousRegion = autonomousRegion;
        this.province = province;
        this.carRegistration = carRegistration;
        this.cause = cause;
        this.cityTown = cityTown;
        this.startDate = startDate;
        this.incidenceLevel = incidenceLevel;
        this.road = road;
        this.pkStart = pkStart;
        this.pkEnd = pkEnd;
        this.direction = direction;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getIncidenceId() {
        return incidenceId;
    }

    public void setIncidenceId(String incidenceId) {
        this.incidenceId = incidenceId;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getIncidenceType() {
        return incidenceType;
    }

    public void setIncidenceType(String incidenceType) {
        this.incidenceType = incidenceType;
    }

    public String getAutonomousRegion() {
        return autonomousRegion;
    }

    public void setAutonomousRegion(String autonomousRegion) {
        this.autonomousRegion = autonomousRegion;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCarRegistration() {
        return carRegistration;
    }

    public void setCarRegistration(String carRegistration) {
        this.carRegistration = carRegistration;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getCityTown() {
        return cityTown;
    }

    public void setCityTown(String cityTown) {
        this.cityTown = cityTown;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getIncidenceLevel() {
        return incidenceLevel;
    }

    public void setIncidenceLevel(String incidenceLevel) {
        this.incidenceLevel = incidenceLevel;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getPkStart() {
        return pkStart;
    }

    public void setPkStart(String pkStart) {
        this.pkStart = pkStart;
    }

    public String getPkEnd() {
        return pkEnd;
    }

    public void setPkEnd(String pkEnd) {
        this.pkEnd = pkEnd;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

}
