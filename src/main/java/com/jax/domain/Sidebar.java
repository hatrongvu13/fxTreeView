package com.jax.domain;

import java.io.Serializable;

public class Sidebar implements Serializable {
    private int id;
    private String name;
    private String icon;
    private String iconChosen;
    private int parentId;

    public Sidebar() {
    }

    public Sidebar(int id, String name, String icon, String iconChosen, int parentId) {
        this.id = id;
        this.name = name;
        this.icon = icon;
        this.iconChosen = iconChosen;
        this.parentId = parentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIconChosen() {
        return iconChosen;
    }

    public void setIconChosen(String iconChosen) {
        this.iconChosen = iconChosen;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
