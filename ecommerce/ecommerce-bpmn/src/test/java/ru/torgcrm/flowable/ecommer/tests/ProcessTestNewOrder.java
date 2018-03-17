package ru.torgcrm.flowable.ecommer.tests;

import org.flowable.engine.RepositoryService;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.runtime.ProcessInstance;
import org.flowable.engine.test.FlowableRule;
import org.junit.Rule;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertNotNull;

public class ProcessTestNewOrder {

    private String filename = "NewOrder.bpmn";

    @Rule
    public FlowableRule flowableRule = new FlowableRule();

    @Test
    public void startProcess() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(filename).getFile());
        RepositoryService repositoryService = flowableRule.getRepositoryService();
        repositoryService.createDeployment().addInputStream(filename, new FileInputStream(file)).deploy();
        RuntimeService runtimeService = flowableRule.getRuntimeService();
        Map<String, Object> variableMap = new HashMap<String, Object>();
        variableMap.put("name", "Activiti");
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("newOrder", variableMap);
        assertNotNull(processInstance.getId());
        System.out.println("id " + processInstance.getId() + " "
                + processInstance.getProcessDefinitionId());
    }
}