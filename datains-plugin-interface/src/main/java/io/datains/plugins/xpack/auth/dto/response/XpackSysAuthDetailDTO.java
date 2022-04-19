package io.datains.plugins.xpack.auth.dto.response;

import io.datains.plugins.common.annotation.PluginResultMap;
import lombok.Data;

/**
 * Author: wangjiahao
 * Date: 2021-06-03
 * Description:
 */
@Data
@PluginResultMap
public class XpackSysAuthDetailDTO extends  XpackSysAuthDetail{
    private String authSource;

    private String authSourceType;

    private String authTarget;

    private String authTargetType;
}
