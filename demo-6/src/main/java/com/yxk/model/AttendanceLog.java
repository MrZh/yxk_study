package com.yxk.model;

import java.util.Date;

public class AttendanceLog {
    private String id;

    private Date attendanceTime;

    private String userid;

    private Integer attendancetype;

    private Integer isdayoff;

    private String attendanceIp;

    private String attendanceYear;

    private String attendanceDay;

    private String attendanceMonth;

    private Date logOutTime;

    private Integer logOutType;

    private Date shouldLogOutTime;

    private Date shouldAttendanceTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Date getAttendanceTime() {
        return attendanceTime;
    }

    public void setAttendanceTime(Date attendanceTime) {
        this.attendanceTime = attendanceTime;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Integer getAttendancetype() {
        return attendancetype;
    }

    public void setAttendancetype(Integer attendancetype) {
        this.attendancetype = attendancetype;
    }

    public Integer getIsdayoff() {
        return isdayoff;
    }

    public void setIsdayoff(Integer isdayoff) {
        this.isdayoff = isdayoff;
    }

    public String getAttendanceIp() {
        return attendanceIp;
    }

    public void setAttendanceIp(String attendanceIp) {
        this.attendanceIp = attendanceIp == null ? null : attendanceIp.trim();
    }

    public String getAttendanceYear() {
        return attendanceYear;
    }

    public void setAttendanceYear(String attendanceYear) {
        this.attendanceYear = attendanceYear == null ? null : attendanceYear.trim();
    }

    public String getAttendanceDay() {
        return attendanceDay;
    }

    public void setAttendanceDay(String attendanceDay) {
        this.attendanceDay = attendanceDay == null ? null : attendanceDay.trim();
    }

    public String getAttendanceMonth() {
        return attendanceMonth;
    }

    public void setAttendanceMonth(String attendanceMonth) {
        this.attendanceMonth = attendanceMonth == null ? null : attendanceMonth.trim();
    }

    public Date getLogOutTime() {
        return logOutTime;
    }

    public void setLogOutTime(Date logOutTime) {
        this.logOutTime = logOutTime;
    }

    public Integer getLogOutType() {
        return logOutType;
    }

    public void setLogOutType(Integer logOutType) {
        this.logOutType = logOutType;
    }

    public Date getShouldLogOutTime() {
        return shouldLogOutTime;
    }

    public void setShouldLogOutTime(Date shouldLogOutTime) {
        this.shouldLogOutTime = shouldLogOutTime;
    }

    public Date getShouldAttendanceTime() {
        return shouldAttendanceTime;
    }

    public void setShouldAttendanceTime(Date shouldAttendanceTime) {
        this.shouldAttendanceTime = shouldAttendanceTime;
    }
}