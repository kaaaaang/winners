package com.zappos.winner.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: akang
 * Date: 12/4/14
 * Time: 12:37 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "contest")
public class Contest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int eventId;

    @OneToMany(mappedBy = "contest")
    private Set<ContestPrize> contestPrizes;

    private String redemptionInstructions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public Set<ContestPrize> getContestPrizes() {
        return contestPrizes;
    }

    public void setContestPrizes(Set<ContestPrize> contestPrizes) {
        this.contestPrizes = contestPrizes;
    }

    public String getRedemptionInstructions() {
        return redemptionInstructions;
    }

    public void setRedemptionInstructions(String redemptionInstructions) {
        this.redemptionInstructions = redemptionInstructions;
    }
}
