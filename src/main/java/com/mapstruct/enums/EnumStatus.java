package com.mapstruct.enums;
public enum EnumStatus {
    SUCCESS("SUCCESS"),
    FAIL("FAIL"),
    ERROR("ERROR");

    private final String status;

    EnumStatus(String status){
        this.status = status;
    }

    public String status(){
        return  status;
    }
}
