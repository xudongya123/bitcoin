package com.xdy.bitcoin.po;

public class Detail {
    private String detailid;

    private Integer index;

    private String address;

    private String pkscript;

    private String sigscript;

    private String witness;

    private String details;

    private Double value;

    private String txhash;

    public String getDetailid() {
        return detailid;
    }

    public void setDetailid(String detailid) {
        this.detailid = detailid == null ? null : detailid.trim();
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPkscript() {
        return pkscript;
    }

    public void setPkscript(String pkscript) {
        this.pkscript = pkscript == null ? null : pkscript.trim();
    }

    public String getSigscript() {
        return sigscript;
    }

    public void setSigscript(String sigscript) {
        this.sigscript = sigscript == null ? null : sigscript.trim();
    }

    public String getWitness() {
        return witness;
    }

    public void setWitness(String witness) {
        this.witness = witness == null ? null : witness.trim();
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getTxhash() {
        return txhash;
    }

    public void setTxhash(String txhash) {
        this.txhash = txhash == null ? null : txhash.trim();
    }
}