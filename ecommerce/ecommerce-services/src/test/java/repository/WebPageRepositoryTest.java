package repository;

/**
 * Web page repository test.
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public interface WebPageRepositoryTest<T> extends RepositoryTest<T> {
    void findBySlugAndProjectIdTest();
}
