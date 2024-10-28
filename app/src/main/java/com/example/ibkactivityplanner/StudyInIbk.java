package com.example.ibkactivityplanner;

import java.util.ArrayList;

public class StudyInIbk implements IbkActivity{



    ArrayList<Integer> imgResources = new ArrayList<Integer>();
    ArrayList<Boolean> actOutside = new ArrayList<Boolean>();
    ArrayList<Integer> txtResources = new ArrayList<Integer>();

    private int activityID = -1;

    StudyInIbk() {
        imgResources.add(R.drawable.robotics);
        imgResources.add(R.drawable.android);
        imgResources.add(R.drawable.studying);

        actOutside.add(false);
        actOutside.add(false);
        actOutside.add(false);

        txtResources.add(R.string.str_Robotics);
        txtResources.add(R.string.str_Android);
        txtResources.add(R.string.str_Bib);
    }


    @Override
    public void setActivity(int ID) {

        this.activityID = ID;

    }

    @Override
    public int getImage() {

        return imgResources.get(activityID);
    }

    @Override
    public int getDescription() {
        return txtResources.get(activityID);
    }

    @Override
    public boolean isOutside() {

        return actOutside.get(activityID);
    }
}
