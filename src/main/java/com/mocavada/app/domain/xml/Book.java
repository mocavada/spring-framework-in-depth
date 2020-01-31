package com.mocavada.app.domain.xml;

import java.math.BigDecimal;

public class Book {
    private String bookId;
    private String name;
    private BigDecimal cost;
    private BigDecimal price;
    private String authir;
    private String sku;

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getAuthir() {
        return authir;
    }

    public void setAuthir(String authir) {
        this.authir = authir;
    }
}
