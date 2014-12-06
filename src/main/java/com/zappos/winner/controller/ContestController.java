package com.zappos.winner.controller;

import com.zappos.winner.model.Contest;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: akang
 * Date: 12/4/14
 * Time: 12:45 PM
 * To change this template use File | Settings | File Templates.
 */
public interface ContestController {
    public Iterable<Contest> getAllContests();
    public Contest getContest(final long contestId);
    public void insertContest(Contest contest);
    public void updateContest(Contest contest);
    public void deleteContest(final long contestId);
}
