package com.medical_store_management_system.Business_Logic.Utility.Filing_System;

import com.medical_store_management_system.Business_Logic.StoreSalesman;

import java.io.FileWriter;
import java.io.IOException;

public class Salesman_FileHandling {
    //---------------- Adding New Medicine In The File --------------------------------------------------------------------
    public static void insertNewSalesmanInFile(StoreSalesman newSaleman)
    {

        try {
            FileWriter fileWriter=new FileWriter("Medical_Store_Filling_System/Salesman_Data.txt", true);
            String salesmanDetails=newSaleman.toString();
            fileWriter.write(salesmanDetails);
            fileWriter.write("\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
