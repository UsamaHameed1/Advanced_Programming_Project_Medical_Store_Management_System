package com.medical_store_management_system.Business_Logic.Utility.Filing_System;

import com.medical_store_management_system.Business_Logic.Bills;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Bills_File_Handling {

    //---------------- Adding New Bill In The File --------------------------------------------------------------------
    public static void insertBillInFile(Bills newBill)
    {
        File adminFileObject= new File("Medical_Store_Filling_System/Bills_Data.txt");
        try {
            FileWriter fileWriter=new FileWriter("Medical_Store_Filling_System/Bills_Data.txt", true);
            String billDetails=newBill.toString();
            fileWriter.write(billDetails);
            fileWriter.write("\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
