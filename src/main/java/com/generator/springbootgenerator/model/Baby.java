package com.generator.springbootgenerator.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author lqs
 */
public class Baby implements Serializable {

    /**
     * id : 0
     * name :
     * sex : false
     * birthday : 2020-10-12
     */

    private Long id;
    private String name;
    private boolean sex;
    private Date birthday;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
