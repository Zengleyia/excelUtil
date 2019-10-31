package com.itechsun.excel.domian;

import java.io.InputStream;

public class ExcelObject {
    /**
     * ÃªÃû³Æ
     */
    private String anchorName;
    /**
     * Excel Stream
     */
    private InputStream inputStream;
    /**
     * POI Excel
     */
    private Excel excel;

    public ExcelObject(InputStream inputStream){
        this.inputStream = inputStream;
        this.excel = new Excel(this.inputStream);
    }

    public ExcelObject(String anchorName , InputStream inputStream){
        this.anchorName = anchorName;
        this.inputStream = inputStream;
        this.excel = new Excel(this.inputStream);
    }
    public String getAnchorName() {
        return anchorName;
    }
    public void setAnchorName(String anchorName) {
        this.anchorName = anchorName;
    }
    public InputStream getInputStream() {
        return this.inputStream;
    }
    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }
    public Excel getExcel() {
        return excel;
    }
}