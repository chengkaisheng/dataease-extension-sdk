package io.datains.plugins.xpack.ldap.service;

import java.util.List;

import io.datains.plugins.common.entity.XpackLdapUserEntity;
import io.datains.plugins.xpack.display.dto.response.SysSettingDto;
import io.datains.plugins.xpack.ldap.dto.request.LdapValidateRequest;
import io.datains.plugins.xpack.ldap.dto.response.LdapInfo;
/* import io.datains.plugins.common.service.PluginMenuService; */
import io.datains.plugins.xpack.ldap.dto.response.ValidateResult;
import io.datains.plugins.common.service.PluginComponentService;

public abstract class LdapXpackService extends PluginComponentService /* extends PluginMenuService */{

    public abstract LdapInfo info();

    public abstract void save(List<SysSettingDto> settings);

    public abstract void testConn();

    public abstract void testLogin();

    public abstract Boolean isOpen();

    public abstract List<XpackLdapUserEntity> users();

    public abstract ValidateResult login(LdapValidateRequest request);
    
}
