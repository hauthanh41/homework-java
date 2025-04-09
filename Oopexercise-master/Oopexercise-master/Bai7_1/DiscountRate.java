package Bai7_1;
public class DiscountRate {
    protected double serviceDiscountPrenium  = 0.2;
    protected double serviceDiscountGold = 0.15;
    protected double serviceDiscountSilver =0.1;
    protected double productDiscountPrenium = 0.1;
    protected double productDiscountGold= 0.1;
    protected double productDiscountSilver= 0.1;
    public double getServiceDiscountRate(String type){
        if (type == "Prenium"){
            return serviceDiscountPrenium;
        } else if (type == "Gold") {
            return serviceDiscountGold;
        } else if (type == "Silver") {
            return serviceDiscountSilver;
        }
        else{
            return 0.0;
        }


    }
    public double getProductDiscountRate(String type){
        if (type == "Prenium"){
            return productDiscountPrenium;
        } else if (type == "Gold") {
            return productDiscountGold;
        }else if(type == "Silver"){
            return productDiscountSilver;
        }else {
            return 0.0;
        }
    }
}

