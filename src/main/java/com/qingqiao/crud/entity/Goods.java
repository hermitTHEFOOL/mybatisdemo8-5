package com.qingqiao.crud.entity;

/**
 * @author Fan Zihan
 * @date 2022/08/05 14:49
 **/
public class Goods {

    private Integer id;
    private String name;
    private String createDate;
    private String address;
    private Integer tid;

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createDate='" + createDate + '\'' +
                ", address='" + address + '\'' +
                ", tid=" + tid +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCreateDate() {
        return createDate;
    }

    public String getAddress() {
        return address;
    }

    public Integer getTid() {
        return tid;
    }

    public Goods() {
    }

    public Goods(Integer id, String name, String createDate, String address, Integer tid) {
        this.id = id;
        this.name = name;
        this.createDate = createDate;
        this.address = address;
        this.tid = tid;
    }
}
