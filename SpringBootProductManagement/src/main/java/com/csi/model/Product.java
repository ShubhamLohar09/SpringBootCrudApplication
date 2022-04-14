package com.csi.model;

import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;

@Entity
@Data
public class Product {

    private int prodId;

    private String prodName;

    private double prodPrice;

    private Date prodLaunchDate;

    private String prodCode;
}
