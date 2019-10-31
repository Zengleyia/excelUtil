package com.itechsun.excel.test;

import com.itechsun.excel.Excel2Pdf;
import com.itechsun.excel.domian.ExcelObject;
import com.itextpdf.text.DocumentException;
import org.junit.Test;

import java.io.*;
import java.util.Arrays;

public class TemplateTests {
    @Test
    public void testCase1OfSingle() throws IOException, DocumentException {
        String fileIn = "template/case1.xls";
        InputStream in = this.getClass().getResourceAsStream(fileIn);
        Excel2Pdf excel2Pdf = new Excel2Pdf(Arrays.asList(
                new ExcelObject(in)
        ), new FileOutputStream(fileOut(fileIn)));
        excel2Pdf.convert();
    }

    private File fileOut(String fileIn) {
        String uri = this.getClass().getResource(fileIn).getPath();
        String fileOut = uri.replaceAll(".xls$|.xlsx$",".pdf");
        File file = new File(fileOut);
        return file;
    }
}