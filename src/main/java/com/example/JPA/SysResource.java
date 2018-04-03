package com.example.JPA;

import javax.persistence.*;

/**
 * Created by WK on 2018/4/2.
 */

@Entity
@Table(name = "s_resource")
public class SysResource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 10)
    private int id;

    @Column(name = "resourceString", length = 100)
    private String resourceString;   //url

    @Column(name = "resourceId", length = 50)
    private String resourceId;   //资源id

    @Column(name = "remark", length =200 )
    private String remark;       //备注

    @Column(name = "resourceName",length = 400)
    private String resourceName;       //资源名称

    @Column(name = "methodName", length = 400)
    private String methodName;  //资源对应的方法名

    @Column(name = "methPath", length = 1000)
    private String methPath;     //资源对应的包路径

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getResourceString() {
        return resourceString;
    }

    public void setResourceString(String resourceString) {
        this.resourceString = resourceString;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getMethPath() {
        return methPath;
    }

    public void setMethPath(String methPath) {
        this.methPath = methPath;
    }
}
