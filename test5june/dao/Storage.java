package test5june.dao;

import test5june.model.NsbtCollege;

public class Storage {
    private static NsbtCollege nsbtCollegeStorage;
    static {
        nsbtCollegeStorage = new NsbtCollege("NSBT","Noida");
    }

    private Storage(){}

    public static NsbtCollege getNsbtCollegeStorage(){

        return nsbtCollegeStorage;
    }
}
