package Bai7_1;
public class Visit extends  DiscountRate{
    private Customer customer;
    private Date date;
    public double serviceExpense;
    public double productExpense;
    public Visit(Customer customer,Date date){
        this.date = date;
        this.customer = customer;
    }
    public String getName(){
        return this.customer.getName();
    }
    public double getServiceExpense(){
        return  serviceExpense;
    }
    public void setServiceExpense(double serviceExpense){
        this.serviceExpense = serviceExpense;
    }
    public double getProductExpense(){
        return productExpense;
    }
    public void setProductExpense(double productExpense){
        this.productExpense = productExpense;
    }
    public double getTotalExpense(){
        String memberType = this.customer.getMemberType();
        double serviceDiscount = super.getServiceDiscountRate(memberType);
        double productDiscount = super.getProductDiscountRate(memberType);
        double discountedService = (1-serviceDiscount)*serviceExpense;
        double discountedProduct = (1-productDiscount)*productExpense;
        return  discountedProduct+discountedService;
    }
    public String toString() {
        return "Visit[Customer: " + customer.toString() + ", Date: " + date.toString() +
                ", Service Expense: " + serviceExpense +
                ", Product Expense: " + productExpense + "]";
    }

}

