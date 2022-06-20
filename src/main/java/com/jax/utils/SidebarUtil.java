package com.jax.utils;

import com.jax.domain.Sidebar;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

import java.util.ArrayList;
import java.util.List;

public class SidebarUtil {
    public void renderSidebar(List<Sidebar> sidebars, TreeView treeView) {
        if (sidebars.size() < 1) {
            sidebars = initSidebar();
        }
    }

    private TreeItem getRootItem(List<Sidebar> sidebars) {
        for (Sidebar sidebar : sidebars) {
            if (sidebar.getParentId() == sidebar.getId()) return new TreeItem(sidebar);
        }
        return null;
    }

    private void addChildrenItem(List<Sidebar> sidebars, TreeView treeView, getRootItem()) {
        for (Sidebar sidebar : sidebars) {
            if (sidebar.getId() == )
        }
    }

    private List<Sidebar> initSidebar() {
        List<Sidebar> sidebars  = new ArrayList<>();
        sidebars.add(new Sidebar(0, "Root", "root", "root_chosen", 0));
        sidebars.add(new Sidebar(1, "Item", "root", "root_chosen", 0));
        sidebars.add(new Sidebar(2, "Item", "root", "root_chosen", 0));
        sidebars.add(new Sidebar(3, "Item", "root", "root_chosen", 0));
        sidebars.add(new Sidebar(4, "Item", "root", "root_chosen", 0));
        sidebars.add(new Sidebar(5, "Item 1 - 1", "root", "root_chosen", 1));
        sidebars.add(new Sidebar(6, "Item 1 - 2", "root", "root_chosen", 1));
        sidebars.add(new Sidebar(7, "Item 1 - 3", "root", "root_chosen", 1));
        sidebars.add(new Sidebar(8, "Item 1 - 4", "root", "root_chosen", 1));
        return sidebars;
    }
}
