package com.sholy.bsam.bsamtaskmangr2018.TaskFragment.Data;

import java.util.Date;

public class MyTask {
    private String Key; // have to be in each project
    private String Title;
    private String Text;
    private int Important;
    private int Nesesary;
    private Date CreatedAt;
    private Date DueDate;
    private String Owner;


    public MyTask() {
    }

    public String getKey() {
        return Key;
    }

    public void setKey(String key) {
        Key = key;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public int getImportant() {
        return Important;
    }

    public void setImportant(int important) {
        Important = important;
    }

    public void setNesesary(int nesesary){Nesesary = nesesary;}

    public int getNesesary(){return Nesesary;}

    public Date getCreatedAt() {
        return CreatedAt;
    }

    public void setCreatedAt(Date createdAt) {
        CreatedAt = createdAt;
    }

    public Date getDueDate() {
        return DueDate;
    }

    public void setDueDate(Date dueDate) {
        DueDate = dueDate;
    }


    @Override
    public String toString() {
        return "MyTask{" +
                "Key='" + Key + '\'' +
                ", Title='" + Title + '\'' +
                ", Text='" + Text + '\'' +
                ", Important=" + Important +
                ", CreatedAt=" + CreatedAt +
                ", DueDate=" + DueDate +
                '}';
    }
    public void setOwner(String Owner)
    {
        this.Owner=Owner;
    }
}

