package com.example.guojing.my_minresume.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.provider.ContactsContract;

import com.example.guojing.my_minresume.util.DateUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by Abhishek on 8/24/17.
 */

public class Education implements Parcelable{
    public String id;
    public String school;
    public Date startDate;
    public Date endDate;
    public List<String> courseList;

    public Education() {
        id = UUID.randomUUID().toString();
    }

    protected Education(Parcel in) {
        id = in.readString();
        school = in.readString();
        startDate = DateUtil.stringToDate(in.readString());
        endDate = DateUtil.stringToDate(in.readString());
        courseList = in.createStringArrayList();
    }

    public static final Creator<Education> CREATOR = new Creator<Education>() {
        @Override
        public Education createFromParcel(Parcel in) {
            return new Education(in);
        }

        @Override
        public Education[] newArray(int size) {
            return new Education[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(id);
        parcel.writeString(school);
        parcel.writeString(DateUtil.dateToString(startDate));
        parcel.writeString(DateUtil.dateToString(endDate));
        parcel.writeStringList(courseList);
    }
}
