package com.example.Spring_Project.com.example.Spring_Project.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Document(collection="UserTable")
public class Item
{

    @Id
    private String userId;



    private String item;
//
    private Long qty;
//
    private ArrayList<String> tags;
//
    private Measurement size;
//
    public String getUserId() {
        return userId;
    }
//
    public void setUserId(String userId) {
        this.userId = userId;
    }
//
    public String getItem() {
        return item;
    }
//
    public void setItem(String item) {
        this.item = item;
    }
//
    public Long getQty() {
        return qty;
    }
//
    public void setQty(Long qty) {
        this.qty = qty;
    }
//
    public ArrayList<String> getTags() {
        return tags;
    }
//
    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }
//
    public Measurement getSize() {
        return size;
    }
//
    public void setSize(Measurement size) {
        this.size = size;
    }
//
@Override
public String toString() {
    return "Item{" +
            "userId='" + userId + '\'' +
            ", item='" + item + '\'' +
            ", qty=" + qty +
            ", tags=" + tags +
            ", size=" + size +
            '}';
}



}
