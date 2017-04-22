package net.art.pof.rest;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "history")
public class HistoryEntry {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "request_date")
    private Date requested;

    @Column(name = "user_agent")
    private String agent;

    @Column(name = "data")
    private String data;

    public HistoryEntry() {}

    public HistoryEntry(Date requested, String agent, String data) {
        this.requested = requested;
        this.agent = agent;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public Date getRequested() {
        return requested;
    }

    public String getAgent() {
        return agent;
    }

    public String getData() {
        return data;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setRequested(Date requested) {
        this.requested = requested;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "HistoryEntry{" +
                "id=" + id +
                ", requested=" + requested +
                ", agent='" + agent + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
