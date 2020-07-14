package com.pz.crowd.service.impl;

import com.pz.crowd.constant.CrowdConstant;
import com.pz.crowd.entity.Menu;
import com.pz.crowd.entity.MenuExample;
import com.pz.crowd.exception.MenuFailedException;
import com.pz.crowd.mapper.MenuMapper;
import com.pz.crowd.service.api.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Menu> getAll() {
        MenuExample example = new MenuExample();
        List<Menu> menuList = menuMapper.selectByExample(example);
        return menuList;
    }

    @Override
    public void saveMenu(Menu menu) {
        if (menu.getName()==null || menu.getName().length()==0){
            throw new MenuFailedException(CrowdConstant.MESSAGE_SAVE_EMPTY_MENU_NAME_WARNING);
        }
        if (menu.getIcon()==null || menu.getIcon().length()==0){
            throw new MenuFailedException(CrowdConstant.MESSAGE_SAVE_EMPTY_MENU_ICON_WARNING);
        }

        menuMapper.insert(menu);
    }

    @Override
    public void updateMenuById(Menu menu) {
        if (menu.getName()==null || menu.getName().length()==0){
            throw new MenuFailedException(CrowdConstant.MESSAGE_SAVE_EMPTY_MENU_NAME_WARNING);
        }
        if (menu.getIcon()==null || menu.getIcon().length()==0){
            throw new MenuFailedException(CrowdConstant.MESSAGE_SAVE_EMPTY_MENU_ICON_WARNING);
        }
        menuMapper.updateByPrimaryKey(menu);
    }

    @Override
    public void removeMenuById(Long id) {
        menuMapper.deleteByPrimaryKey(id);
    }
}
