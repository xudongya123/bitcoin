package com.xdy.bitcoin.po;

public class Block {
    private String blockhash;

    private Integer confirmations;

    private Integer timestamp;

    private Integer height;

    private Integer txnumber;

    private Double difficulty;

    private Integer weight;

    private String merkleroot;

    private String version;

    private Integer bits;

    private String miner;

    private Integer size;

    private Integer nonce;

    private Double txvolume;

    private Double blockreward;

    private Double feereward;

    public String getBlockhash() {
        return blockhash;
    }

    public void setBlockhash(String blockhash) {
        this.blockhash = blockhash == null ? null : blockhash.trim();
    }

    public Integer getConfirmations() {
        return confirmations;
    }

    public void setConfirmations(Integer confirmations) {
        this.confirmations = confirmations;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getTxnumber() {
        return txnumber;
    }

    public void setTxnumber(Integer txnumber) {
        this.txnumber = txnumber;
    }

    public Double getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Double difficulty) {
        this.difficulty = difficulty;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getMerkleroot() {
        return merkleroot;
    }

    public void setMerkleroot(String merkleroot) {
        this.merkleroot = merkleroot == null ? null : merkleroot.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public Integer getBits() {
        return bits;
    }

    public void setBits(Integer bits) {
        this.bits = bits;
    }

    public String getMiner() {
        return miner;
    }

    public void setMiner(String miner) {
        this.miner = miner == null ? null : miner.trim();
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getNonce() {
        return nonce;
    }

    public void setNonce(Integer nonce) {
        this.nonce = nonce;
    }

    public Double getTxvolume() {
        return txvolume;
    }

    public void setTxvolume(Double txvolume) {
        this.txvolume = txvolume;
    }

    public Double getBlockreward() {
        return blockreward;
    }

    public void setBlockreward(Double blockreward) {
        this.blockreward = blockreward;
    }

    public Double getFeereward() {
        return feereward;
    }

    public void setFeereward(Double feereward) {
        this.feereward = feereward;
    }
}