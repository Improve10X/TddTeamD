package com.improve10x.tdd.team.nameinverter2;

public class NameInverterTwo {
    public String invertName(String name) {
        if(name.equals("")){
            return "";
        }else if(!name.trim().contains(" ")){
            return name.trim();
        }
        return name;
    }
}
