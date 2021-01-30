package patterns.creation.prototype.carParts;

import lombok.Data;

@Data
public class Product {
    private String brandName;
    private int cost;

    @Override
    public String toString() {
        return "Product{" +
                "brandName='" + brandName + '\'' +
                ", cost=" + cost +
                ", "+
                getProductInformation()+
                '}';
    }

    public String getProductInformation(){
    return    "brandName=" + getBrandName() +
            ", cost=" + getCost();
}

}
