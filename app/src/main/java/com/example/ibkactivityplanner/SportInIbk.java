package com.example.ibkactivityplanner;

import java.util.ArrayList;

public class SportInIbk implements IbkActivity{


    ArrayList<Integer> imgResources = new ArrayList<Integer>();
    ArrayList<Boolean> actOutside = new ArrayList<Boolean>();
    ArrayList<Integer> txtResources = new ArrayList<Integer>();

    private int activityID = -1;

    SportInIbk() {
        imgResources.add(R.drawable.ki);
        imgResources.add(R.drawable.aat);
        imgResources.add(R.drawable.l_senerfernerkogel);

        actOutside.add(false);
        actOutside.add(true);
        actOutside.add(true);

        txtResources.add(R.string.str_ki);
        txtResources.add(R.string.str_AAT);
        txtResources.add(R.string.str_ferner);
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
