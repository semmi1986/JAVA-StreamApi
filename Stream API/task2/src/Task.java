import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Task {
    private final Integer id;

    private final String title;

    private final  TaskType type;

    private final LocalDate createdOn;


    private boolean done = false;

    private Set<String> tags = new HashSet<>();

    private LocalDate dueOn;

    public Task(Integer id, String title, TaskType type, LocalDate createdOn) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.createdOn = createdOn;
    }


    public Task addTag(String tag){
        this.tags.add(tag);
        return this;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public TaskType getType() {
        return type;
    }

    public LocalDate getCreatedOn() {
        return createdOn;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Set<String> getTags() {
        return tags;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }

    public LocalDate getDueOn() {
        return dueOn;
    }

    public void setDueOn(LocalDate dueOn) {
        this.dueOn = dueOn;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", type=" + type +
                ", createdOn=" + createdOn +
                '}';
    }
}
