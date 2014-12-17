
package ua.artcode.week5.day1;


public enum  ProjectTrackingPriority {
    //final static ProjectTrackingPriority MINOR = new ProjectTrackingPriority ();
    //final static ProjectTrackingPriority MAJOR = new ProjectTrackingPriority ();
    MINOR (3, "not important task"), MAJOR(8, "very important task");
    //0                                 1
    //MINOR                             MAJOR

    private Integer range;

    private String desc;


    //final static ProjectTrackingPriority MINOR = new ProjectTrackingPriority ();

    private ProjectTrackingPriority(Integer range, String desc) {
        this.range = range;
        this.desc = desc;
    }

    private ProjectTrackingPriority() {
    }

    public Integer getRange() {
        return range;
    }

    public String getDesc() {
        return desc;
    }


    @Override
    public String toString() {
        return "ProjectTrackingPriority{" +
                "range=" + range +
                ", desc='" + desc + '\'' +
                '}';
    }
}

