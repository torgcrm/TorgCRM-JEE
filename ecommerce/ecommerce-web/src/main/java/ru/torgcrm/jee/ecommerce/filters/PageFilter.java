package ru.torgcrm.jee.ecommerce.filters;

import lombok.Data;

import java.util.Date;

/**
 * Page filter.
 */
@Data
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
