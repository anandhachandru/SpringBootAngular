package com.ck.alpha.util.enums;

public enum MessageTypeEnum {
	
	SUCCESS("success"), ERROR("error"),WARN("warn"),INFO("info")
    ;
    private final String value;

    private  MessageTypeEnum(final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return getValue();
    }
		
	}


