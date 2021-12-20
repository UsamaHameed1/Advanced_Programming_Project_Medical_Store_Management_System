package com.medical_store_management_system.Business_Logic.Utility.Filing_System;

import com.medical_store_management_system.Business_Logic.StorePharmacist;

import java.io.FileWriter;
import java.io.IOException;

public class Pharmacist_FileHandling {
    //---------------- Adding New Medicine In The File --------------------------------------------------------------------
    public static void insertPharmacistInFile(StorePharmacist newPharmacist)
    {

        try {
            FileWriter fileWriter=new FileWriter("Medical_Store_Filling_System/Pharmacist_Data.txt", true);
            String pharmacistDetails=newPharmacist.toString();
            fileWriter.write(pharmacistDetails);
            fileWriter.write("\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
