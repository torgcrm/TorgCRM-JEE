# Catalog resource

## Methods

|     Method     |       Description       | HTTP method |
|----------------|-------------------------|-------------|
| [getCatalogList](#getCatalogList) | Get catalog list        | GET         |
| [createCatalog](#createCatalog)   | Create new Catalog      | POST        |
| [updateCatalog](#updateCatalog)   | Update existing Catalog | PATCH       |
| [deleteCatalog](#deleteCatalog)   | Delete by id            | DELETE      |

## <a name="getCatalogList"></a> getCatalogList

Get list of catalog entity.

#### Input params

| Field   | Type | Description       |
|---------|------|-------------------|
| page    | int  | Current page      |
| perPage | int  | Elements per page |

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