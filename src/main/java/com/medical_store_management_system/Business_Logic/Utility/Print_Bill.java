package com.medical_store_management_system.Business_Logic.Utility;

import com.medical_store_management_system.Business_Logic.Bills;

import com.medical_store_management_system.Business_Logic.PurchasedMedicines;

import java.io.*;


public class Print_Bill {
    public static void printBill(Bills newBillToPrint)
    {
        //--------------- Creating A New File --------------------------------------------------------------------------
        String fileName="Customer_Invoices\\Bill_"+ newBillToPrint.getBillNo()+".txt";
        File newBillTxt =new File(fileName);
        try {
            if(newBillTxt.createNewFile())
            {
                System.out.println("New Bill Created");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        //-------------- Opening The File And Prepared The Bill --------------------------------------------------------
        int srNoCounter=1;
        try {
            FileWriter openBillFile=new FileWriter(fileName);

            //------------------------ Writing Bill Content To The File -----------------------------------------------
            openBillFile.write("\t\tABC Medical Store\n");
            openBillFile.write("\t\t\tCustomer Bill\n");
            openBillFile.write("----------------------------------------\n");
            openBillFile.write("Customer Name : "+newBillToPrint.getCustomerName()+"\n");
            openBillFile.write("Customer PhoneNo : "+newBillToPrint.getCustomerPhoneNo()+"\n");
            openBillFile.write("Bill No : "+newBillToPrint.getBillNo()+"\n");
            openBillFile.write("Salesman Name : "+newBillToPrint.getSalesmanName()+"\n");
            openBillFile.write("Payment Method : "+newBillToPrint.getPaymentMethod()+"\n");
            openBillFile.write("----------------------------------------\n");
            openBillFile.write("\t\t\tList of Medicines Purchased\n");

            openBillFile.write("Sr.No \t\tMedicine Name \t\tExpiryDate\t\t Unit Price \t\t Qty \t\t Amount\n");
            for (PurchasedMedicines purchasedMedicine : newBillToPrint.getListofAllMedicinesPurchased())
            {
                String medicineDetailsInLine=srNoCounter+ "\t\t\t" +purchasedMedicine.toString();
                openBillFile.write(medicineDetailsInLine+"\n");
                ++srNoCounter;
            }

            openBillFile.write("\n\n--------------------------------------------------\n\n");

            openBillFile.write("\t\tTotal Amount : "+newBillToPrint.getTotalAmountOfBill()+"\n");
            openBillFile.write("\t\tDiscount (%) : "+newBillToPrint.getDiscountPercentage()+"\n");
            openBillFile.write("\t\tSavings on Bill : "+newBillToPrint.getTotalSavingsOnBill()+"\n");
            openBillFile.write("\t\tTotal Payable Bill : "+newBillToPrint.getTotalPayableBill()+"\n");
            openBillFile.write("\t\tAmount Paid By Customer : "+newBillToPrint.getCashGivenByCustomer()+"\n");
            openBillFile.write("\t\tChange Amount : "+newBillToPrint.getChangeOfCashGivenBackToCustomer()+"\n");

            openBillFile.write("--------------------------------------------------\n");
            openBillFile.write("In Case Of Query Feel Free To Contact Us");

            openBillFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        Print_Bill x=new Print_Bill();
//        x.printJob(newBillToPrint);
    }

//    public void printJob(Bills newBill) {
//        FileInputStream textStream =null;
//        String path="Customer_Invoices\\Bill_"+ newBill.getBillNo()+".txt";;
//        try {
//            textStream = new FileInputStream(path);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        DocFlavor flavor = DocFlavor.INPUT_STREAM.AUTOSENSE;
//        Doc mydoc = new SimpleDoc(textStream, flavor, null);
//
//        PrintRequestAttributeSet aset =
//                new HashPrintRequestAttributeSet();
//        aset.add(new Copies(1));
//
//
//        PrintService[] services = PrintServiceLookup.lookupPrintServices(
//                flavor, aset);
//        PrintService defaultService = PrintServiceLookup.lookupDefaultPrintService();
//
//        if(services.length == 0) {
//            if(defaultService == null) {
//                //no printer found
//
//            } else {
//                //print using default
//                DocPrintJob job = defaultService.createPrintJob();
//                try {
//                    job.print(mydoc, aset);
//                } catch (PrintException e) {
//                    e.printStackTrace();
//                }
//
//            }
//
//        } else {
//
//            //built in UI for printing you may not use this
//            PrintService service = ServiceUI.printDialog(null, 200, 200, services, defaultService, flavor, aset);
//
//
//            if (service != null)
//            {
//                DocPrintJob job = service.createPrintJob();
//                try {
//                    job.print(mydoc, aset);
//                } catch (PrintException e) {
//                    e.printStackTrace();
//                }
//            }
//
//        }
//    }

    public static void main(String[] args) {

    }
}



