package com.example.model;

import java.io.Serializable;

public class Drug implements Serializable {
    private String id;

    private String name;

    private String specs;

    private String dnVaule;

    private String dosage;

    private String dosageForm;

    private String sccj;

    private String packaged;

    private String bwm;

    private static final long serialVersionUID = 1L;

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

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    public String getDnVaule() {
        return dnVaule;
    }

    public void setDnVaule(String dnVaule) {
        this.dnVaule = dnVaule;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getDosageForm() {
        return dosageForm;
    }

    public void setDosageForm(String dosageForm) {
        this.dosageForm = dosageForm;
    }

    public String getSccj() {
        return sccj;
    }

    public void setSccj(String sccj) {
        this.sccj = sccj;
    }

    public String getPackaged() {
        return packaged;
    }

    public void setPackaged(String packaged) {
        this.packaged = packaged;
    }

    public String getBwm() {
        return bwm;
    }

    public void setBwm(String bwm) {
        this.bwm = bwm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", specs=").append(specs);
        sb.append(", dnVaule=").append(dnVaule);
        sb.append(", dosage=").append(dosage);
        sb.append(", dosageForm=").append(dosageForm);
        sb.append(", sccj=").append(sccj);
        sb.append(", packaged=").append(packaged);
        sb.append(", bwm=").append(bwm);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}