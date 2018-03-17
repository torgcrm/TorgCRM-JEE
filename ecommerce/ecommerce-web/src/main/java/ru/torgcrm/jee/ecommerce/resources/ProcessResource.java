package ru.torgcrm.jee.ecommerce.resources;

import lombok.Data;
import org.flowable.engine.FormService;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.flowable.engine.form.TaskFormData;

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
    @Inject
    private FormService formService;
    @Inject
    private RuntimeService runtimeService;

    @GET
    public List<TaskDTO> getActiveProcesses() {
        final List<TaskDTO> tasks = new ArrayList<>();
        taskService.createTaskQuery().active().listPage(0, 5).forEach(task -> {
            TaskDTO taskDTO = new TaskDTO();
            taskDTO.setId(task.getId());
            taskDTO.setTaskName(task.getName());
            TaskFormData formData = formService.getTaskFormData(task.getId());
            tasks.add(taskDTO);
            runtimeService.deleteProcessInstance(task.getProcessInstanceId(), "End");
        });
        return tasks;
    }

    @Data
    public static class TaskDTO {
        private String taskName;
        private String id;
    }
}
