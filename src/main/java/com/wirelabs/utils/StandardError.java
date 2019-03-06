package com.wirelabs.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StandardError implements Serializable {
    private static final long serialVersionUID = -2161480476443530036L;

    private Long timestamp;
    private Integer status;
    private String error;
    private String message;
    private String path;
}
