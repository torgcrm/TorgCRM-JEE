package ru.torgcrm.jee.ecommerce.utils.generators;

import ru.torgcrm.jee.ecommerce.domain.Menu;
import ru.torgcrm.jee.ecommerce.dto.MenuDTO;

import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * Menu generator.
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Stateless
public class MenuGenerator extends AbstractGenerator<Menu, MenuDTO> {

    @Inject
    ProjectGenerator projectGenerator;

    @Override
    public Menu createEntity() {
        Menu menu = new Menu();
        menu.setCode(dataFactory.getRandomWord());
        menu.setName(dataFactory.getRandomWord());
        menu.setProject(projectGenerator.createEntity());
        menu.setCreated(dataFactory.getDate(2018, 1, 2));
        menu.setUpdated(dataFactory.getDate(2018, 1, 2));
        return menu;
    }

    @Override
    public MenuDTO createDto() {
        MenuDTO menuDto = new MenuDTO();
        menuDto.setCode(dataFactory.getRandomWord());
        menuDto.setName(dataFactory.getRandomWord());
        menuDto.setProject(projectGenerator.createDto());
        menuDto.setCreated(dataFactory.getDate(2018, 1, 2));
        menuDto.setUpdated(dataFactory.getDate(2018, 1, 2));
        return menuDto;
    }
}
