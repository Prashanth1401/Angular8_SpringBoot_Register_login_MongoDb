package com.godrej.domain;





public class Customer {


    private String customerName;
    private String email;
    private Furniture furnituredetails;

    public Customer() {
    }

    public Customer(String customerName, String email, Furniture furnituredetails) {
        this.customerName = customerName;
        this.email = email;
        this.furnituredetails = furnituredetails;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Furniture getFurnituredetails() {
        return furnituredetails;
    }

    public void setFurnituredetails(Furniture furnituredetails) {
        this.furnituredetails = furnituredetails;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", email='" + email + '\'' +
                ", furnituredetails=" + furnituredetails +
                '}';
    }
}