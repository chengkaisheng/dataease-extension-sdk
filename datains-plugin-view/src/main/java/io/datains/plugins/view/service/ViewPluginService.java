package io.datains.plugins.view.service;

import io.datains.plugins.common.service.PluginComponentService;
import io.datains.plugins.common.util.PluginSpringContextUtil;
import io.datains.plugins.view.entity.PluginViewParam;
import io.datains.plugins.view.entity.PluginViewType;
import io.datains.plugins.view.handler.PluginViewRSHandler;
import io.datains.plugins.view.handler.PluginViewStatHandler;
import io.datains.plugins.view.handler.impl.DefaultViewRSHandler;
import io.datains.plugins.view.handler.impl.DefaultViewStatHandler;

import java.util.List;
import java.util.Map;


public abstract class ViewPluginService extends PluginComponentService {

    protected ViewPluginBaseService viewPluginBaseService;

    private PluginViewStatHandler statHandler;

    private PluginViewRSHandler<Map> rsHandler;

    public abstract PluginViewType viewType();

    public abstract Object format(Object param);

    public String generateSQL(PluginViewParam param) {
        statHandler = new DefaultViewStatHandler();
        return statHandler.build(param, this);
    }

    public Map<String, Object> formatResult(PluginViewParam param, List<String[]> lists, Boolean isDrill) {
        rsHandler = new DefaultViewRSHandler();
        return rsHandler.format(param, lists, isDrill);
    }

    public ViewPluginBaseService getBaseService() {
        return viewPluginBaseService;
    }

    public ViewPluginService() {
        this.viewPluginBaseService = (ViewPluginBaseService)PluginSpringContextUtil.getBean("viewPluginBaseServiceImpl");
    }
}
