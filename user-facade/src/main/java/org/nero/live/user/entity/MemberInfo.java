package org.nero.live.user.entity;

import java.util.Date;

/**
 * 会员基本信息
 * Created by nero on 16-8-30.
 */
public class MemberInfo {
    private long memberId;
    private long memberPhone;
    private String memberName;
    private String memberEmail;
    private String memberPassword;
    private int memberSex;
    private int memberStatus;
    private String memberToken;
    private Date memberLastLoginTime;
    private Date memberCreateTime;

    public MemberInfo() {
    }

    public long getMemberId() {
        return memberId;
    }

    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }

    public long getMemberPhone() {
        return memberPhone;
    }

    public void setMemberPhone(long memberPhone) {
        this.memberPhone = memberPhone;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword;
    }

    public int getMemberSex() {
        return memberSex;
    }

    public void setMemberSex(int memberSex) {
        this.memberSex = memberSex;
    }

    public int getMemberStatus() {
        return memberStatus;
    }

    public void setMemberStatus(int memberStatus) {
        this.memberStatus = memberStatus;
    }

    public String getMemberToken() {
        return memberToken;
    }

    public void setMemberToken(String memberToken) {
        this.memberToken = memberToken;
    }

    public Date getMemberLastLoginTime() {
        return memberLastLoginTime;
    }

    public void setMemberLastLoginTime(Date memberLastLoginTime) {
        this.memberLastLoginTime = memberLastLoginTime;
    }

    public Date getMemberCreateTime() {
        return memberCreateTime;
    }

    public void setMemberCreateTime(Date memberCreateTime) {
        this.memberCreateTime = memberCreateTime;
    }

    @Override
    public String toString() {
        return "MemberInfo{" +
                "memberId=" + memberId +
                ", memberPhone=" + memberPhone +
                ", memberName='" + memberName + '\'' +
                ", memberEmail='" + memberEmail + '\'' +
                ", memberPasseord='" + memberPassword + '\'' +
                ", memberSex=" + memberSex +
                ", memberStatus=" + memberStatus +
                ", memberToken='" + memberToken + '\'' +
                ", memberLastLoginTime=" + memberLastLoginTime +
                ", memberCreateTime=" + memberCreateTime +
                '}';
    }
}
