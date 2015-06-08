package com.gruppe2.Event.Objects;

import com.gruppe2.Event.Exceptions.ParamMissingException;
import com.gruppe2.Event.Exceptions.WrongDateException;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by myles on 20.05.15.
 */
public class Event {
    private Integer id;
    private String name;
    private Date dateEnd;
    private Date dateStart;
    private String description;
    private ArrayList<Session> sessions;

    public Event(String name, Date startDate, Date endDate, String description)throws ParamMissingException {

        if (controlParameter(name)) throw new ParamMissingException("Veranstaltungsname");
        this.name = name;
        this.dateEnd = endDate;
        this.dateStart = startDate;
        this.description = description;
        this.sessions = new ArrayList<Session>();
    }
    public Event(){

    }
    public Integer getId() {
        return id;
    }

    public void setID(Integer id) throws ParamMissingException {
        if (controlParameter(((Integer) id).toString())) throw new ParamMissingException("424");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws ParamMissingException {
        if (controlParameter(name)) throw new ParamMissingException("425");
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }

    public Date getEndDate() {
        return dateEnd;
    }

    public void setEndDate(Date endDate) throws ParamMissingException {

        if (endDate == null ){
            throw new ParamMissingException("427");
        }
        else
        {
            this.dateEnd = endDate;
        }
    }

    public Date getStartDate() {
        return dateStart;
    }

    public void setStartDate(Date startDate) throws ParamMissingException {

        if (startDate == null ){
            throw new ParamMissingException("426");
        }
        else {
            this.dateStart = startDate;
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Session> getSessions() {
        return sessions;
    }

    public void setSessions(ArrayList<Session> sessions) {
        this.sessions = sessions;
    }
    public void addSessions(Session session) {
        this.sessions.add(session);
    }
    public boolean controlParameter (String param){
        //String name,String location,String description
        if (param.toString().equalsIgnoreCase("")) return true;
        return false;
    }

}
