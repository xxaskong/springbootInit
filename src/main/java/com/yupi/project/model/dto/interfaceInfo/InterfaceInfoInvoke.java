package com.yupi.project.model.dto.interfaceInfo;

import lombok.Data;

import java.io.Serializable;

/**
 * 接口调用请求
 *
 * @TableName product
 */
@Data
public class InterfaceInfoInvoke implements Serializable {

    /**
     * 主键
     */
    private Long id;


    private String userRequestParams;



    private static final long serialVersionUID = 1L;
}