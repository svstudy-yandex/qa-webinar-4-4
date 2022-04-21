package ru.yandex.hw4;

import ru.yandex.hw4.model.Task;
import ru.yandex.hw4.service.Managers;
import ru.yandex.hw4.service.TaskManager;

public class Main {
    public static void main(String[] args) {

        TaskManager taskManager = Managers.getDefault();

        System.out.println(taskManager.getHistory());

        Task task = new Task("test 1");
        Task task2 = task;
        Task task3 = task;
        task3.setName("test 1_2");

    }
}
