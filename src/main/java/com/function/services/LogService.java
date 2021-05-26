package com.function.services;

import java.util.ArrayList;
import java.util.List;

import com.function.form.LogRequest;
import com.function.models.Event;
import com.function.models.Log;

public class LogService {

    private List<Log> tasks = new ArrayList<>();

    public List<Log> getLogs() {

        List<Log> taskList = new ArrayList<>();
        taskList.add(new Log("1", "App -> clicou em investir -> selecionou", "Realizou investimento"));
        taskList.add(new Log("2", "App -> tentou acessar", "Deu erro na parte de cartões"));
        taskList.add(new Log("3", "App -> realizou login", "Chamada da API response status code: 402"));

        this.tasks.addAll(taskList);
        return this.tasks;

    }

    public Log createLog(LogRequest logRequest) {
        return new Log(logRequest.getTrace(), logRequest.getAction());
    }
}
