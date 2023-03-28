package com.yupi.project.common;

import lombok.Data;

import java.io.Serializable;

/**
 * id
 *
 * @author yupi
 */
@Data
public class IDRequest implements Serializable {
    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}