package week1;

/**
 * Created by mark on 19/03/17.
 */
public class Task {



    private String taskName;

    public String getTaskName() {
        return taskName;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("The outcome of the task ");
        sb.append(getTaskName());
        sb.append(" is: ");
        return  sb.toString();
    }
}
