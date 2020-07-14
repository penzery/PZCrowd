package com.pz.crowd.service.api;

import com.pz.crowd.entity.Menu;
import com.pz.crowd.mapper.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface MenuService {

    List<Menu> getAll();

    void saveMenu(Menu menu);

    void updateMenuById(Menu menu);

    void removeMenuById(Long id);
}
