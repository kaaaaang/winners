package com.zappos.winner.controller;

import com.zappos.winner.dao.ContestPrizeDao;
import com.zappos.winner.model.ContestPrize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: akang
 * Date: 12/5/14
 * Time: 4:00 PM
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping("contestPrize")
public class ContestPrizeController {
    @Autowired
    private ContestPrizeDao contestPrizeDao;

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public void updateContestPrize(@RequestBody ContestPrize contestPrize) {
        contestPrizeDao.save(contestPrize);
    }

}
