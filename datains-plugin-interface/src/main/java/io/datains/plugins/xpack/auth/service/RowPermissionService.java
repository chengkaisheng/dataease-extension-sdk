package io.datains.plugins.xpack.auth.service;

import io.datains.plugins.common.entity.XpackGridRequest;
import io.datains.plugins.common.service.PluginComponentService;
import io.datains.plugins.xpack.auth.dto.request.DataSetRowPermissionsDTO;
import io.datains.plugins.xpack.auth.dto.request.DatasetRowPermissions;

import java.util.List;

public abstract class RowPermissionService extends PluginComponentService {
    public abstract List<DataSetRowPermissionsDTO> searchRowPermissions(DataSetRowPermissionsDTO request);
    public abstract List<DataSetRowPermissionsDTO> queryRowPermissions(XpackGridRequest arg0) ;
    public abstract void save(DatasetRowPermissions datasetRowPermissions);
    public abstract void delete(String id);
    public abstract List<? extends Object> authObjs(DataSetRowPermissionsDTO request);
    public abstract DataSetRowPermissionsDTO dataSetRowPermissionInfo(DataSetRowPermissionsDTO datasetRowPermissions);

}
