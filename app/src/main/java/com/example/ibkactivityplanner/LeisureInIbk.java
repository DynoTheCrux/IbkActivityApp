package com.example.ibkactivityplanner;

import java.util.ArrayList;

public class LeisureInIbk implements IbkActivity {


    ArrayList<Integer> imgResources = new ArrayList<Integer>();
    ArrayList<Boolean> actOutside = new ArrayList<Boolean>();
    ArrayList<Integer> txtResources = new ArrayList<Integer>();

    private int activityID = -1;

    LeisureInIbk() {
        imgResources.add(R.drawable.rave);
        imgResources.add(R.drawable.dating);
        imgResources.add(R.drawable.irish);

        actOutside.add(true);
        actOutside.add(false);
        actOutside.add(false);

        txtResources.add(R.string.str_Rave);
        txtResources.add(R.string.str_Date);
        txtResources.add(R.string.str_Irish);
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
