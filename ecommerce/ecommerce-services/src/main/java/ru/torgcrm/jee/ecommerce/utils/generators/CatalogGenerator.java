package ru.torgcrm.jee.ecommerce.utils.generators;

import ru.torgcrm.jee.ecommerce.domain.Catalog;
import ru.torgcrm.jee.ecommerce.dto.CatalogDTO;

import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Stateless
public class CatalogGenerator extends AbstractGenerator<Catalog, CatalogDTO> {

    @Inject
    ProjectGenerator projectGenerator;

    @Override
    public Catalog createEntity() {
        Catalog catalog = new Catalog();
        catalog.setCreated(dataFactory.getDate(2018, 1, 2));
        catalog.setUpdated(dataFactory.getDate(2018, 1, 2));
        catalog.setMetaDescription(dataFactory.getRandomText(10, 150));
        catalog.setMetaKeywords(dataFactory.getRandomText(10, 150));
        catalog.setProject(projectGenerator.createEntity());
        catalog.setSeoText(dataFactory.getRandomText(100));
        catalog.setSlug(dataFactory.getRandomWord());
        catalog.setTitle(dataFactory.getRandomWord());
        return catalog;
    }

    @Override
    public CatalogDTO createDto() {
        CatalogDTO catalogDto = new CatalogDTO();
        catalogDto.setCreated(dataFactory.getDate(2018, 1, 2));
        catalogDto.setUpdated(dataFactory.getDate(2018, 1, 2));
        catalogDto.setMetaDescription(dataFactory.getRandomText(10, 150));
        catalogDto.setMetaKeywords(dataFactory.getRandomText(10, 150));
        catalogDto.setProject(projectGenerator.createDto());
        catalogDto.setSeoText(dataFactory.getRandomText(100));
        catalogDto.setSlug(dataFactory.getRandomWord());
        catalogDto.setTitle(dataFactory.getRandomWord());
        return catalogDto;
    }
}
