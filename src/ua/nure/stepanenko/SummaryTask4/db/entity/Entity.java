package ua.nure.stepanenko.SummaryTask4.db.entity;

public abstract class Entity {
    protected long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
