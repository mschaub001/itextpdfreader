/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ms.itextpdfreader;

//iText imports
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import java.io.IOException;

/**
 *
 * @author ms
 */
public class itextPDFreader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            PdfReader reader = new PdfReader("c:/temp/O_Lehrpersonen.pdf");
            System.out.println("This PDF has " + reader.getNumberOfPages() + " pages.");
            String page = PdfTextExtractor.getTextFromPage(reader, 2);
            System.out.println("Page Content:\n\n" + page + "\n\n");
            System.out.println("Is this document tampered: " + reader.isTampered());
            System.out.println("Is this document encrypted: " + reader.isEncrypted());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
