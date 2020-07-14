package com.pz.crowd.mvc.controller;

import com.pz.crowd.entity.Menu;
import com.pz.crowd.service.api.MenuService;
import com.pz.crowd.util.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MenuController {

    @Autowired
    private MenuService menuService;

    @RequestMapping("/menu/get/wholeTree.json")
    public ResultEntity<Menu> getWholeTree(){

        List<Menu> menuList = menuService.getAll();

        Menu root=null;
        Map<Long,Menu> menuMap = new HashMap<>();
        for (Menu menu : menuList){
            menuMap.put(menu.getId(),menu);
        }

        for (Menu menu : menuList){
            if (menu.getPid() == null){
                root = menu;
                continue;
            }

            Menu menu1 = menuMap.get(menu.getPid());

            menu1.children.add(menu);
        }
        ResultEntity<Menu> menuResultEntity = ResultEntity.successWithData(root);

        return menuResultEntity;
    }

    @RequestMapping("/menu/save.json")
    public ResultEntity saveMenu(Menu menu){
        menuService.saveMenu(menu);
        return ResultEntity.successWithoutData();
    }

    @RequestMapping("/menu/update.json")
    public ResultEntity updateMenu(Menu menu){
        menuService.updateMenuById(menu);
        return ResultEntity.successWithoutData();
    }

    @RequestMapping("/menu/remove.json")
    public ResultEntity removeMenu(@RequestParam("id") Long id){
        menuService.removeMenuById(id);
        return ResultEntity.successWithoutData();
    }
}
