package io.datains.plugins.xpack.theme.dto;

import java.io.Serializable;

import io.datains.plugins.common.annotation.PluginResultMap;
import lombok.Data;

@Data
@PluginResultMap
public class ThemeDto implements Serializable{

    private Integer id;

    private String name;

    private String imgId;

    private String img;

    private Boolean status;
    
}
