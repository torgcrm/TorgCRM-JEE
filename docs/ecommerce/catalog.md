# Catalog resource

## Methods

|     Method     |       Description       | HTTP method |
|----------------|-------------------------|-------------|
| getCatalogList | Get catalog list        | GET         |
| createCatalog  | Create new Catalog      | POST        |
| updateCatalog  | Update existing Catalog | PATCH       |
| deleteCatalog  | Delete by id            | DELETE      |

## getCatalogList

Get list of catalog entity.

#### Input params

| Field   | Type | Description       |
|---------|------|-------------------|
| page    | int  | Current page      |
| perPage | int  | Elements per page |

#### Output params

[Catalog entity](#catalog_entity)

## createCatalog

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