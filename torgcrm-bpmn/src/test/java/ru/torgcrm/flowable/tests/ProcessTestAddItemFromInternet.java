package ru.torgcrm.flowable.tests;

import org.flowable.engine.RepositoryService;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.flowable.engine.form.TaskFormData;
import org.flowable.engine.runtime.ProcessInstance;
import org.flowable.engine.test.FlowableRule;
import org.flowable.task.api.Task;
import org.junit.Rule;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertNotNull;

public class ProcessTestAddItemFromInternet {

    private String filename = "AddItemFromInternet.bpmn";
    private String settingUpParser = "SettingUpParser.bpmn";

    @Rule
    public FlowableRule flowableRule = new FlowableRule();

    @Test
    public void startProcess() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(filename).getFile());
        File file2 = new File(classLoader.getResource(settingUpParser).getFile());

        RepositoryService repositoryService = flowableRule.getRepositoryService();
        repositoryService.createDeployment().addInputStream("AddItemFromInternet.bpmn", new FileInputStream(file)).deploy();
        repositoryService.createDeployment().addInputStream("SettingUpParser.bpmn", new FileInputStream(file2)).deploy();
        RuntimeService runtimeService = flowableRule.getRuntimeService();
        Map<String, Object> variableMap = new HashMap<String, Object>();
        variableMap.put("name", "Activiti");
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("AddItemFromInternet", variableMap);
        assertNotNull(processInstance.getId());
        System.out.println("id " + processInstance.getId() + " "
                + processInstance.getProcessDefinitionId());

        TaskService taskService = flowableRule.getProcessEngine().getTaskService();
        Task task = taskService.createTaskQuery().list().get(0);
        System.out.println(task.getName());
        taskService.complete(task.getId());

        task = taskService.createTaskQuery().list().get(0);
        System.out.println(task.getName());
        Map<String, Object> params = new HashMap<>();
        params.put("valid", false);
        taskService.complete(task.getId(), params);

        task = taskService.createTaskQuery().list().get(0);
        TaskFormData taskFormData = flowableRule.getFormService().getTaskFormData(task.getId());
        System.out.println(taskFormData.getFormProperties().get(0).getName());
        System.out.println(taskFormData.getFormProperties().get(0).getValue());
        System.out.println(task.getName());

        taskService.complete(task.getId());
    }
}