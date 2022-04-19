package io.datains.plugins.view.entity;

import lombok.Data;

@Data
public class PluginSingleField {

    private PluginViewSQL field;

    private PluginViewSQL sort;

    private String where;
}
