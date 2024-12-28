package springframework.beans;

/**
 * @className: Car
 * @author: zhangguowei
 * @date: 2024/12/14 21:18
 * @Version: 1.0
 * @description:
 */
public class Car {

    private String brand;

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
