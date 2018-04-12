package com.sgs.transaction.producer.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orderitems")
public class Order {

    @Id
    private String uuid;

    @Column(length = 12, precision = 2, columnDefinition = "numeric")
    private double price;
    private int numberOfItems;

    public String getUuid() {
        return uuid;
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    @Override
    public String toString() {
        return "Order{" +
                "uuid='" + uuid + '\'' +
                ", price=" + price +
                ", numberOfItems=" + numberOfItems +
                '}';
    }
}
