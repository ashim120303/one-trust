package com.pack.onetrust.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Trusted {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // или другая стратегия генерации ключа
    private Long id;
    private String trustedName;
    private String trusterName;
    private String inn;
    private String kpp;
    private String oklo;
    private String address;
    private String name;
    private String number;
    private String year;
    private String color;
    private String body;
    private String idNumber;
    private LocalDate date;

    @OneToOne(mappedBy = "trusted")
    private Truster truster;
    // Геттеры и сеттеры для полей (можно сгенерировать автоматически)

    // Дополнительные методы, если необходимо


    public Truster getTruster() {
        return truster;
    }

    public void setTruster(Truster truster) {
        this.truster = truster;
    }

    public String getTrustedName() {
        return trustedName;
    }

    public void setTrustedName(String trustedName) {
        this.trustedName = trustedName;
    }

    public String getTrusterName() {
        return trusterName;
    }

    public void setTrusterName(String trusterName) {
        this.trusterName = trusterName;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getKpp() {
        return kpp;
    }

    public void setKpp(String kpp) {
        this.kpp = kpp;
    }

    public String getOklo() {
        return oklo;
    }

    public void setOklo(String oklo) {
        this.oklo = oklo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
