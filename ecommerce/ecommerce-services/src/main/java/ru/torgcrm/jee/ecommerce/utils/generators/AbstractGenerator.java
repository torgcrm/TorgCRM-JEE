package ru.torgcrm.jee.ecommerce.utils.generators;

import org.fluttercode.datafactory.impl.DataFactory;
import ru.torgcrm.jee.ecommerce.domain.GenericEntity;
import ru.torgcrm.jee.ecommerce.domain.Product;
import ru.torgcrm.jee.ecommerce.dto.GenericDTO;
import ru.torgcrm.jee.ecommerce.dto.ProductDTO;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

/**
 * Abstract generator.
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public abstract class AbstractGenerator<E extends GenericEntity, D extends GenericDTO> {

    protected DataFactory dataFactory = new DataFactory();

    public abstract E createEntity();

    public abstract D createDto();

    public List<Product> createListEntity(int quantity) {
        throw new NotImplementedException();
    }

    public List<ProductDTO> createListDto(int quantity) {
        throw new NotImplementedException();
    }
}
