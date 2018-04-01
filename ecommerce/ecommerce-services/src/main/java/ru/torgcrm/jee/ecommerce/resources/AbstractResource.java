package ru.torgcrm.jee.ecommerce.resources;

import lombok.Getter;
import ru.torgcrm.jee.ecommerce.dto.ProjectDTO;
import ru.torgcrm.jee.ecommerce.services.IProjectService;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;

/**
 * Abstract controller contains common methods
 *
 * @author Ilya Durdyev, funbanji@gmail.com
 */
public abstract class AbstractResource {
    private final String PROJECT_HOST_HEADER = "Project-Host";
    @Context
    @Getter
    private HttpServletRequest request;
    @Inject
    private IProjectService projectService;

    protected String getProjectHost() {
        return request.getHeader(PROJECT_HOST_HEADER);
    }

    protected ProjectDTO getCurrentProject() {
        return projectService.findOneByHost(getProjectHost());
    }

    protected Long getCurrentProjectId() {
        if (getCurrentProject() == null)
            return 0L;
        return getCurrentProject().getId();
    }

    protected String getOkStatus() {
        return "{status: 'ok'}";
    }
}
