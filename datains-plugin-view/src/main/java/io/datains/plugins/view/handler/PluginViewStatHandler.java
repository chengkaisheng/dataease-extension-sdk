package io.datains.plugins.view.handler;

import io.datains.plugins.view.entity.PluginViewParam;
import io.datains.plugins.view.service.ViewPluginService;

/**
 * 如果要对视图sql拼接重新调整 请实现这个接口
 */
public interface PluginViewStatHandler {


    String build(PluginViewParam pluginViewParam, ViewPluginService viewPluginService);
}
