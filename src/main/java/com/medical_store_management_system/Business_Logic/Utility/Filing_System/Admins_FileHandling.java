package com.medical_store_management_system.Business_Logic.Utility.Filing_System;

import com.medical_store_management_system.Business_Logic.StoreAdmin;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Admins_FileHandling {
    //---------------- Adding New Admin In The File --------------------------------------------------------------------
    public static void insertAdminInFile(StoreAdmin newAdmin)
    {
        File adminFileObject= new File("Medical_Store_Filling_System/Admin_Data.txt");
        try {
            FileWriter fileWriter=new FileWriter("Medical_Store_Filling_System/Admin_Data.txt", true);
            String adminDetails=newAdmin.toString();
            fileWriter.write(adminDetails);
            fileWriter.write("\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
