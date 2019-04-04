package lanse505.aced.common;

import lanse505.aced.common.base.Requirement;
import lanse505.aced.common.base.Task;

import java.util.ArrayList;
import java.util.List;

public class ACEDHolder {
    private static List<Task> targets = new ArrayList<>();

    public ACEDHolder(){}

    public void registerTask(Task task) {

    }

    public static List<Task> getTargets() {
        return targets;
    }
}
