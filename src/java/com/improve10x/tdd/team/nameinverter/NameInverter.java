package com.improve10x.tdd.team.nameinverter;

public class NameInverter {

    public String nameInvert(String name) {
        if (name.equals("")){
            return "";
        } else if (!name.trim().contains(" ")) {
            return name.trim();
        }else {
            String[] names = name.trim().split("\\s+");
            return names[1] + ", "+ names[0];
        }
    }
}
