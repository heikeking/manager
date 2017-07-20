package cn.dishenghk.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * Created by zuozhiyuan on 2017/7/7.
 */
@Entity
public class Scheduledtask {
    private Integer id;
    private String taskType;
    private Timestamp scheduledUtc;

    @Basic
    @Column(name = "Id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "TaskType")
    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    @Basic
    @Column(name = "ScheduledUtc")
    public Timestamp getScheduledUtc() {
        return scheduledUtc;
    }

    public void setScheduledUtc(Timestamp scheduledUtc) {
        this.scheduledUtc = scheduledUtc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Scheduledtask that = (Scheduledtask) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (taskType != null ? !taskType.equals(that.taskType) : that.taskType != null) return false;
        if (scheduledUtc != null ? !scheduledUtc.equals(that.scheduledUtc) : that.scheduledUtc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (taskType != null ? taskType.hashCode() : 0);
        result = 31 * result + (scheduledUtc != null ? scheduledUtc.hashCode() : 0);
        return result;
    }
}
