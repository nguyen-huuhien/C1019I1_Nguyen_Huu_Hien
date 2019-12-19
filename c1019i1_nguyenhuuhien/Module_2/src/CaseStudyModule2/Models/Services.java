package CaseStudyModule2.Models;

public abstract class Services {
     //id
     private String id;
     // tên dịch vụ
     private String servicesName;
     // Diện tích sử dụng
     private double areaUsed;
     // Chi phí thuê
     private double rentalCosts;
     // Số lượng người tối đa
     private int maximumPeoPleUsed;
     // Kiểu thuê (bao gồm theo năm, tháng, giờ).
     private String typeRents;

    public Services(String id, String servicesName, double areaUsed, double rentalCosts, int maximumPeoPleUsed, String typeRents) {
        this.id = id;
        this.servicesName = servicesName;
        this.areaUsed = areaUsed;
        this.rentalCosts = rentalCosts;
        this.maximumPeoPleUsed = maximumPeoPleUsed;
        this.typeRents = typeRents;
    }

    public Services() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServicesName() {
        return servicesName;
    }

    public void setServicesName(String servicesName) {
        this.servicesName = servicesName;
    }

    public double getAreaUsed() {
        return areaUsed;
    }

    public void setAreaUsed(double areaUsed) {
        this.areaUsed = areaUsed;
    }

    public double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaximumPeoPleUsed() {
        return maximumPeoPleUsed;
    }

    public void setMaximumPeoPleUsed(int maximumPeoPleUsed) {
        this.maximumPeoPleUsed = maximumPeoPleUsed;
    }

    public String getTypeRents() {
        return typeRents;
    }

    public void setTypeRents(String typeRents) {
        this.typeRents = typeRents;
    }

    public abstract String showInfo();
//    {
//        return "1.ID : " + id + "\n" +
//                "2.ServicesName : " + servicesName + "\n" +
//                "3.AreaUsed : " + areaUsed + "\n" +
//                "4.RentalCosts : " + rentalCosts + "\n" +
//                "5.MaximumPeoPleUsed : " + maximumPeoPleUsed + "\n" +
//                "6.typeRents : " + typeRents + "\n" ;
//    }

}
