package com.xjhwang.types.enums;

import lombok.Getter;

/**
 * 异常码
 *
 * @author 黄雪杰 on 2024-06-11 16:39
 */
@Getter
public enum ResponseCode {
    
    SUCCESS("00000", "成功"),
    UNKNOWN_ERROR("00001", "未知失败"),
    ILLEGAL_PARAMETER("00002", "非法参数"),
    INDEX_DUP("00003", "唯一索引冲突"),
    ;
    
    private final String code;
    
    private final String info;
    
    ResponseCode(String code, String info) {
        
        this.code = code;
        this.info = info;
    }
}
