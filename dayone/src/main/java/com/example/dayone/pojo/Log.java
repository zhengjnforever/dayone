package com.example.dayone.pojo;

public class Log {
    private Integer id;

    private String systemname;

    private String mechine;

    private String ip;

    private String browser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSystemname() {
        return systemname;
    }

    public void setSystemname(String systemname) {
        this.systemname = systemname == null ? null : systemname.trim();
    }

    public String getMechine() {
        return mechine;
    }

    public void setMechine(String mechine) {
        this.mechine = mechine == null ? null : mechine.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser == null ? null : browser.trim();
    }
}