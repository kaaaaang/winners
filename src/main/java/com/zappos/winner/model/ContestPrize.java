package com.zappos.winner.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Parent;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: akang
 * Date: 12/4/14
 * Time: 12:38 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "contest_prize")
public class ContestPrize {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name="contest_id")
    private Contest contest;

    private String prizeName;

    private double prizeValue;

    private int winnerEmployeeId;

    private String winnerName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrizeName() {
        return prizeName;
    }

    public void setPrizeName(String prizeName) {
        this.prizeName = prizeName;
    }

    public double getPrizeValue() {
        return prizeValue;
    }

    public void setPrizeValue(double prizeValue) {
        this.prizeValue = prizeValue;
    }

    public int getWinnerEmployeeId() {
        return winnerEmployeeId;
    }

    public void setWinnerEmployeeId(int winnerEmployeeId) {
        this.winnerEmployeeId = winnerEmployeeId;
    }

    public String getWinnerName() {
        return winnerName;
    }

    public void setWinnerName(String winnerName) {
        this.winnerName = winnerName;
    }

    public Contest getContest() {
        return contest;
    }

    public void setContest(Contest contest) {
        this.contest = contest;
    }
}
