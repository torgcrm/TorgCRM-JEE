package ru.torgcrm.jee.ecommerce.utils.generators;

import ru.torgcrm.jee.ecommerce.domain.MenuItem;
import ru.torgcrm.jee.ecommerce.dto.MenuItemDTO;

import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * Menu item generator.
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Stateless
public class MenuItemGenerator extends AbstractGenerator<MenuItem, MenuItemDTO> {

    @Inject
    MenuGenerator menuGenerator;
    @Inject
    ProjectGenerator projectGenerator;

    @Override
    public MenuItem createEntity() {
        MenuItem menuItem = new MenuItem();
        menuItem.setCode(dataFactory.getRandomWord());
        menuItem.setLink(dataFactory.getRandomWord());
        menuItem.setMenu(menuGenerator.createEntity());
        menuItem.setName(dataFactory.getRandomWord());
        menuItem.setCreated(dataFactory.getDate(2018, 1, 1));
        menuItem.setUpdated(dataFactory.getDate(2018, 1, 1));
        menuItem.setProject(projectGenerator.createEntity());
        return menuItem;
    }

    @Override
    public MenuItemDTO createDto() {
        MenuItemDTO menuItemDto = new MenuItemDTO();
        menuItemDto.setCode(dataFactory.getRandomWord());
        menuItemDto.setLink(dataFactory.getRandomWord());
        menuItemDto.setMenu(menuGenerator.createDto());
        menuItemDto.setName(dataFactory.getRandomWord());
        menuItemDto.setCreated(dataFactory.getDate(2018, 1, 1));
        menuItemDto.setUpdated(dataFactory.getDate(2018, 1, 1));
        menuItemDto.setProject(projectGenerator.createDto());
        return menuItemDto;
    }
}
