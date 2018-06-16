package repository;

/**
 * Repository test.
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public interface RepositoryTest<T> {
    void findAllTest();

    void findAllByProjectIdTest();

    void findByIdTest();

    void saveTest();

    void deleteTest();
}
