package org.pt.entity;

import java.io.Serializable;

/**
 * @ClassName Order
 * @Author pt
 * @Description
 * @Date 2025/3/6 16:29
 **/
public class Order implements Serializable {
    private Long orderId;
    private String customerId;
    private String product;
    private Double amount;

    public Order(Long orderId, String customerId, String product, Double amount) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.product = product;
        this.amount = amount;
    }

    public Order() {
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customerId='" + customerId + '\'' +
                ", product='" + product + '\'' +
                ", amount=" + amount +
                '}';
    }
}
