package com.mail.pojo;

import java.util.Date;

public class SystemParam {
    private Integer id;

    private String pType;

    private String pKey;

    private String pValue;

    private String pValue2;

    private Date pValue3;

    private Double pValue4;

    private Date createDate;

    private String remarks;

    private String createBy;

    private Date lastUpdateDate;

    private String lastUpdateBy;

    private Integer pValueNumber;

    public SystemParam(Integer id, String pType, String pKey, String pValue, String pValue2, Date pValue3, Double pValue4, Date createDate, String remarks, String createBy, Date lastUpdateDate, String lastUpdateBy, Integer pValueNumber) {
        this.id = id;
        this.pType = pType;
        this.pKey = pKey;
        this.pValue = pValue;
        this.pValue2 = pValue2;
        this.pValue3 = pValue3;
        this.pValue4 = pValue4;
        this.createDate = createDate;
        this.remarks = remarks;
        this.createBy = createBy;
        this.lastUpdateDate = lastUpdateDate;
        this.lastUpdateBy = lastUpdateBy;
        this.pValueNumber = pValueNumber;
    }

    public SystemParam() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getpType() {
        return pType;
    }

    public void setpType(String pType) {
        this.pType = pType == null ? null : pType.trim();
    }

    public String getpKey() {
        return pKey;
    }

    public void setpKey(String pKey) {
        this.pKey = pKey == null ? null : pKey.trim();
    }

    public String getpValue() {
        return pValue;
    }

    public void setpValue(String pValue) {
        this.pValue = pValue == null ? null : pValue.trim();
    }

    public String getpValue2() {
        return pValue2;
    }

    public void setpValue2(String pValue2) {
        this.pValue2 = pValue2 == null ? null : pValue2.trim();
    }

    public Date getpValue3() {
        return pValue3;
    }

    public void setpValue3(Date pValue3) {
        this.pValue3 = pValue3;
    }

    public Double getpValue4() {
        return pValue4;
    }

    public void setpValue4(Double pValue4) {
        this.pValue4 = pValue4;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy == null ? null : lastUpdateBy.trim();
    }

    public Integer getpValueNumber() {
        return pValueNumber;
    }

    public void setpValueNumber(Integer pValueNumber) {
        this.pValueNumber = pValueNumber;
    }
}