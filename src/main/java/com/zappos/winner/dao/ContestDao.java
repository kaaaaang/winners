package com.zappos.winner.dao;

import com.zappos.winner.model.Contest;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: akang
 * Date: 12/4/14
 * Time: 2:27 PM
 * To change this template use File | Settings | File Templates.
 */
public interface ContestDao extends CrudRepository<Contest, Long> {

}
