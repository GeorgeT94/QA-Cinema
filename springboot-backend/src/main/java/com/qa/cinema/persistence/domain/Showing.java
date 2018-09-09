package com.qa.cinema.persistence.domain;

import javax.persistence.*;

@Entity
public class Showing {
    
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
    @Column
    private Integer showingId;
    @Column
    private String showingTime;
    @Column
    private Integer showingTMDB;



    public Showing(String showingTime, Integer showingTMDB) {
		this.showingTime = showingTime;
		this.showingTMDB=showingTMDB;
	}

	public Integer getShowingId() {
        return showingId;
    }

    public void setShowingId(Integer showingId) {
        this.showingId = showingId;
    }

    public String getShowingTime() {
        return showingTime;
    }

    public void setShowingTime(String showingTime) {
        this.showingTime = showingTime;
    }

    public Integer getShowingTMDB() {
        return showingTMDB;
    }

    public void setShowingTMDB(Integer showingTMDB) {
        this.showingTMDB = showingTMDB;
    }

    public Showing() {
    }


}
