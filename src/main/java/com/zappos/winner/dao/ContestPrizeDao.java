package com.zappos.winner.dao;

import com.zappos.winner.model.ContestPrize;
import org.springframework.data.repository.CrudRepository;

/**
 * Created with IntelliJ IDEA.
 * User: akang
 * Date: 12/4/14
 * Time: 2:28 PM
 * To change this template use File | Settings | File Templates.
 */
public interface ContestPrizeDao extends CrudRepository<ContestPrize, Long> {
}
