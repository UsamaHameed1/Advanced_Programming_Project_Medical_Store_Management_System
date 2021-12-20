package com.medical_store_management_system.Business_Logic.Utility.Filing_System;

import com.medical_store_management_system.Business_Logic.Medicines;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Medicines_FileHandling {
    //---------------- Adding New Medicine In The File --------------------------------------------------------------------
    public static void insertMedicineDetailsInFile(Medicines newMedicine)
    {
        File adminFileObject= new File("Medical_Store_Filling_System/Medicines_Data.txt");
        try {
            FileWriter fileWriter=new FileWriter("Medical_Store_Filling_System/Medicines_Data.txt", true);
            String medicineDetails=newMedicine.toString();
            fileWriter.write(medicineDetails);
            fileWriter.write("\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
