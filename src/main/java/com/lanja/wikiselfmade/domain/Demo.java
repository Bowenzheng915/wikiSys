package com.lanja.wikiselfmade.domain;

public class Demo {
    private Integer demoId;

    private Integer value1;

    private Integer value2;

    public Integer getDemoId() {
        return demoId;
    }

    public void setDemoId(Integer demoId) {
        this.demoId = demoId;
    }

    public Integer getValue1() {
        return value1;
    }

    public void setValue1(Integer value1) {
        this.value1 = value1;
    }

    public Integer getValue2() {
        return value2;
    }

    public void setValue2(Integer value2) {
        this.value2 = value2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", demoId=").append(demoId);
        sb.append(", value1=").append(value1);
        sb.append(", value2=").append(value2);
        sb.append("]");
        return sb.toString();
    }
}