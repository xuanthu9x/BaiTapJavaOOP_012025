package bai3.testcase;

import bai3.common.BaseTest;
import bai3.common.Constants;

import java.sql.SQLOutput;

public class Testcases extends BaseTest {

    public void Login(){
        createDiver(Constants.browser, Constants.report, Constants.headless);
        System.out.println("Access website: https://cms.anhtester.com/login" );
        System.out.println("Input username");
        System.out.println("Input password");
        System.out.println("Click Login btn");
        closeDrive(Constants.browser);
    }
    public void AddCategory(){
        createDiver(Constants.browser, Constants.report, Constants.headless);
        Login();
        System.out.println("Click menu product");
        System.out.println("Click Category to open category page");
        System.out.println("Click add category btn");
        System.out.println("Input category info ");
        System.out.println("Click Save button");
        System.out.println("Check added category");
        closeDrive(Constants.browser);
    }

    public static void main(String[] args) {

        Testcases tc = new Testcases();
        System.out.println("Login");
        tc.Login();
        System.out.println("========================================");
        System.out.println("Add category");
        tc.AddCategory();


    }
}
