package ru.yandex.hw4;

import ru.yandex.hw4.service.Managers;
import ru.yandex.hw4.service.TaskManager;

public class Main {
    public static void main(String[] args) {

        TaskManager taskManager = Managers.getDefault();

        System.out.println(taskManager.getHistory());

    }
}
