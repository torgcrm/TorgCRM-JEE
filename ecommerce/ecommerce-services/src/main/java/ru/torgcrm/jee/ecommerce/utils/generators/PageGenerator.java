package ru.torgcrm.jee.ecommerce.utils.generators;

import ru.torgcrm.jee.ecommerce.domain.Page;
import ru.torgcrm.jee.ecommerce.dto.PageDTO;

import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * Page generator.
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Stateless
public class PageGenerator extends AbstractGenerator<Page, PageDTO> {

    @Inject
    ProjectGenerator projectGenerator;

    @Override
    public Page createEntity() {
        Page page = new Page();
        page.setProject(projectGenerator.createEntity());
        page.setTitle(dataFactory.getRandomWord());
        page.setSlug(dataFactory.getRandomWord());
        page.setSeoText(dataFactory.getRandomText(100));
        page.setMetaKeywords(dataFactory.getRandomWord());
        page.setUpdated(dataFactory.getDate(2018, 1, 2));
        page.setCreated(dataFactory.getDate(2018, 1, 2));
        return page;
    }

    @Override
    public PageDTO createDto() {
        PageDTO pageDto = new PageDTO();
        pageDto.setProject(projectGenerator.createDto());
        pageDto.setTitle(dataFactory.getRandomWord());
        pageDto.setSlug(dataFactory.getRandomWord());
        pageDto.setSeoText(dataFactory.getRandomText(100));
        pageDto.setMetaKeywords(dataFactory.getRandomWord());
        pageDto.setUpdated(dataFactory.getDate(2018, 1, 2));
        pageDto.setCreated(dataFactory.getDate(2018, 1, 2));
        return pageDto;
    }
}
