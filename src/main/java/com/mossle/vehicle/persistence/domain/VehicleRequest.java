package com.mossle.vehicle.persistence.domain;

// Generated by Hibernate Tools
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * VehicleRequest 印章申请.
 * 
 * @author Lingo
 */
@Entity
@Table(name = "VEHICLE_REQUEST")
public class VehicleRequest implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** 主键. */
    private Long id;

    /** 单号. */
    private String code;

    /** 申请人. */
    private String userId;

    /** 申请人部门编码. */
    private String deptCode;

    /** 申请人部门名称. */
    private String deptName;

    /** 创建时间. */
    private Date createTime;

    /** 状态. */
    private String status;

    /** 申请原因. */
    private String description;

    /** 多租户. */
    private String tenantId;

    /** 申请车辆. */
    private String vehicleName;

    /** 开始时间. */
    private Date startDate;

    /** 结束时间. */
    private Date endDate;

    /** 目的地. */
    private String location;

    /** 随行人员. */
    private String entorage;

    public VehicleRequest() {
    }

    public VehicleRequest(Long id) {
        this.id = id;
    }

    public VehicleRequest(Long id, String code, String userId, String deptCode,
            String deptName, Date createTime, String status,
            String description, String tenantId, String vehicleName,
            Date startDate, Date endDate, String location, String entorage) {
        this.id = id;
        this.code = code;
        this.userId = userId;
        this.deptCode = deptCode;
        this.deptName = deptName;
        this.createTime = createTime;
        this.status = status;
        this.description = description;
        this.tenantId = tenantId;
        this.vehicleName = vehicleName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.location = location;
        this.entorage = entorage;
    }

    /** @return 主键. */
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    /**
     * @param id
     *            主键.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** @return 单号. */
    @Column(name = "CODE", length = 100)
    public String getCode() {
        return this.code;
    }

    /**
     * @param code
     *            单号.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** @return 申请人. */
    @Column(name = "USER_ID", length = 64)
    public String getUserId() {
        return this.userId;
    }

    /**
     * @param userId
     *            申请人.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /** @return 申请人部门编码. */
    @Column(name = "DEPT_CODE", length = 50)
    public String getDeptCode() {
        return this.deptCode;
    }

    /**
     * @param deptCode
     *            申请人部门编码.
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    /** @return 申请人部门名称. */
    @Column(name = "DEPT_NAME", length = 200)
    public String getDeptName() {
        return this.deptName;
    }

    /**
     * @param deptName
     *            申请人部门名称.
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /** @return 创建时间. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_TIME", length = 26)
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * @param createTime
     *            创建时间.
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** @return 状态. */
    @Column(name = "STATUS", length = 50)
    public String getStatus() {
        return this.status;
    }

    /**
     * @param status
     *            状态.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** @return 申请原因. */
    @Column(name = "DESCRIPTION", length = 200)
    public String getDescription() {
        return this.description;
    }

    /**
     * @param description
     *            申请原因.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /** @return 多租户. */
    @Column(name = "TENANT_ID", length = 64)
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @param tenantId
     *            多租户.
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    /** @return 申请车辆. */
    @Column(name = "VEHICLE_NAME", length = 50)
    public String getVehicleName() {
        return this.vehicleName;
    }

    /**
     * @param vehicleName
     *            申请车辆.
     */
    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    /** @return 开始时间. */
    @Temporal(TemporalType.DATE)
    @Column(name = "START_DATE", length = 10)
    public Date getStartDate() {
        return this.startDate;
    }

    /**
     * @param startDate
     *            开始时间.
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /** @return 结束时间. */
    @Temporal(TemporalType.DATE)
    @Column(name = "END_DATE", length = 10)
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * @param endDate
     *            结束时间.
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /** @return 目的地. */
    @Column(name = "LOCATION", length = 200)
    public String getLocation() {
        return this.location;
    }

    /**
     * @param location
     *            目的地.
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /** @return 随行人员. */
    @Column(name = "ENTORAGE", length = 200)
    public String getEntorage() {
        return this.entorage;
    }

    /**
     * @param entorage
     *            随行人员.
     */
    public void setEntorage(String entorage) {
        this.entorage = entorage;
    }
}