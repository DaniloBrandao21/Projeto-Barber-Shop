package brandao.android.barbershop_app.service.model;

public class ServiceModel{
    Integer id;
    String name;
    Float price;
    Boolean Check;

    public ServiceModel(Integer id, String name, Float price, Boolean Check) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.Check = Check;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Boolean getCheck() {
        return Check;
    }

    public void setCheck(Boolean check) {
        Check = check;
    }
}
