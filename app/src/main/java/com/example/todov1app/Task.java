package com.example.todov1app;

import java.io.Serializable;

public class Task implements Serializable {
    String name, description;
    int    priority;

    public Task(String name, String description, int priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;
    }

    public void prioritize() { priority++; }
    public int getPriority() { return priority; }

    public String getPrioAsString(int prio) {
        if (prio == 1)
            return "Low";
        if (prio == 2)
            return "Medium";

        return "High";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return getName();
    }
}
