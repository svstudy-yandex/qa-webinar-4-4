package ru.yandex.hw4.service;

import ru.yandex.hw4.model.Task;

import java.util.List;

public class InMemoryTaskManager implements TaskManager {
    private final HistoryManager historyManager;

    public InMemoryTaskManager() {
        this.historyManager = Managers.getDefaultHistory();
    }

    //...

    @Override
    public List<Task> getHistory() {
        return historyManager.getHistory();
    }
}
