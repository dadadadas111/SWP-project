
package model;

import java.util.Date;

public class BaseModel {
    
    int id;
    Date created_at;
    Date updated_at;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    @Override
    public String toString() {
        return "BaseModel{" + "id=" + id + ", created_at=" + created_at + ", updated_at=" + updated_at + '}';
    }
}
