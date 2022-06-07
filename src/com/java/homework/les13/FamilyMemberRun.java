package com.java.homework.les13;

import com.java.common.ConsoleUtils;

import java.io.IOException;

public class FamilyMemberRun {
    public static void main(String[] args) throws IOException {
        System.out.println("Мама є? Якшо так, то як її звати? ");
        String mother = ConsoleUtils.READER.readLine();
        FamilyMember familyMemberMother = null;
        if(mother != null && !mother.isBlank()) {
            familyMemberMother = new FamilyMember(mother);
        }
        System.out.println("Папа є? Якшо так, то як його звати? ");
        String father = ConsoleUtils.READER.readLine();
        FamilyMember familyMemberFather = null;
        if(father != null && !father.isBlank()) {
            familyMemberFather = new FamilyMember(father);
        }
        System.out.println("Як тебе звати? ");
        String name = ConsoleUtils.READER.readLine();

        FamilyMember child = new FamilyMember(name, familyMemberMother, familyMemberFather);

        System.out.println("Уся сім'я: " + child);
    }
}
