package com.improve10x.tdd.vani;

public class Intelligent extends Student{
    private int moreMarks;

    public Intelligent(int moreMarks) {
        super("dimple", 90, "10A");
        this.moreMarks = moreMarks;
    }

    public int getMoreMarks() {
        return moreMarks;
    }

    public void setMoreMarks(int moreMarks) {
        this.moreMarks = moreMarks;
    }

    public void extraTimeToSpendLearning(){}
    public void extraTimeToSpendWriting(){}
    public void dontPlay(){}
    public void dontSpendMoreTimeWatchTv(){}
    public void dontWasteTime(){
        System.out.println(getName() + " dont waste time......... " + getMoreMarks());
    }

}
