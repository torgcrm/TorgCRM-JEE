# Catalog resource

## Methods

|     Method     |  URL            |       Description   | HTTP method             | Secured             |
|----------------|-----------------|---------------------|-------------------------|---------------------|
| [getCatalogList](#getCatalogList)| /catalog/list       | Get catalog list        | GET         | false |
| [createCatalog](#createCatalog)  | /catalog/create     | Create new Catalog      | POST        | true  |
| [updateCatalog](#updateCatalog)  | /catalog/update     | Update existing Catalog | PATCH       | true  |
| [deleteCatalog](#deleteCatalog)  | /catalog/delete/{id}| Delete by id            | DELETE      | true  |

## <a name="getCatalogList"></a> getCatalogList

Get list of catalog entity.

#### Input params

[Page filter](#page_filter)

#### Output params

[Catalog entity](#catalog_entity)

## <a name="createCatalog"></a> createCatalog

Method for new catalog creation.

#### Input params

[Catalog entity](#catalog_entity)

#### Output params

[Catalog entity](#catalog_entity) with new ID from database sequence.

## <a name="updateCatalog"></a> updateCatalog

#### Input params

[Catalog entity](#catalog_entity)

#### Output params

## <a name="deleteCatalog"></a> deleteCatalog

#### Input params

| Field | Type | Description |
|-------|------|-------------|
| ID    | int  | Catalog id  |

#### Output params

[Catalog entity](#catalog_entity) updated.

## <a name="catalog_entity"></a> Catalog entity

| Field           | Type           | Description              |
|-----------------|----------------|--------------------------|
| title           | String         | Catalog title            |
| description     | String         | Catalog description      |
| products        | List<Products> | List of Products         |
| metaKeywords    | String         | Meta keywords for SEO    |
| metaDescription | String         | Meta description for SEO |
| slug            | String         | Slug for SEO             |
| seoText         | String         | SEO text                 |
| project         | Project        | Related project          |
| created         | Date           | Created date time        |
| updated         | Date           | Last updated date        |

## <a name="page_filter"></a> Page filter

Class for filter elements.

```java
public class PageFilter {
    private Long id;
    private String title;
    private String slug;
    private Long currentPage;
    private Long perPage;
    private Date created;
    private Date updated;
    private Long projectId;
}
```