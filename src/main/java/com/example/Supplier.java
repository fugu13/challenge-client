package com.example;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by rduhon on 1/17/18.
 */
@XmlRootElement
public class Supplier implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private String address;
    private String contact;

    public Supplier() {}

    public Supplier(String id, String name, String address, String contact) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contact = contact;
    }

    public Supplier(String name, String address, String contact) {
        this(null, name, address, contact);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
