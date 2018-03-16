package ru.torgcrm.jee.ecommerce.resources;

import lombok.Data;
import org.flowable.engine.TaskService;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Path("/process")
@Stateless
public class ProcessResource extends AbstractResource {

    @Inject
    private TaskService taskService;

    @GET
    public List<TaskDTO> getActiveProcesses() {
        final List<TaskDTO> tasks = new ArrayList<>();
        taskService.createTaskQuery().active().list().forEach(task -> {
            TaskDTO taskDTO = new TaskDTO();
            taskDTO.setId(task.getId());
            taskDTO.setTaskName(task.getName());
            tasks.add(taskDTO);
        });
        return tasks;
    }

    @Data
    public static class TaskDTO {
        private String taskName;
        private String id;
    }
}
