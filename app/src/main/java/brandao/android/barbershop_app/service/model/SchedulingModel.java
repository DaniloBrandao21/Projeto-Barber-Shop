package brandao.android.barbershop_app.service.model;

import java.util.ArrayList;
import java.util.List;

public class SchedulingModel {

    String clientName;
    List<ServiceModel> serviceList = new ArrayList<>();
    String date;
    Float finalPrice;
    String time;
    String employeeName;

    public SchedulingModel(String clientName, List<ServiceModel> serviceClassList,
                           String date, Float finalPrice,
                           String time, String employeeName){

        this.clientName = clientName;
        this.serviceList = serviceClassList;
        this.date = date;
        this.finalPrice = finalPrice;
        this.time = time;
        this.employeeName = employeeName;
    }

    public SchedulingModel() {
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public List<ServiceModel> getServiceList() {
        return serviceList;
    }

    public void setServiceList(List<ServiceModel> serviceList) {
        this.serviceList = serviceList;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Float getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(Float finalPrice) {
        this.finalPrice = finalPrice;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
