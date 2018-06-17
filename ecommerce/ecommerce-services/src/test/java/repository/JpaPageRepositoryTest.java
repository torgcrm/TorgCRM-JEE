package repository;

import ru.torgcrm.jee.ecommerce.domain.Page;
import ru.torgcrm.jee.ecommerce.repository.PageRepository;
import ru.torgcrm.jee.ecommerce.utils.generators.PageGenerator;

import javax.inject.Inject;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public class JpaPageRepositoryTest extends AbstractRepositoryTest
        <Page, PageRepository, PageGenerator> {

    @Inject
    private PageRepository pageRepository;
    @Inject
    private PageGenerator pageGenerator;

    @Override
    protected PageRepository getRepository() {
        return pageRepository;
    }

    @Override
    protected PageGenerator getGenerator() {
        return pageGenerator;
    }
}
