package com.mzs.relationaldataaccess;

import lombok.Getter;
import lombok.Setter;

public class Customer {
    @Getter
    @Setter
    private long id;
    @Getter
    @Setter
    private String firstName, lastName;

    public Customer(long id,String firstName,String lastName){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    @Override
    public String toString() {
        return String.format(
            "Customer[id=%d, firstName='%s', lastName='%s']",
            id, firstName, lastName);
    }
}
