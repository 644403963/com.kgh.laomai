/**
 * 
 */
/**
 * @author Administrator
 *
 */
package com.kgh.upload.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "T_UPLOAD")
public class Upload implements Serializable {
    /**
     * 序号
     */
    @Id
    @Column(name = "TU_ID")
    private Long tuId;

    /**
     * 业务编号
     */
    @Column(name = "TU_FILEID")
    private String tuFileid;

    /**
     * 附件名
     */
    @Column(name = "TU_FILENAME")
    private String tuFilename;

    /**
     * 附件保存路径
     */
    @Column(name = "TU_FILEPATH")
    private String tuFilepath;

    /**
     * 创建人
     */
    @Column(name = "TU_CREATEBY")
    private String tuCreateby;

    /**
     * 创建日期
     */
    @Column(name = "TU_CREATEDATE")
    private Date tuCreatedate;

    /**
     * tab顺序
     */
    @Column(name = "TU_INDEX")
    private String tuIndex;

    /**
     * 是否删除：1 已删除 ，0 未删除
     */
    @Column(name = "TU_STATUS")
    private String tuStatus;

    /**
     * 是否原始报告：1 原始报告，0 非原始报告
     */
    @Column(name = "TU_FLAG")
    private String tuFlag;
    
    /**
     * 附件业务类型，根据业务功能区分，例如风险方案明细的附件，类型为RiskPlanDetail
     */
    @Column(name = "TU_TYPE")
    private String tuType;

    private static final long serialVersionUID = 1L;

    /**
     * 获取序号
     *
     * @return TU_ID - 序号
     */
    public Long getTuId() {
        return tuId;
    }

    /**
     * 设置序号
     *
     * @param tuId 序号
     */
    public void setTuId(Long tuId) {
        this.tuId = tuId;
    }

    /**
     * 获取业务编号
     *
     * @return TU_FILEID - 业务编号
     */
    public String getTuFileid() {
        return tuFileid;
    }

    /**
     * 设置业务编号
     *
     * @param tuFileid 业务编号
     */
    public void setTuFileid(String tuFileid) {
        this.tuFileid = tuFileid;
    }

    /**
     * 获取附件名
     *
     * @return TU_FILENAME - 附件名
     */
    public String getTuFilename() {
        return tuFilename;
    }

    /**
     * 设置附件名
     *
     * @param tuFilename 附件名
     */
    public void setTuFilename(String tuFilename) {
        this.tuFilename = tuFilename;
    }

    /**
     * 获取附件保存路径
     *
     * @return TU_FILEPATH - 附件保存路径
     */
    public String getTuFilepath() {
        return tuFilepath;
    }

    /**
     * 设置附件保存路径
     *
     * @param tuFilepath 附件保存路径
     */
    public void setTuFilepath(String tuFilepath) {
        this.tuFilepath = tuFilepath;
    }

    /**
     * 获取创建人
     *
     * @return TU_CREATEBY - 创建人
     */
    public String getTuCreateby() {
        return tuCreateby;
    }

    /**
     * 设置创建人
     *
     * @param tuCreateby 创建人
     */
    public void setTuCreateby(String tuCreateby) {
        this.tuCreateby = tuCreateby;
    }

    /**
     * 获取创建日期
     *
     * @return TU_CREATEDATE - 创建日期
     */
    public Date getTuCreatedate() {
        return tuCreatedate;
    }

    /**
     * 设置创建日期
     *
     * @param tuCreatedate 创建日期
     */
    public void setTuCreatedate(Date tuCreatedate) {
        this.tuCreatedate = tuCreatedate;
    }

    /**
     * 获取tab顺序
     *
     * @return TU_INDEX - tab顺序
     */
    public String getTuIndex() {
        return tuIndex;
    }

    /**
     * 设置tab顺序
     *
     * @param tuIndex tab顺序
     */
    public void setTuIndex(String tuIndex) {
        this.tuIndex = tuIndex;
    }

    /**
     * 获取是否删除：1 已删除 ，0 未删除
     *
     * @return TU_STATUS - 是否删除：1 已删除 ，0 未删除
     */
    public String getTuStatus() {
        return tuStatus;
    }

    /**
     * 设置是否删除：1 已删除 ，0 未删除
     *
     * @param tuStatus 是否删除：1 已删除 ，0 未删除
     */
    public void setTuStatus(String tuStatus) {
        this.tuStatus = tuStatus;
    }

    /**
     * 获取是否原始报告：1 原始报告，0 非原始报告
     *
     * @return TU_FLAG - 是否原始报告：1 原始报告，0 非原始报告
     */
    public String getTuFlag() {
        return tuFlag;
    }

    /**
     * 设置是否原始报告：1 原始报告，0 非原始报告
     *
     * @param tuFlag 是否原始报告：1 原始报告，0 非原始报告
     */
    public void setTuFlag(String tuFlag) {
        this.tuFlag = tuFlag;
    }
    
    public String getTuType() {
        return tuType;
    }

    public void setTuType(String tuType) {
        this.tuType = tuType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tuId=").append(tuId);
        sb.append(", tuFileid=").append(tuFileid);
        sb.append(", tuFilename=").append(tuFilename);
        sb.append(", tuFilepath=").append(tuFilepath);
        sb.append(", tuCreateby=").append(tuCreateby);
        sb.append(", tuCreatedate=").append(tuCreatedate);
        sb.append(", tuIndex=").append(tuIndex);
        sb.append(", tuStatus=").append(tuStatus);
        sb.append(", tuFlag=").append(tuFlag);
        sb.append(", tuType=").append(tuType);
        sb.append("]");
        return sb.toString();
    }

}