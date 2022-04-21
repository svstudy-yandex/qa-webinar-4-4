package ru.yandex.hw4.service;

import ru.yandex.hw4.model.Task;

import java.util.List;

public class InMemoryHistoryManager implements HistoryManager {
    // first, last

    @Override
    public List<Task> getHistory() {
        //...
        return null;
    }

    @Override
    public void add(Task task) {
        //...
    }

    @Override
    public void remove(int id) {
        //...
    }

    private Node linkLast(Task task) {
        // создаёт новый Node c task и кладет в конец списка
        // учесть случай, когда список пуст
        //...
        return null;
    }

    private void removeNode(Node node) {
        // удаляет node из списка (самый сложный метод)
        // учесть 3 случая (node в начале, в середине и в конце), иначе будут NullPointerException
        //...
    }

    public static class Node {
        // task, prev, next
    }

}
