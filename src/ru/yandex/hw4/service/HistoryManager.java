package ru.yandex.hw4.service;

import ru.yandex.hw4.model.Task;

import java.util.List;

public interface HistoryManager {
    List<Task> getHistory();

    void add(Task task);

    void remove(int id);
}
