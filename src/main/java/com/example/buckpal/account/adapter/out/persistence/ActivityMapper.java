package com.example.buckpal.account.adapter.out.persistence;

import com.example.buckpal.account.domain.Activity;

import java.util.Date;

public class ActivityMapper {

    public Activity mapToDomainEntity(String activityName, Date activityDate){
        return new Activity();
    }
}
