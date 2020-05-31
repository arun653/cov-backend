package org.covn.dto;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.util.Date;

public class PatientInfoDto {

    private long patientID;
    private String firstName;
    private String lastName;
    private String sex;
    private Date dateOfBirth;
    private String householdId;
    private String covid19Status;
    private String quarantineStatus;
    private String isolationStatus;
    private Date quarantineStartDate;
    private Date quarantineEndDate;
    private String healthRequestStatus;
    private String healthRequestMessage;
    private String quarantineRequestStatus;
    private String suppliesRequestStatus;
    private String suppliesRequestMessage;
    private String healthStatusAlert;
    private String geofenceStatus;
    private String heartbeatStatus;
    private Date heartbeatTime;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private String phoneNumber1;
    private String phoneNumber1Type;
    private Boolean phoneNumber1HasSMS;
    private Boolean phoneNumber1HasInternet;
    private Boolean phoneNumber1HasWhatsapp;
    private Boolean phoneNumber1IsPrimaryUser;
    private String quarantineAddress;

    public long getPatientID() {
        return patientID;
    }

    public void setPatientID(long patientID) {
        this.patientID = patientID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getHouseholdId() {
        return householdId;
    }

    public void setHouseholdId(String householdId) {
        this.householdId = householdId;
    }

    public String getCovid19Status() {
        return covid19Status;
    }

    public void setCovid19Status(String covid19Status) {
        this.covid19Status = covid19Status;
    }

    public String getQuarantineStatus() {
        return quarantineStatus;
    }

    public void setQuarantineStatus(String quarantineStatus) {
        this.quarantineStatus = quarantineStatus;
    }

    public String getIsolationStatus() {
        return isolationStatus;
    }

    public void setIsolationStatus(String isolationStatus) {
        this.isolationStatus = isolationStatus;
    }

    public Date getQuarantineStartDate() {
        return quarantineStartDate;
    }

    public void setQuarantineStartDate(Date quarantineStartDate) {
        this.quarantineStartDate = quarantineStartDate;
    }

    public Date getQuarantineEndDate() {
        return quarantineEndDate;
    }

    public void setQuarantineEndDate(Date quarantineEndDate) {
        this.quarantineEndDate = quarantineEndDate;
    }

    public String getHealthRequestStatus() {
        return healthRequestStatus;
    }

    public void setHealthRequestStatus(String healthRequestStatus) {
        this.healthRequestStatus = healthRequestStatus;
    }

    public String getHealthRequestMessage() {
        return healthRequestMessage;
    }

    public void setHealthRequestMessage(String healthRequestMessage) {
        this.healthRequestMessage = healthRequestMessage;
    }

    public String getQuarantineRequestStatus() {
        return quarantineRequestStatus;
    }

    public void setQuarantineRequestStatus(String quarantineRequestStatus) {
        this.quarantineRequestStatus = quarantineRequestStatus;
    }

    public String getSuppliesRequestStatus() {
        return suppliesRequestStatus;
    }

    public void setSuppliesRequestStatus(String suppliesRequestStatus) {
        this.suppliesRequestStatus = suppliesRequestStatus;
    }

    public String getSuppliesRequestMessage() {
        return suppliesRequestMessage;
    }

    public void setSuppliesRequestMessage(String suppliesRequestMessage) {
        this.suppliesRequestMessage = suppliesRequestMessage;
    }

    public String getHealthStatusAlert() {
        return healthStatusAlert;
    }

    public void setHealthStatusAlert(String healthStatusAlert) {
        this.healthStatusAlert = healthStatusAlert;
    }

    public String getGeofenceStatus() {
        return geofenceStatus;
    }

    public void setGeofenceStatus(String geofenceStatus) {
        this.geofenceStatus = geofenceStatus;
    }

    public String getHeartbeatStatus() {
        return heartbeatStatus;
    }

    public void setHeartbeatStatus(String heartbeatStatus) {
        this.heartbeatStatus = heartbeatStatus;
    }

    public Date getHeartbeatTime() {
        return heartbeatTime;
    }

    public void setHeartbeatTime(Date heartbeatTime) {
        this.heartbeatTime = heartbeatTime;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public String getPhoneNumber1() {
        return phoneNumber1;
    }

    public void setPhoneNumber1(String phoneNumber1) {
        this.phoneNumber1 = phoneNumber1;
    }

    public String getPhoneNumber1Type() {
        return phoneNumber1Type;
    }

    public void setPhoneNumber1Type(String phoneNumber1Type) {
        this.phoneNumber1Type = phoneNumber1Type;
    }

    public Boolean getPhoneNumber1HasSMS() {
        return phoneNumber1HasSMS;
    }

    public void setPhoneNumber1HasSMS(Boolean phoneNumber1HasSMS) {
        this.phoneNumber1HasSMS = phoneNumber1HasSMS;
    }

    public Boolean getPhoneNumber1HasInternet() {
        return phoneNumber1HasInternet;
    }

    public void setPhoneNumber1HasInternet(Boolean phoneNumber1HasInternet) {
        this.phoneNumber1HasInternet = phoneNumber1HasInternet;
    }

    public Boolean getPhoneNumber1HasWhatsapp() {
        return phoneNumber1HasWhatsapp;
    }

    public void setPhoneNumber1HasWhatsapp(Boolean phoneNumber1HasWhatsapp) {
        this.phoneNumber1HasWhatsapp = phoneNumber1HasWhatsapp;
    }

    public Boolean getPhoneNumber1IsPrimaryUser() {
        return phoneNumber1IsPrimaryUser;
    }

    public void setPhoneNumber1IsPrimaryUser(Boolean phoneNumber1IsPrimaryUser) {
        this.phoneNumber1IsPrimaryUser = phoneNumber1IsPrimaryUser;
    }

    public String getQuarantineAddress() {
        return quarantineAddress;
    }

    public void setQuarantineAddress(String quarantineAddress) {
        this.quarantineAddress = quarantineAddress;
    }
}
