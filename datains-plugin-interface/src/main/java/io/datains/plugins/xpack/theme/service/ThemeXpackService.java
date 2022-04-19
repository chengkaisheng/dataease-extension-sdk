package io.datains.plugins.xpack.theme.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import io.datains.plugins.common.service.PluginComponentService;
import io.datains.plugins.xpack.theme.dto.ThemeDto;
import io.datains.plugins.xpack.theme.dto.ThemeItem;
import io.datains.plugins.xpack.theme.dto.ThemeRequest;

public abstract class ThemeXpackService extends PluginComponentService{

    public abstract List<ThemeDto> themes();

    public abstract void save(ThemeRequest request, MultipartFile file);

    public abstract List<ThemeItem> queryItems(int id);

    public abstract void deleteTheme(int id);
    
}
