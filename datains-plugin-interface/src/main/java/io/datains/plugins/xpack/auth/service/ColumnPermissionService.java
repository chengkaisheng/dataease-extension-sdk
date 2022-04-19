package io.datains.plugins.xpack.auth.service;

import io.datains.plugins.common.entity.XpackGridRequest;
import io.datains.plugins.common.service.PluginComponentService;
import io.datains.plugins.xpack.auth.dto.request.DataSetColumnPermissionsDTO;
import io.datains.plugins.xpack.auth.dto.request.DatasetColumnPermissions;

import java.util.List;

public abstract class ColumnPermissionService extends PluginComponentService {
    public abstract List<DataSetColumnPermissionsDTO> searchPermissions(DataSetColumnPermissionsDTO request);
    public abstract List<DataSetColumnPermissionsDTO> queryPermissions(XpackGridRequest arg0) ;
    public abstract DatasetColumnPermissions save(DatasetColumnPermissions datasetColumnPermissions);
    public abstract void delete(String id);
    public abstract List<? extends Object> authObjs(DataSetColumnPermissionsDTO request);
    public abstract DataSetColumnPermissionsDTO permissionInfo(DataSetColumnPermissionsDTO datasetRowPermissions);
}
