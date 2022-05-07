package com.company;

public class Booking {
    int count;
    String userName;
    String service;
    int quantity;
    double price;
    String date;
    double totalPrice;
    double orderPrice;
    String description;

    public Booking() {
    }

    public Booking(int count, String userName, String service, int quantity, double price, String date, double totalPrice, double orderPrice, String description) {
        this.count = count;
        this.userName = userName;
        this.service = service;
        this.quantity = quantity;
        this.price = price;
        this.date = date;
        this.totalPrice = totalPrice;
        this.orderPrice = orderPrice;
        this.description = description;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "count=" + count +
                ", userName='" + userName + '\'' +
                ", service='" + service + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", date='" + date + '\'' +
                ", totalPrice=" + totalPrice +
                ", orderPrice=" + orderPrice +
                ", description='" + description + '\'' +
                '}';
    }
}
