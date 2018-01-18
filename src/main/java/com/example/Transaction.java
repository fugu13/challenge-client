package com.example;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by rduhon on 1/17/18.
 */
@XmlRootElement
public class Transaction implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private Supplier supplier;
    private Timestamp created;
    private String content;

    public Transaction() {}

    public Transaction(String id, Supplier supplier, Timestamp created, String content) {
        this.id = id;
        this.supplier = supplier;
        this.created = created;
        this.content = content;
    }

    public Transaction(Supplier supplier, String content) {
        this(null, supplier, null, content);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
