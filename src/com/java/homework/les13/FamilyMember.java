package com.java.homework.les13;

public class FamilyMember {
    String name;
    FamilyMember mother;
    FamilyMember father;

    public FamilyMember(String name) {
        this.name = name;
    }

    public FamilyMember(String name, FamilyMember mother, FamilyMember father) {
        this.name = name;
        this.mother = mother;
        this.father = father;
    }

    @Override
    public String toString() {
        String fatherInfo = father != null ? "" + father.name : "Немає батька";
        String motherInfo = mother != null ? "" + mother.name : "Немає мати";
        return
                "Name: " + name
                        + ";  Mother: " + motherInfo
                        + "; Father: " + fatherInfo;
    }

}
