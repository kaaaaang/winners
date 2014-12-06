package com.zappos.winner.controller;

import com.zappos.winner.dao.ContestDao;
import com.zappos.winner.dao.ContestPrizeDao;
import com.zappos.winner.model.Contest;
import com.zappos.winner.model.ContestPrize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: akang
 * Date: 12/4/14
 * Time: 12:35 PM
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping("contest")
public class ContestControllerImpl implements ContestController {
    @Autowired
    private ContestDao contestDao;

    @Autowired
    private ContestPrizeDao contestPrizeDao;

    @RequestMapping(value = "test")
    public String helloWorld() {
        return "Hello World";
    }

    @Override
    @RequestMapping(value = "", method = RequestMethod.GET)
    public Iterable<Contest> getAllContests() {

        Iterable<Contest> contests = contestDao.findAll();
        for(Contest contest : contests) {
            for(ContestPrize contestPrize : contest.getContestPrizes()) {
                contestPrize.setContest(null);
            }
        }

        return contests;
    }

    @Override
    @RequestMapping(value = "/{contestId}", method = RequestMethod.GET)
    public Contest getContest(@PathVariable final long contestId) {
        return contestDao.findOne(contestId);
    }

    @Override
    @RequestMapping(value = "", method = RequestMethod.POST)
    public void insertContest(@RequestBody Contest contest) {
        Contest insertedContest = contestDao.save(contest);
        Set<ContestPrize> contestPrizes = contest.getContestPrizes();
        if(contestPrizes != null) {
            for(ContestPrize contestPrize : contestPrizes) {
                contestPrize.setContest(insertedContest);
            }
            contestPrizeDao.save(contestPrizes);
        }
    }

    @Override
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public void updateContest(@RequestBody Contest contest) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteContest(final long contestId) {
        //To change body of implemented methods use File | Settings | File Templates.
    }


}
