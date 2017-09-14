package com.haipeng.bussiness.data.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vendor {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private long  uniqueNumber; // 唯一编号

    private String name;

    private String type;

    private String phone;

    private String email;

    private String address;

    private String legalRepresentative;

    private String imageAvator; //头像

    private String imageLicense;// 营业执照

    private String imageUrls;// 其他一些照片


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getUniqueNumber() {
        return uniqueNumber;
    }

    public void setUniqueNumber(Long uniqueNumber) {
        this.uniqueNumber = uniqueNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageAvator() {
        return imageAvator;
    }

    public void setImageAvator(String imageAvator) {
        this.imageAvator = imageAvator;
    }

    public String getImageLicense() {
        return imageLicense;
    }

    public void setImageLicense(String imageLicense) {
        this.imageLicense = imageLicense;
    }

    public String getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(String imageUrls) {
        this.imageUrls = imageUrls;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLegalRepresentative() {
        return legalRepresentative;
    }

    public void setLegalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative;
    }
}
