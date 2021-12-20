package com.medical_store_management_system.Business_Logic.Utility.Filing_System;

import com.medical_store_management_system.Business_Logic.PurchasedMedicines;

import java.io.FileWriter;
import java.io.IOException;

public class PurchasedMedicines_FileHandling {

    //---------------- Adding New Medicine In The File --------------------------------------------------------------------
    public static void insertPurchasedMedicineDetailsInFile(PurchasedMedicines newPurchasedMedicine)
    {

        try {
            FileWriter fileWriter=new FileWriter("Medical_Store_Filling_System/Purchased_Medicine_Data.txt", true);
            String purchasedMedicineDetails=newPurchasedMedicine.getStringMethod();
            fileWriter.write(purchasedMedicineDetails);
            fileWriter.write("\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
