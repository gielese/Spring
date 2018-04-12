package com.sgs.transaction.producer.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private String uuid;

    private String name;
    private int loyalty;

    public String getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public int getLoyalty() {
        return loyalty;
    }

    @Override
    public String toString() {
        return "User{" +
                "uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                ", loyalty=" + loyalty +
                '}';
    }
}
