package com.java.rollercoaster.pojo;

import java.util.Date;

public class facility {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column facility.facility_name
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    private String facilityName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column facility.facility_status
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    private String facilityStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column facility.facility_introduction
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    private String facilityIntroduction;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column facility.facility_open_time
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    private Date facilityOpenTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column facility.facility_close_time
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    private Date facilityCloseTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column facility.queue_status
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    private Integer queueStatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column facility.facility_name
     *
     * @return the value of facility.facility_name
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    public String getFacilityName() {
        return facilityName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column facility.facility_name
     *
     * @param facilityName the value for facility.facility_name
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName == null ? null : facilityName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column facility.facility_status
     *
     * @return the value of facility.facility_status
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    public String getFacilityStatus() {
        return facilityStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column facility.facility_status
     *
     * @param facilityStatus the value for facility.facility_status
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    public void setFacilityStatus(String facilityStatus) {
        this.facilityStatus = facilityStatus == null ? null : facilityStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column facility.facility_introduction
     *
     * @return the value of facility.facility_introduction
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    public String getFacilityIntroduction() {
        return facilityIntroduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column facility.facility_introduction
     *
     * @param facilityIntroduction the value for facility.facility_introduction
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    public void setFacilityIntroduction(String facilityIntroduction) {
        this.facilityIntroduction = facilityIntroduction == null ? null : facilityIntroduction.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column facility.facility_open_time
     *
     * @return the value of facility.facility_open_time
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    public Date getFacilityOpenTime() {
        return facilityOpenTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column facility.facility_open_time
     *
     * @param facilityOpenTime the value for facility.facility_open_time
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    public void setFacilityOpenTime(Date facilityOpenTime) {
        this.facilityOpenTime = facilityOpenTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column facility.facility_close_time
     *
     * @return the value of facility.facility_close_time
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    public Date getFacilityCloseTime() {
        return facilityCloseTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column facility.facility_close_time
     *
     * @param facilityCloseTime the value for facility.facility_close_time
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    public void setFacilityCloseTime(Date facilityCloseTime) {
        this.facilityCloseTime = facilityCloseTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column facility.queue_status
     *
     * @return the value of facility.queue_status
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    public Integer getQueueStatus() {
        return queueStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column facility.queue_status
     *
     * @param queueStatus the value for facility.queue_status
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    public void setQueueStatus(Integer queueStatus) {
        this.queueStatus = queueStatus;
    }
}